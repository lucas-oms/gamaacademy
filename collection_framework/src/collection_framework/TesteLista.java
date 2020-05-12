package collection_framework;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TesteLista {

	public static void main(String[] args) {
		// n�o � poss�vel instanciar
		//List lista = new List();
		
		//� poss�vel, mas n�o recomendado instanciar pela
		//ArrayList lista = new ArrayList();
		
		// <> generics => significa que vc vai especificar um tipo de dado gen�rico

		List<String> lista = new ArrayList<>();
		lista.add("DBA");
		lista.add("PLENO");
		lista.add("ANALISTA");
		lista.add("JR");
		lista.add("DEV");
		lista.add("JR");
		lista.add("DBA");
		lista.add("SENIOR");
		//Collections.sort(lista);
		//System.out.println(lista.get(1));
		
		for (int indice=0;indice<lista.size();indice+=2) {
			System.out.println(lista.get(indice));
		}
	}

}
