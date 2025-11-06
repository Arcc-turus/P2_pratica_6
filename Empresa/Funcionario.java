package Empresa;
public class Funcionario {
    protected String nome, cpf, dataNascimento;
    protected double salario;
    
    public Funcionario(String nome, String cpf, double salario, String dataNascimento) {
        this.nome = nome; this.cpf = cpf; this.salario = salario; this.dataNascimento = dataNascimento;
    }
    
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getDataNascimento() { return dataNascimento; }
    public double getSalario() { return this.salario; }
    
    public String toString() { 
        return "Nome: " + this.nome + ", CPF: " + this.cpf + ", Salário Base: " + this.salario; 
    }
}