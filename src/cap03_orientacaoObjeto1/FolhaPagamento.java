package cap03_orientacaoObjeto1;

public class FolhaPagamento {
	double calcularSalario(int horasNormais, int horasExtra, double valorHoraNormal, double valorHoraExtra) {
		double valorHorasNormais = horasNormais * valorHoraNormal;
		double valorHorasExtras = horasExtra * valorHoraExtra;

		return valorHorasNormais + valorHorasExtras;
	}
}
