package m_banco;

public class Cliente {
	// atributos
	private String nome;
	private String cpf;
	private Endereco endereco;
	
	// construtores
	public Cliente(String nome, String cpf, Endereco endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	public Cliente() {
		super();
	}
	
	// getters and setters
	public void setAll(String nome, String cpf, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	public String getAll() {
		return nome + "\n" + cpf + "\n" + endereco.getAll();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	

}
