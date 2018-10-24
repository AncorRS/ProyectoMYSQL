package conecta;
import java.sql.*;

public class Conexion {

	private String host;
	private String bd;
	private String usr;
	private String clave;
	private static Connection conexion;
	
public static Connection conectar(String host, String bd, String usr, String clave){
		
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://" +host +bd;
			DriverManager.getConnection(url, usr, clave);
			System.out.println("CONECTADO A LA BASE DE DATOS");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
			
		}
		return conexion;
}
	
}
