package teste;

import javax.swing.JOptionPane;

import modelo.Aluno;
import modelo.Endereco;

public class TesteSetIndividual {

	public static void main(String[] args) {

		// instanciar os objetos
		//Endereco objetoEndereco = new Endereco();
		Aluno objetoAluno = new Aluno();
				
		objetoAluno.setNome(JOptionPane.showInputDialog("Digite o nome").toUpperCase());
		objetoAluno.setNumeroMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de matr�cula")));
		objetoAluno.setEmail(JOptionPane.showInputDialog("Digite o e-mail"));
				
		System.out.println("O nome �: " + objetoAluno.getNome());
		System.out.println("O n�mero de matr�cula �: " + objetoAluno.getNumeroMatricula());
		System.out.println("O e-mail �: " + objetoAluno.getEmail());
				
		System.out.println("At� logo...");
				
		//objetoEndereco.setAll("RUA XPTO", "53A", "NARNIA", "OZ", "SP", "12345-123");
		//objetoEndereco.setLougradouro("lfscasa");
		//objetoEndereco.setUf("1234");
		
		
	}

}
