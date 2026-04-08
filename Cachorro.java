package Animal;

public class Cachorro extends Animal {

    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    public String late() {
        return getNome() + " diz: Au au!";
    }
}
