package cap05_OrientacaoObjeto2.curso.fjoo.treinador;

import cap05_OrientacaoObjeto2.curso.fjoo.animal.Cachorro;

public class TreinadorCachorro {
	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Bob");

		DonoCachorro dono = new DonoCachorro();
		dono.ensinarCachorroSentar(cachorro);
	}
}
