package cap02_fundamentosLinguagem;

public class IncrementoDecremento {
    public static void main(String[] args) {
        int idade = 10;
        int novaIdade = idade++;

        System.out.println("Idade: " + idade);
        System.out.println("Nova idade: " + novaIdade);

        System.out.println();
        novaIdade = ++idade;
        System.out.println("Idade: " + idade);
        System.out.println("Nova idade: " + novaIdade);
    }
}