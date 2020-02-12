package cap05_orientacaoObjeto2;

public class TesteBean {
	public static void main(String[] args) {
		PessoaBean pessoa = new PessoaBean();
		pessoa.setNome("Maria");
		pessoa.setIdade(27);

		System.out.println("Nome: " + pessoa.getNome() + " tem " + pessoa.getIdade() + " anos.");
	}
}
