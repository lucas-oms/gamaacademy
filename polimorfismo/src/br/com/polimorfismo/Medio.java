package br.com.polimorfismo;

import br.com.polimorfismo.interfaces.PadraoFormacao;

public class Medio extends Formacao implements PadraoFormacao{
	//abritutos
	private String tipo = new String();

	//construtores
	public Medio() {
		super();
	}

	public Medio(String descricao, int periodo, double mensalidade, int duracao, String tipo) {
		super(descricao, periodo, mensalidade, duracao);
		this.tipo = tipo;
	}

	//getters and setters
	public String getAll() {
		return super.getAll() +"\n"+ tipo;
	}
	public void setAll(String descricao, int periodo, double mensalidade, int duracao, String tipo) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//outros m�todos
	public void calcularMensalidade(double fator) {
		super.setMensalidade(super.getDuracao()*fator*500);
	}

}
