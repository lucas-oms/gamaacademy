package br.com.polimorfismo.implantacao;

import javax.swing.JOptionPane;

import br.com.polimorfismo.Bacharelado;
import br.com.polimorfismo.Formacao;
import br.com.polimorfismo.Medio;
import br.com.polimorfismo.Tecnologo;

public class TesteFormacao {
	public static String texto(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	public static int inteiro(String msg) {
		return Integer.parseInt(texto(msg));
	}
	public static double decimal(String msg) {
		return Double.parseDouble(texto(msg));
	}
	public static boolean boleano() {
		if (texto("Digite V para verdadeiro e F para falso").equals("V")) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Formacao objeto=null;
		String resposta = texto("Digite:\n<B> para Bacharelado\n<M> para Medio\n<T> para Tecnologo");
		if (resposta.equals("B")) {
			objeto = new Bacharelado(
					texto("Digite o nome do curso"),
					inteiro("Digite o perído"),
					0,
					0,
					texto("Projeto de conclusão"),
					inteiro("Carga horária estágio")
					);
		}else if (resposta.equals("M")) {
			objeto = new Medio(
					texto("Descrição"),
					inteiro("Período"),
					0,
					0,
					texto("Tipo")
					);
		}else if (resposta.equals("T")) {
			objeto = new Tecnologo(
					texto("Descrição"),
					inteiro("Período"),
					0,
					0,
					true);
		}else {
			System.out.println("Opção inválida!!!");
		}
		objeto.definirDuracao();
		objeto.calcularMensalidade();
		System.out.println(objeto.getAll());
		
		int x = 0;
		x=10;
		x=20;
		
		int y[] = new int[10];
		y[0]=10;
		y[1]=20;
	}

}
