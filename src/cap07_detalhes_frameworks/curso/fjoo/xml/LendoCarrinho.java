package cap07_detalhes_frameworks.curso.fjoo.xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class LendoCarrinho {
	public static void main(String[] args) throws FileNotFoundException {
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("produto", Produto.class);
		xstream.alias("carrinho", List.class);

		@SuppressWarnings("unchecked")
		List<Produto> carrinho = (List<Produto>) xstream.fromXML(new FileInputStream("./xml/carrinho.xml"));
		for (Produto produto : carrinho) {
			System.out.println(produto.getCodigo());
			System.out.println(produto.getDescricao());
			System.out.println(produto.getValor());
			System.out.println();
		}
	}
}
