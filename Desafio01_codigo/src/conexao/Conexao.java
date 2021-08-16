package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//a classe conexao só serve para se conectar ao banco de dados.
public class Conexao {
    public Connection getConnection(){
        try{
          
          return DriverManager.getConnection("jdbc:mysql://localhost:3306/pesquisa","root","");
        
        }
        catch(SQLException erro){
            
           throw new RuntimeException(erro); 
            
        }
        
        
    
    }
    
    
}
