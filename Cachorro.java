// Classe derivada (subclasse)
public class Cachorro extends Animal {

    // Construtor da subclasse chama o construtor da superclasse
    public Cachorro(String nome) {
        super(nome); // reutiliza a lógica da superclasse
    }

    // Sobrescreve o método fazerSom()
    @Override
    public void fazerSom() {
        System.out.println(nome + " diz: Au au!");
    }
}