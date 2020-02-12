package cap02_fundamentosLinguagem;

import java.util.Scanner;

public class EstruturaDeControle {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Informe seu peso: ");
        int peso = entrada.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.print("Oi " + nome + ". ");
        System.out.println("Seu IMC é: " + imc);

        if (imc < 18.3) {
            System.out.println("Você está abaixo do peso ideal!");
        } else if (imc < 25) {
            System.out.println("Você está no peso ideal!");
        } else if (imc < 30) {
            System.out.println("Você está acima do peso ideal!");
        } else if (imc < 40) {
            System.out.println("Você está com obesidade grau 1 ou 2!");
        } else {
            System.out.println("Você está com obesidade grau 3!");
            System.out.println("Muito cuidado com sua saúde!");
        }
    }
}