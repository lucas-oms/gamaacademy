package br.com.projeto_pilha;

public class Pilha {
	private int topo;
	private int vetor[];

	public Pilha() {
		vetor = new int[5];
		topo = -1;
	}
	
	public boolean vazio() {
		return (topo==-1);
	}
	
	public boolean cheio() {
		return (topo==5);
	}
	
	public void inserir(int valor) {
		if(!cheio()) {
			topo++;
			vetor[topo]=valor;
		} else {
			System.out.println("Pilha cheia");
		} 
	}
	
	public int retirar() {
		if (!vazio()) {
			int valor = vetor[topo];
			topo--;
			return valor;
		}
		return -1;
	}
	
	
}
