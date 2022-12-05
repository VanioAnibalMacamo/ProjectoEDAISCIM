
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Vanio Anibal Macamo
 */
public class ConnectionFactory {
   

    
     private static final String Driver ="com.mysql.cj.jdbc.Driver";
     
    public static Connection getConnection(){
        
        try {
            
            Class.forName(Driver);
            
            //return DriverManager.getConnection(url, user, pass);
            return  DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/rent_car_eda?useTimezone=true&serverTimezone=UTC","root","");
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("erro na conexao", ex);
        }
        
    }
    
    public static void closeConnection(Connection con){
        if(con!=null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro: "+ex);
            }
        }
    }
    public static void closeConnection(Connection con, PreparedStatement stmt){
        
        if(stmt!=null){
            try {
                stmt .close();
            } catch (SQLException ex) {
                System.err.println("Erro: "+ex);
            }
        }
        closeConnection(con);
    }
        public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Erro: "+ex);
            }
        }
        closeConnection(con,stmt);
    }
    
}
