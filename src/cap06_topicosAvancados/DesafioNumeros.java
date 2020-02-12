package cap06_topicosAvancados;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DesafioNumeros {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor do produto: ");
		try {
			double valorProduto = entrada.nextDouble();
			System.out.println("10% do valor é " + formatarNumero(calcularDezPorCento(valorProduto)));
		} catch (InputMismatchException e) {
			System.out.println("Valor inválido, tente novamente.");
		}
	}

	public static BigDecimal calcularDezPorCento(double valor) {
		BigDecimal valorBig = new BigDecimal(valor);
		return valorBig.multiply(BigDecimal.TEN).divide(new BigDecimal(100));
	}

	public static String formatarNumero(BigDecimal numero) {
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		return formatador.format(numero);
	}
}
