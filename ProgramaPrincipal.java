// Classe principal para testar
public class ProgramaPrincipal {
    public static void main(String[] args) {
        // Criando um objeto da subclasse
        Cachorro cachorro = new Cachorro("Rex");

        // Chamando o método sobrescrito
        cachorro.fazerSom(); // Saída esperada: Rex diz: Au au!
    }
}