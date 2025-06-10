package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
// Importando as classes necessárias para a conexão com o banco de dados
// Classe da conexão com o banco de dados
public class ConnectionDataBase {

    private static final String DrIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/Loja";
    private static final String USER = "root";
    private static final String PASSWORD = "ezequiel2007";

    public static Connection getConnection (){
        Connection con = null;
        try {
            Class.forName(DrIVER);
        
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexão realizada com sucesso!");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        return con;
    }

// Métodos para fechar a conexão com o banco de dados abaixo!

    public static  void fecharConexao(Connection con) {
        if (con != null) {
            try {
                con.close();
                System.out.println("Conexão fechada com sucesso!");
            } catch (SQLException e) {
                System.err.println("Erro ao fechar a conexão: " + e.getMessage());
            }
    
        }
    }

    public static void fecharConexao(Connection con, PreparedStatement stmt) {
        fecharConexao(con);
        if (stmt != null) {
            try {
                stmt.close();
                System.out.println("Statement fechado com sucesso!");
            } catch (SQLException e) {
                System.err.println("Erro ao fechar o statement: " + e.getMessage());
            }
        }
        
    }

    public static void fecharConexao(Connection con, PreparedStatement stmt, ResultSet rs) {
        fecharConexao(con,stmt);
        if (rs != null) {

            try {
                rs.close();
                System.out.println("ResultSet fechado com sucesso!");
            } catch (SQLException e) {
                System.err.println("Erro ao fechar o ResultSet: " + e.getMessage());
            }
        }
        
    }
}
