package br.com.descanso_heranca.implementacao;

import javax.swing.JOptionPane;

import br.com.descanso_heranca.beans.CompactDisc;
import br.com.descanso_heranca.beans.Livro;
import br.com.descanso_heranca.beans.Produto;

public class TesteGeral2 {
	public static String texto(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	public static int inteiro(String msg) {
		return Integer.parseInt(texto(msg));
	}
	public static double decimal(String msg) {
		return Double.parseDouble(texto(msg));
	}

	public static void main(String[] args) {
		Produto produto=null;
		//Impossível instanciar, porque a classe está como abstrata
		//Produto objeto3 = new Produto();
		String resposta = JOptionPane.showInputDialog("Digite:\n<L> para livro ou\n<C> para CD").toUpperCase();
		if (resposta.equals("L")) {
			produto = new Livro(
					inteiro("Digite o código"),
					decimal("Digite o valor"),
					texto("Digite a descrição"),
					texto("Digite o ISBN"),
					texto("Digite o autor")
					);
		} else if (resposta.equals("C")) {
			produto = new CompactDisc(
					inteiro("Digite o código"),
					decimal("Digite o valor"),
					texto("Digite a descrição"),
					texto("Gravadora"),
					texto("Artista")
					);
		}else {
			System.out.println("Opção inválida");
		}
		System.out.println(produto.getAll());
		System.out.println("E o valor final é: "+produto.calcularValorFinal());
	}

}
