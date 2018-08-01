package dbConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class DbConnection {
		
	 public static Connection getDBConnection() 
             throws ClassNotFoundException, SQLException {

      
       return SQLServerConnUtils_JTDS.getSQLServerConnection_JTDS();
      
       
   }
}	

