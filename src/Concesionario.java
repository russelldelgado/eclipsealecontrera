import java.sql.Connection;
import java.sql.SQLException;

import conexion.Conexion;

public class Concesionario {

	public static void main(String[] args) {
        Connection conexion = Conexion.getConexion();
		
        
        System.out.println(conexion.toString());
        System.out.println(conexion.toString());
        System.out.println(conexion.toString());
        System.out.println(conexion.toString());
        System.out.println(conexion.toString());
        System.out.println(conexion.toString());
        try {
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
}
