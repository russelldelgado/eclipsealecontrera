package conexion;
import java.sql.SQLException;
import java.sql.*;

public class Conexion {
	// JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jc.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost:3306/";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "R.delgado7";
	
    private static Connection conn = null;
    //patrón singleton, instancia única
    private Conexion () throws ClassNotFoundException {
        try {

            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
         }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
            }
            
    }
    public static Connection getConexion (){
        if (conn == null) {
            try {
				new Conexion();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        return conn;
    }

    //ESTO ES PARA EL CIERRE DE LA CONEXION

    public static void cierreConexion() {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Cerrando la conexión");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}