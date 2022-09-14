package br.com.fiap.stream;

import java.util.ArrayList;
import java.util.List;

public class TestePerformanceArrayList {

	final static int MAX = 200000;

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<Integer>();

		// @formatter:off
 		long tInicio = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) { lista.add(i);}
		long tFim = System.currentTimeMillis();
		System.out.println("Tempo total de escrita: " + (tFim - tInicio) + " ms.");
		
		tInicio = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) { lista.contains(i); }
		tFim = System.currentTimeMillis();
		System.out.println("Tempo total de pesquisa: " + (tFim - tInicio) + " ms.");
		// @formatter:on
	}
}

