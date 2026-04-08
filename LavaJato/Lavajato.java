package Lavajato;
import java.util.ArrayList;
import java.util.List;
// list =  array pagina 211 do caelum
public class Lavajato {
    private List<Atendimento> atendimentos = new ArrayList<>();
    public void atender(String servico, Veiculo veiculo) {
        Atendimento novo = new Atendimento(servico, veiculo);
        atendimentos.add(novo);
        System.out.println("Atendimento adicionado: " + servico);
    }

    public void executar_proximo_servico() {
        if (atendimentos.isEmpty()) {
            System.out.println("Nenhum atendimento na fila.");
        }
        Atendimento atual = atendimentos.remove(0);
        System.out.println("Executando serviço: " + atual.getServico() + " no veículo placa: " + atual.getVeiculo().getPlaca());
    }
}