package cap05_orientacaoObjeto2;

public class MaquinaCafe {
	int acucarDisponivel;

	void fazerCafe() {
		fazerCafe(10);
	}

	void fazerCafe(int quantidadeAcucar) {
		if (this.acucarDisponivel >= quantidadeAcucar) {
			System.out.println("Fazendo cafezinho com " + quantidadeAcucar + " gramas de açucar.");
			this.acucarDisponivel -= quantidadeAcucar;
		} else {
			System.out.println("Não há açucar suficiene para fazer seu café.");
		}
	}
}
