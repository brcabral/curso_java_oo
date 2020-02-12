package cap02_fundamentosLinguagem;

import java.util.Scanner;

public class EstruturaDoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor = 0;
        int soma = 0;

        do {
            System.out.print("Digite um número para ser somado. Digite zero caso deseje sair: ");
            valor = entrada.nextInt();

            soma += valor;
            System.out.println("Soma: " + soma);
        } while (valor != 0);
    }
}