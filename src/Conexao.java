import java.sql.Connection;
import java.sql.DriverManager;

import.java.sql.DriverManager;
public class Conexao {
    public static Connection getConnection(){
        try{
            String url = "jdbc:mysql:  //localhost:3306/cadastro";
            String user = "MARIA_4494";
            String password= "dudaj.linda";
            return DriverManager.getConnection(url, user, password);
        } catch (Exception e){
            throw new RuntimeException("Erro na conexão: " + e.getMessage());
        }
    }
}
