package coneccion;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Coneccion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		    Class.forName("com.mysql.jdbc.Driver");
		    DriverManager.getConnection("jdbc:mysql://localhost:3306/qatar2022","root","123456789");
		    System.out.println("Conexion exitosa!!");
		    
		}catch (ClassNotFoundException e){
		    System.out.println("Error al cargar el controlador!!!!");
		    e.printStackTrace();
		    
		}catch (SQLException e){
		    System.out.println("Error en la conexion!!!!");
		    e.printStackTrace();
		}
	}

}
