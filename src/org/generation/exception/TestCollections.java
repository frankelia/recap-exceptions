package org.generation.exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestCollections {
	public static void main(String[] args) {
		// Creare una lista vuota
		List<String> pippo = new ArrayList<>();
		
		pippo.add("Primo elemento");
		pippo.add("Secondo elemento");
		pippo.add("Terzo elemento");
		pippo.add("Quarto elemento");
//		pippo.remove("Primo elemento");
		
		int i = 3;
		pippo.get(i);
		pippo.clear();
		
		if (pippo.contains("Elemento")) {
			
		}
		
		boolean empty = pippo.isEmpty();
		int numeroElementi = pippo.size();

		// Convertire array in List
		String[] mesi = new String[] {
			"Gennaio", "Febbraio"
		};
		List<String> mesiLista = Arrays.asList(mesi);
		
		List<String> mesiLista2 = Arrays.asList(new String[] {
			"Gennaio", "Febbraio"
		});
		
		// ----- SET ----
		Set<String> insieme = new HashSet<>();
		insieme.add("Elemento");
		insieme.add("Elemento");
		insieme.remove("Valore elemento");
		
		insieme.contains("Elemento contenuto?");
		
		// Iterare elementi insieme
		for (String elemento : insieme) {
			System.out.println("element => " + elemento);
		}
		
		insieme.clear();
		
		// Dimensione
		System.out.println("Dimensione insieme: " + insieme.size());
		
		// -- MAP --
		Map<String, Integer> votiStudenti = new HashMap<>();
		// Francesco Elia -> 5
		// Costanza Zanoletti -> 5
		votiStudenti.put("Costanza Zanoletti", 5);
		votiStudenti.put("Francesco Elia", 5);
		votiStudenti.put("Francesco Elia", 4);
		
		Integer voto = votiStudenti.get("Francesco Elia");
		votiStudenti.size();
		votiStudenti.isEmpty();
		
		Set<String> keySet = votiStudenti.keySet();
		System.out.println("VOTI STUDENTI");
		for (String chiave : keySet) {
			System.out.println(chiave + "\t" + votiStudenti.get(chiave));
		}
		
		System.out.println(votiStudenti);
	}
}
