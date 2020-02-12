package cap02_fundamentosLinguagem;

public class OperadorAritmetico01 {
    public static void main(String[] args) {
        int soma = 2 + 10;
        int subtracao = 6 - 10;
        int multiplicacao = 8 * 3;
        int divisao = 8 / 2;
        int resto = 7 % 2;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(resto);

        int notaAluno01 = 99;
        int notaAluno02 = 80;
        int notaAluno03 = 53;

        int totalGeral = notaAluno01 + notaAluno02 + notaAluno03;
        System.out.println("Total geral: " + totalGeral);

        int mediaGeral = (notaAluno01 + notaAluno02 + notaAluno03) / 3;
        System.out.println("Media geral: " + mediaGeral);
    }
}