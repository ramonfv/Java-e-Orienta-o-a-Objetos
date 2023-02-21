import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSql {
    public Connection getConnection(){
            try {
                return DriverManager.getConnection(
                        "jdbc:sqlserver://local:1433;databaseName=ContasBancarias;integratedSecurity=true"
                );
           } catch (SQLException e){
                throw new RuntimeException(e);
            }
    }

}