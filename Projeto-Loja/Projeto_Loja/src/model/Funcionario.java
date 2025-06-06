public class Funcionario {

    private String nome;
    private String cargo;
    private String telefone;
    private int idade;
    private Double salario;
    
    public Funcionario(String nome, String cargo, String telefone, int idade, Double salario) {

        this.nome = nome;
        this.cargo = cargo;
        this.telefone = telefone;
        this.idade = idade;
        this.salario = salario;
    }
    public Funcionario(){
        super();
    }
    public String getNome() {return nome; }

    public void setNome(String nome) {this.nome = nome;}

    public String getCargo() {return cargo; }

    public void setCargo(String cargo) {this.cargo = cargo;}

    public String getTelefone() {return telefone;}

    public void setTelefone(String telefone) {this.telefone = telefone; }

    public int getIdade() {return idade;}

    public void setIdade(int idade) {this.idade = idade;}

    public Double getSalario() {return salario;}

    public void setSalario(Double salario) { this.salario = salario;}


}
