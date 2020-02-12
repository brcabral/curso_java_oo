package cap09_serializacao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import cap09_serializacao.model.Pessoa;

public class SerializarObjeto {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("João da Silva");
		p.setIdade(25);
		p.setProfissao("Motorista");

		try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("files/joao.obj"))) {
			out.writeObject(p);
			System.out.println("Objeto salvo com sucesso!");
		} catch (IOException e) {
			System.err.println("Erro salvando o objeto.\n" + e.getMessage());
			e.printStackTrace();
		}
	}
}
