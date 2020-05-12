package fila;

public class Fila {
	private int inicio;
	private int fim;
	private int vetor[];
	private int total;
	
	public Fila() {
		vetor = new int[10];
		inicio = -1;
		fim = -1;
	}
	
	public boolean vazio() {
		return (total==0);
	}
	
	public boolean cheio() {
		return (total==9);
	}
	
	public void inserir(int valor) {
		if(!cheio()) {
			fim++;
			vetor[fim]=valor;
			total++;
		}
	}
	
	public int atender() {
		if(!vazio()) {
			inicio++;
			int valor = vetor [inicio];
			total--;
			return valor;
		}else {
			return -1;
		}
	}
	
	
	

}
