package dao;
 import java.sql.Connection;
 import java.sql.PreparedStatement;
 import java.sql.SQLException;
 import java.util.ArrayList;
 import connection.ConnectionDataBase;
 import model.Funcionario;
public class FuncionarioDao {

    public void cadastrarFuncionario(Funcionario funcionario) {
        Connection conexao = ConnectionDataBase.Conexao();
        PreparedStatement stmt = null;
        try{
            stmt = conexao.preparedStatement(Insert Into Funcionario (nome,idade,telefone,salario,cargo) values (?, ?, ?, ?, ?));
            stmt.setstring(1, funcionario.getNome());
            stmt.setString(2,funcionario.getcargo());
            stmt.setString(3, fcuncionario.gettelefone());
            stmt.setint(4, funcionario.getidade());
            stmt.setDouble(5,funcioanrio.getSalario());
            stmt.executeQuery();    
            System.out.println("Funcionario cadastrado com sucesso!");

        }catch (SQLException e) {
            System.err.println("Erro ao cadastrar funcionário: " + e.getMessage());
        } finally {
            conexao.fecharConexao(conexao, stmt);
        }
       }

    public ArrayList<?> listarFuncionarios() {
        
        return null;
    }
    public void atualizarFuncionario(Funcionario funcionario) {
        
    }
    public void excluirFuncionario(int id) {
        
    }

}
