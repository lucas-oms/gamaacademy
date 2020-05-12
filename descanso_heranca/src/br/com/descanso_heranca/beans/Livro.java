package br.com.descanso_heranca.beans;

public class Livro extends Produto {
	private String isbn;
	private String autor;
	public Livro(int codigo, double preco, String descricao, String isbn, String autor) {
		super(codigo, preco, descricao);
		this.isbn = isbn;
		this.autor = autor;
	}
	public Livro() {
		super();
	}
	//livro tem um imposto de 5%
	public double calcularValorFinal() {
		return getPreco()*1.05;
	}
	public String getAll() {
		return isbn +"\n"+ autor +"\n"+ super.getAll();
	}
	public void setAll(int codigo, double preco, String descricao, String isbn, String autor) {
		super.setAll(codigo, preco, descricao);
		this.isbn = isbn;
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}
