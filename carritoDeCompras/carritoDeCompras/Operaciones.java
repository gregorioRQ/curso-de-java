package carritoDeCompras;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Statement;
public class Operaciones {

	Conexion conn = new Conexion();
	public void agregarCliente(){	
			Scanner teclado = new Scanner(System.in);

			System.out.println("Nombre del cliente");
			String nomCli  = teclado.nextLine();

			System.out.println("año de nacimiento");
			int nacCli = teclado.nextInt(); 

			String sql = "insert into cliente(nomCli, nacCli) values ('"+nomCli+"','"+nacCli+"')";
			try{
				
				Statement s=(Statement) conn.conectar().createStatement();
				int m = s.executeUpdate(sql); 
				if (m == 1)
					System.out.println("Se realizo correctamente la insercion");
				else
					System.out.println("fallo la insercion");
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	
	public void mostrarClientes() {
		try{    	
	    	  Statement s=(Statement) conn.conectar().createStatement();    
	    	  ResultSet rs=s.executeQuery("select * from cliente");  
	    	 
	    	  while(rs.next()){
	    		 
	    	     System.out.println("Id cliente => "+rs.getInt("id")+" - " +rs.getString("nomCli")); 
	    	  }
	    	 
	    	}
	    	catch(Exception e)
	    	{
	    	   e.printStackTrace();
	    	}
	}
	
	public void eliminarCliente() {
		 Scanner sc = new Scanner(System.in);

	        System.out.println("num de id del cliente a borrar");
	        int numId  = sc.nextInt(); 
	        
	        String sql ="DELETE FROM cliente WHERE id = '"+numId+"'";          
	        try {         	    	        	
	            Statement sentencia = (Statement) conn.conectar().createStatement();
	            sentencia.execute(sql);   
	            System.out.println("El cliente se elimino correctamente!");
	        } catch (Exception e) {  
	          e.printStackTrace();
	          System.out.println("Error en el borrado del registro!!");
	        }
	      
	}
	
}

