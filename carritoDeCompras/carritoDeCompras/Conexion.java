package carritoDeCompras;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	public Connection conectar() {
		//INICIAR LA CONECCION:
		Connection conection = null;
		  try{ Class.forName("com.mysql.jdbc.Driver");
		  conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/super","root",
		  "123456789");
		  
		  }catch (ClassNotFoundException e){
		  System.out.println("Error al cargar el controlador!!!!");
		  //e.printStackTrace();
		  
		  }catch (SQLException e){ System.out.println("Error en la conexion!!!!");}			  
	
	return conection;
}
}
