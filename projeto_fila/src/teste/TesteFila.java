package teste;

import fila.Fila;

public class TesteFila {

	public static void main(String[] args) {
		Fila objeto = new Fila();
		System.out.println(objeto.vazio());
		
		objeto.inserir(18);
		objeto.inserir(22);
		objeto.inserir(44);
		
		System.out.println(objeto.atender());

	}

}
