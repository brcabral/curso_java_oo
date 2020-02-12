package cap05_orientacaoObjeto2;

public class PessoaBean {
	// Atributos privados
	private String nome;
	private int idade;
	
	// Precisa ter um contrutor default (sem argumentos)
	public PessoaBean() {
		// TODO Auto-generated constructor stub
	}

	// Métodos gets and sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
