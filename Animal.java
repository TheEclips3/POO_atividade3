package Animal;

public class Animal {
    private String nome;
    private String raca;
// constructors
    public Animal() {
    }
        public Animal(String nome) {
        this.nome = nome;
    }
// getters e setters 
    public String getNome() { 
        return nome; }
    public void setNome(String nome) {
         this.nome = nome; }
    public String getRaca() {
         return raca; }
    public void setRaca(String raca) {
         this.raca = raca; }

    public String caminha() {
        return nome + " está caminhando.";
    }
}
