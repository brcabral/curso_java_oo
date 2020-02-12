package cap05_OrientacaoObjeto2.curso.fjoo.seguradora;

public class TesteInterface {
	public static void main(String[] args) {
		CorretoraSeguros corretora = new CorretoraSeguros();

		Carro meuCarro = new Carro(45000d, 2012);
		Imovel minhaCasa = new Imovel(920000, 320);

		corretora.fazerPropostaSeguro(meuCarro);
		corretora.fazerPropostaSeguro(minhaCasa);
	}
}
