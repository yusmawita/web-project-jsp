/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

/**
 *
 * @author Jefry
 */
import java.sql.*;

public class koneksi {
    private Connection con;
    private Statement stmt;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    
    public Connection connect() throws ClassNotFoundException, SQLException{
        String driver="net.sourceforge.jtds.jdbc.Driver";
        String url="jdbc:jtds:sqlserver://localhost:1433/db_dining;instance=SQLEXPRESS";
        Class.forName(driver);
        con=DriverManager.getConnection(url);
        stmt=con.createStatement();
        return con;
    }
    
    public ResultSet executeQuery(String str) throws SQLException{
        
        try{
            resultSet=stmt.executeQuery(str);
        return resultSet;
        }
        catch(SQLException e){
            e.printStackTrace();
            return resultSet;
        }
        
        
        
    }
    
    public int updateQuery(String str) throws SQLException{
                
        try{
        preparedStatement = con.prepareStatement(str);
        return preparedStatement.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
            return preparedStatement.executeUpdate();
        }
    }
    
    public void disconnect() throws SQLException{
        if(resultSet!=null) resultSet.close();
        if(stmt!=null) stmt.close();
        if(con!=null) con.close();
    }
    
    
    
}
