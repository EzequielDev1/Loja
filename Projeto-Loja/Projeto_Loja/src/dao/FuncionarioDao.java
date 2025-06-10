package dao;
 import java.sql.Connection;
 import java.sql.PreparedStatement;
 import java.sql.SQLException;
 import java.util.ArrayList;
 import connection.ConnectionDataBase;

public class FuncionarioDao {



    public void cadastrarFuncionario(Funcionario funcionario) {  
        Connection con = ConnectionDataBase.getConnection();
        PreparedStatement stmt = null;
          try{
            stmt = con.prepareStatement("INSERT INTO funcionarios (nome, idade, telefone, salario, cargo) VALUES (?, ?, ?, ?, ?)");

          stmt.setString(1, funcionario.getNome());
            stmt.setInt(2, funcionario.getIdade());  // Corrigido para getIdade() com parênteses
            stmt.setString(3, funcionario.getTelefone());
            stmt.setDouble(4, funcionario.getSalario());
            stmt.setString(5, funcionario.getCargo());
            
            stmt.executeUpdate();
            
            System.out.println("Funcionário cadastrado com sucesso!"); 
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar funcionário: " + e.getMessage());
        }finally{
            ConnectionDataBase.fecharConexao(con, stmt);
        }
    }

    public static ArrayList<?> listarFuncionarios() {
        
        return null;
    }
    public static void atualizarFuncionario(Funcionario funcionario) {
        
    }
    public static void excluirFuncionario(int id) {
        
    }

}
