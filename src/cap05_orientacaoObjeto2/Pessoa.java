package cap05_orientacaoObjeto2;

public class Pessoa {
	String nome;
	int idade;

	public Pessoa(String nome) {
		this.nome = nome;
		// outros comandos... //
	}

	public Pessoa(String nome, int idade) {
		this(nome); // deve ser a primeira instrução dentro do construtor
		this.idade = idade;
	}
}
