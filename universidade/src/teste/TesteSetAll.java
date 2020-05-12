package teste;

import javax.swing.JOptionPane;

import modelo.Aluno;
import modelo.Endereco;

public class TesteSetAll {

	public static void main(String[] args) {
		
		Endereco objetoEndereco = new Endereco();
		Aluno objetoAluno = new Aluno();
		//objeto.setNome(JOptionPane.showInputDialog("Digite o nome").toUpperCase());
		//objeto.setNumeroMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de matrícula")));
		//objeto.setEmail(JOptionPane.showInputDialog("Digite o e-mail"));
		
		objetoEndereco.setAll("RUA XPTO", "53A", "NARNIA", "OZ", "SP", "12345-123");
		objetoAluno.setAll("LUCAS", 2611, "lucas@gmail.com", objetoEndereco);
		System.out.println(objetoAluno.getAll());
		System.out.println(objetoEndereco.getAll());
		
		System.out.println("Até logo...");
		
	}

}
