package Funcionario;
public class Main {
    public static void main(String[] args) {
//      Funcionario Fabio Leite, Assistente Tecnico com 400 de bonus salarial e com matricula de akdms12
        Funcionarios fabioLeite = new Funcionarios("Fabio Leite Pereira Guedes", 3000);
        Assistente fabioLeite_matricula = new Assistente("AKDMS_12", fabioLeite);
        AssistentesTecnicos fabioLeite_bonus = new AssistentesTecnicos(400.00, fabioLeite_matricula);
        System.out.println(fabioLeite_bonus.getNome()+" salario anual:");
        fabioLeite_bonus.ganhoAnual();
        
//      Funcionaria Andreia Oliveira, Assistente Administrativa do turno diurno, com matricula de qokwe76
        Funcionarios andreiaOliveira = new Funcionarios("Andreia Oliveira Camalês", 4000);
        Assistente andreiaOliveira_matricula = new Assistente("QOKWE76", andreiaOliveira);
        AssistentesAdministrativos andreiaOliveira_bonus = new AssistentesAdministrativos("diurno", 40, andreiaOliveira_matricula);
        System.out.println(andreiaOliveira_bonus.getNome()+" salario anual:");
        andreiaOliveira_bonus.ganhoAnual();
                
//      Funcionaria Yasmin Barbosa, Assistente Administrativa do turno noturno, com matricula khalifa
        Funcionarios yasminBarbosa = new Funcionarios("Yasmin Barbosa dos Santos", 4000);
        Assistente yasminBarbosa_matricula = new Assistente("KHALIFA", yasminBarbosa);
        AssistentesAdministrativos yasminBarbosa_bonus = new AssistentesAdministrativos("noite", 400, yasminBarbosa_matricula);
        System.out.println(yasminBarbosa_bonus.getNome()+" salario anual:");
        yasminBarbosa_bonus.ganhoAnual();
    }
    
}
    