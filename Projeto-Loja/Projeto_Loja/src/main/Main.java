
package main;
import java.util.Scanner;
import dao.FuncionarioDao;
import dao.Funcionario;

public class Main {
    public static void main(String[] args) {       
   Scanner scan  = new Scanner (System.in);
      FuncionarioDao funcionarioDao = new FuncionarioDao();
      Funcionario funcionario = new Funcionario();
       boolean continuar = true; 
       int opc ;   
       // Menu do sistema de gerenciamento de loja
       System.out.println("Bem-vindo ao sistema de gerenciamento de loja!");
       System.out.println("Selecione uma opcao:");
       do{
        System.out.println("1 - Cadastrar Funcionario");
        System.out.println("2 - Listar Funcionarios");
        System.out.println("3 - Atualizar Funcionario");
        System.out.println("4 - Excluir Funcionario");
        System.out.println("5 - Sair");
        opc = Integer.parseInt(scan.nextLine());

        switch(opc){
            case 1:
            // Inserindo Funcionario
                System.out.println("Opção 1 selecionada: Cadastrar Funcionário");
                System.out.println("Digite o nome do Funcioanario:");
                String nome = scan.next();
                funcionario.setNome(nome);

                System.out.println("Digite o cargo do Funcionatio:");
                String cargo = scan.next();
                funcionario.setCargo(cargo);
                System.out.println("Digite o telefone do Funcionario:");
                String telefone = scan.next();
                funcionario.setTelefone(telefone);
                System.out.println("Digita a idade do Funcionario:");
                int idade = scan.nextInt();
                funcionario.setIdade(idade);
                System.out.println("Digite o salário do Funcionario:"); 
                Double salario = scan.nextDouble();
                 funcionario.setSalario(salario);
                 // Método para Cadastrar Funcionario  
                funcionarioDao.cadastrarFuncionario(funcionario);
                

                break;
            case 2:
                System.out.println("Opção 2 selecionada: Listar Funcionários");
                // Aqui você pode chamar o método para listar funcionários
                break;
            case 3:
                System.out.println("Opção 3 selecionada: Atualizar Funcionário");
                // Aqui você pode chamar o método para atualizar funcionário
                break;
            case 4:
                System.out.println("Opção 4 selecionada: Excluir Funcionário");
                // Aqui você pode chamar o método para excluir funcionário
                break;
            case 5:
                System.out.println("Saindo do sistema...");
                continuar = false;
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
        }
       }while(continuar != false);
        scan.close();
    }

}