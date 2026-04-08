package Funcionario;
public class Assistente extends Funcionarios{
    private String matricula;
    public Assistente(String matricula, Funcionarios f) {
        super(f.getNome(),f.getSalario());
        this.matricula = matricula;
    }
// get e set
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    @Override
    public void exibeDados(){
        System.out.println("Nome: "+ getNome() +"\n Salario atual: R$"+ getSalario() +"\n Matricula: "+ getMatricula());
    }
    
}
