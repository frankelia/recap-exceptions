package org.generation.exception;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean hasErrors = true;
		
		while (hasErrors) {
			try {
				System.out.print("Nome studente: ");
				String risposta = scanner.nextLine();
				
				System.out.print("Cognome studente: ");
				String risposta2 = scanner.nextLine();

				Studente studente = new Studente(risposta);
				System.out.println("Hai inserito il nome: " + studente.getNome());
				hasErrors = false;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		scanner.close();
	}
}
