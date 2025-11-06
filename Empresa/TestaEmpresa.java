package Empresa;
import java.util.ArrayList;
import java.util.Scanner;

public class TestaEmpresa {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Gestão de Funcionários ---");
            System.out.println("1. Adicionar gerente");
            System.out.println("2. Adicionar atendente");
            System.out.println("3. Listar todos os funcionários");
            System.out.println("4. Mostrar salário de funcionário (por CPF)");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1": adicionarGerente(); break;
                case "2": adicionarAtendente(); break;
                case "3": listarFuncionarios(); break;
                case "4": mostrarSalarioPorCpf(); break;
                case "5":
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default: System.out.println("Opção inválida.");
            }
        }
    }

    private static void adicionarGerente() {
        System.out.print("Nome: "); String nome = scanner.nextLine();
        System.out.print("CPF: "); String cpf = scanner.nextLine();
        System.out.print("Salário Base: "); double salario = Double.parseDouble(scanner.nextLine());
        System.out.print("Data Nascimento (DD/MM/AAAA): "); String data = scanner.nextLine();
        listaFuncionarios.add(new Gerente(nome, cpf, salario, data));
        System.out.println("Gerente adicionado.");
    }

    private static void adicionarAtendente() {
        System.out.print("Nome: "); String nome = scanner.nextLine();
        System.out.print("CPF: "); String cpf = scanner.nextLine();
        System.out.print("Salário Base: "); double salario = Double.parseDouble(scanner.nextLine());
        System.out.print("Data Nascimento (DD/MM/AAAA): "); String data = scanner.nextLine();
        System.out.print("Comissão: "); double comissao = Double.parseDouble(scanner.nextLine());
        listaFuncionarios.add(new Atendente(nome, cpf, salario, data, comissao));
        System.out.println("Atendente adicionado.");
    }

    private static void listarFuncionarios() {
        if (listaFuncionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }
        System.out.println("\n--- Lista de Funcionários ---");
        for (Funcionario f : listaFuncionarios) { System.out.println(f.toString()); }
    }

    private static void mostrarSalarioPorCpf() {
        System.out.print("Digite o CPF do funcionário: ");
        String cpfBusca = scanner.nextLine();
        Funcionario funcionarioEncontrado = null;
        
        for (Funcionario f : listaFuncionarios) { 
            if (f.getCpf().equals(cpfBusca)) {
                funcionarioEncontrado = f;
                break; 
            }
        }
        if (funcionarioEncontrado != null) {
            System.out.println("Funcionário: " + funcionarioEncontrado.getNome());
            System.out.println("Salário Final: R$ " + funcionarioEncontrado.getSalario());
        } else {
            System.out.println("Funcionário com este CPF não encontrado.");
        }
    }
}