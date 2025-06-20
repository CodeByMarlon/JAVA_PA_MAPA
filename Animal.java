// Classe base (superclasse)
public class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void fazerSom() {
        System.out.println("O animal faz um som");
    }
}