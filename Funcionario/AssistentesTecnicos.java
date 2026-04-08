package Funcionario;
public class AssistentesTecnicos extends Assistente{
    private double bonusSalarial;
    public AssistentesTecnicos(double bonusSalarial,Assistente as){
        super(as.getMatricula(),as);
        setBonusSalarial(bonusSalarial);
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
        setAnual((getSalario()+getBonusSalarial())*12);
        System.out.println(getAnual());
    }
}
