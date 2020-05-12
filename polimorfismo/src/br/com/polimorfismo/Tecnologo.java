package br.com.polimorfismo;

import br.com.polimorfismo.interfaces.PadraoFormacao;

public class Tecnologo extends Formacao implements PadraoFormacao{
	//atributos
	private boolean planoEstendido;
	
	//construtores
	public Tecnologo(String descricao, int periodo, double mensalidade, int duracao, boolean planoEstendido) {
		super(descricao, periodo, mensalidade, duracao);
		this.planoEstendido = planoEstendido;
	}

	public Tecnologo() {
		super();
	}
	
	//getters and setters
	public String getAll() {
		return super.getAll() +"\n"+ planoEstendido;
	}
	public void setAll(String descricao,
			int periodo,
			double mensalidade,
			int duracao,
			boolean planoEstendido) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		this.planoEstendido = planoEstendido;
	}
	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}

	//outros métodos
	public void calcularMensalidade(double fator) {
		super.setMensalidade(super.getDuracao()*fator*600);
	}
	
}
