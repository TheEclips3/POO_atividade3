package Lavajato;

public class Atendimento {
    private String servico;
    private Veiculo veiculo;

    public Atendimento(String servico, Veiculo veiculo) {
        this.servico = servico;
        this.veiculo = veiculo;
    }
// getter
    public String getServico() {
        return servico;}

    public Veiculo getVeiculo() {
        return veiculo;}
}