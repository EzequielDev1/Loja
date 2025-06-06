package connection;

public class ConnectionDataBase {

    private static final String DrIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/projeto_loja";
    private static final String USER = "root";
    private static final String PASSWORD = "ezequiel2007";

    public Connection Conexao (){
        Connection connection = null;
        try {
            Class.forName(DrIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexão realizada com sucesso!");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        return connection;  
    }
}
