package br.com.universidade.implantacao;

import br.com.universidade.modelo.Aluno;

public class Principal {
	
	public static void main(String args[]) {
		Aluno aluno = new Aluno();
		aluno.setAll("Lucas","lucas@lucas","98877-6655",123123,"Eu mesmo");
		System.out.println(aluno.getAll());
	
	
	}
}
