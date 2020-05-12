package br.com.descanso_heranca.beans;

public abstract class Produto {
	private int codigo;
	private double preco;
	private String descricao;
	
	//CD tem um imposto de 15%
	//Livro tem um imposto de 5%
	//calcularValorFinal()
	public Produto(int codigo, double preco, String descricao) {
		super();
		this.codigo = codigo;
		this.preco = preco;
		this.descricao = descricao;
	}
	public Produto() {
		super();
	}
	public double calcularValorFinal() {
		if (this instanceof Livro) {
			return preco * 1.05;
		}else if (this instanceof CompactDisc) {
			return preco * 1.15;
		} else {
		return preco;
	}
	}
	public String getAll() {
		return codigo +"\n"+ preco +"\n"+ descricao;
	}
	public void setAll(int codigo, double preco, String descricao) {
		this.codigo = codigo;
		this.preco = preco;
		this.descricao = descricao;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
