package cap02_fundamentosLinguagem;

public class PrecoMedioBombom {
    public static void main(String[] args) {
        // Preços das últimas 3 vendas realizadas
        int preco01 = 5;
        int preco02 = 8;
        int preco03 = 12;

        int mediaPrecos = (preco01 + preco02 + preco03) / 3;

        System.out.println(" \" Sistema de calculo de Média \" ");
        System.out.println("Preço 01: " + preco01);
        System.out.println("Preço 02: " + preco02);
        System.out.println("Preço 03: " + preco03);
        System.out.println("\nMédia dos preços: " + mediaPrecos);
    }
}