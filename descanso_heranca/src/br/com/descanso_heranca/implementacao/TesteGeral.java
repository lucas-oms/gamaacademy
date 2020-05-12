package br.com.descanso_heranca.implementacao;

import javax.swing.JOptionPane;

import br.com.descanso_heranca.beans.CompactDisc;
import br.com.descanso_heranca.beans.Livro;
import br.com.descanso_heranca.beans.Produto;

public class TesteGeral {
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
		Livro livro=null;
		CompactDisc cd=null;
		//Impossível instanciar, porque a classe está como abstrata
		//Produto objeto3 = new Produto();
		String resposta = JOptionPane.showInputDialog("Digite:\n<L> para livro ou\n<C> para CD").toUpperCase();
		if (resposta.equals("L")) {
			livro = new Livro(
					inteiro("Digite o código"),
					decimal("Digite o valor"),
					texto("Digite a descrição"),
					texto("Digite o ISBN"),
					texto("Digite o autor")
					);
			System.out.println(livro.getAll());
			System.out.println("Valor final é " + livro.calcularValorFinal());
		} else if (resposta.equals("C")) {
			cd = new CompactDisc(
					inteiro("Digite o código"),
					decimal("Digite o valor"),
					texto("Digite a descrição"),
					texto("Gravadora"),
					texto("Artista")
					);
			System.out.println(cd.getAll());
			System.out.println("Valor final é " + cd.calcularValorFinal());
		}else {
			System.out.println("Opção inválida");
		}
	}

}