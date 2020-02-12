package cap09_serializacao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

import cap09_serializacao.model.Pessoa;

public class DesserializarObjeto {
	public static void main(String[] args) {
		try (ObjectInput in = new ObjectInputStream(new FileInputStream("files/joao.obj"))) {
			Pessoa p = (Pessoa) in.readObject();
			System.out.println("Nome: " + p.getNome());
			System.out.println("Idade: " + p.getIdade());
			System.out.println("Profissão: " + p.getProfissao());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("Erro convertendo para a classe Pessoa.");
			e.printStackTrace();
		}
	}
}
