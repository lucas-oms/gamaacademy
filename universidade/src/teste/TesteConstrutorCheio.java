package teste;

import javax.swing.JOptionPane;

import modelo.Endereco;
import modelo.Professor;

public class TesteConstrutorCheio {
	
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg);
	}

	public static void main(String[] args) {
		
		Professor objetoProfessor = new Professor(
				s("Digite o nome"),
				s("Digite o apelido"),
				s("Digite a materia"),
				new Endereco(
						s("Digite o logradouro"),
						s("Digite o número"),
						s("Digite o bairo"),
						s("Digite a cidade"),
						s("Digite a uf"),
						s("Digite o cep"))
				);
		System.out.println(objetoProfessor.getAll());
		
	}

}
