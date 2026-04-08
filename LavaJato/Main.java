package Lavajato;
public class Main {
    public static void main(String[] args) {
        Lavajato lavajato = new Lavajato();
        // veiculo do vovo e moto do padrim
        Veiculo carroDoVovo = new CarroDePasseio("Preto", "ASC-2093");
        Veiculo motoDoPadrim = new Motocicleta("Vermelha", "IJJ-1287");
        
        // lavajato
        lavajato.atender("Lavagem completa", carroDoVovo);
        lavajato.atender("Lavagem simples", motoDoPadrim);
        lavajato.executar_proximo_servico();
        lavajato.executar_proximo_servico();
    }
}