package Empresa;
public class Gerente extends Funcionario {
    public Gerente(String nome, String cpf, double salario, String dataNascimento) {
        super(nome, cpf, salario, dataNascimento);
    }

    @Override
    public double getSalario() { return this.salario + 2000.00; }

    @Override
    public String toString() { 
        return "[Gerente] " + super.toString() + ", Salário Final: " + this.getSalario(); 
    }
}
