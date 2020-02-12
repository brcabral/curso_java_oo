package cap02_fundamentosLinguagem;

import java.util.Scanner;

public class DescobreAnoBissexto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o ano: ");
        int ano = entrada.nextInt();

        if (ano % 400 == 0) {
            System.out.println("O ano de " + ano + " é bissexto.");
        } else if (ano % 4 == 0) {
            if (ano % 100 != 0) {
                System.out.println("O ano de " + ano + " é bissexto.");
            } else {
                System.out.println("O ano de " + ano + " não é bissexto.");
            } 
        } else {
            System.out.println("O ano de " + ano + " não é bissexto.");
        }
    }
}