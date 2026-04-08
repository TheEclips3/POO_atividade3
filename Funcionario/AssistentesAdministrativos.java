package Funcionario;
public class AssistentesAdministrativos extends Assistente{
    private String turno;
    private double bonusSalarial;
//get e set

    public AssistentesAdministrativos(String turno, double bonusSalarial, Assistente as) {
        super(as.getMatricula(),as);
        setTurno(turno);
        setBonusSalarial(bonusSalarial);
    }
    
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        turno = turno.toUpperCase().replaceAll("\\s", "");
        if (!turno.equals("NOTURNO") && !turno.equals("DIURNO") && !turno.equals("DIA") && !turno.equals("NOITE")){
            throw new IllegalArgumentException("Turno inválido");
        }
        this.turno = turno; 
    }
    public double getBonusSalarial() {
        return bonusSalarial;
    }
    public void setBonusSalarial(double bonusSalarial) {
        if (bonusSalarial<0){bonusSalarial = 0;}
        this.bonusSalarial = bonusSalarial;
    }
    
    @Override
    public void ganhoAnual(){
        if (turno.equals("NOTURNO")|| turno.equals("NOITE")){
            setAnual((getSalario()+getBonusSalarial())*12);
        }
        else{
            setAnual(12*(getSalario()));
        }
        System.out.println(getAnual());
    }
}
