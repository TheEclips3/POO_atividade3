package Funcionario;
public class Funcionarios {
    private String nome;
    private double salario;
    private double anual;    
//get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario<0){
         salario = 0;
        }
        this.salario = salario;
    }

    public double getAnual() {
        return anual;
    }
    public void setAnual(double anual) {
        this.anual = anual;
    }
    //constructor
    public Funcionarios(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    public double addAumento(double valor){
        if (valor<0){
            valor = 0;
        }       
        return (salario= salario+ valor);    
    }
    public void ganhoAnual(){
        this.anual= this.salario*12;
        System.out.println(this.anual);
    }
    public void exibeDados(){
        System.out.println("Nome: "+nome+"\n Salario atual: R$"+salario);
    }
}
