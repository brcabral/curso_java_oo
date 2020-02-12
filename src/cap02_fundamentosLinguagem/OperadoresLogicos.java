package cap02_fundamentosLinguagem;

import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Informe seu peso: ");
        int peso = entrada.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = entrada.nextDouble();

        System.out.print("Qual seu sexo [1 para masculino e qualquer outro número para feminino]?");
        char sexo = entrada.nextShort() == 1 ? 'M' : 'F';

        double imc = peso / (altura * altura);

        //  ______________A______________  ||  ______________B______________
        if (((sexo == 'F') && (imc < 19.1)) || (((sexo == 'M') && (imc < 20.7)))) {
            System.out.println("Você está abaixo do peso ideal!");
        } else if (((sexo == 'F') && (imc < 25.8)) || (((sexo == 'M') && (imc < 26.4)))) {
            System.out.println("Você está no peso ideal!");
        } else if (((sexo == 'F') && (imc < 27.3)) || (((sexo == 'M') && (imc < 27.8)))) {
            System.out.println("Você está um pouco acima do peso ideal!");
        } else if (((sexo == 'F') && (imc < 32.3)) || (((sexo == 'M') && (imc < 31.1)))) {
            System.out.println("Você está acima do peso ideal!");
        } else {
            System.out.println("Você está obeso!");
        }
    }
}