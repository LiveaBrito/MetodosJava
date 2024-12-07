package exerciciosMetodosJava;

import java.util.Scanner;

public class Exercicio09 {
	
	public static String concatenarStrings(String texto1, String texto2) {
		return "Mensagem concatenadas: " + texto1 + " " + texto2;
	}
	
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Digite os textos para fazer a concatenação das mensagens");
		 System.out.println("\n");
		 
		 System.out.println("Digite o primeiro texto: ");
		 String texto1 = scan.next();
		 
		 System.out.println("Digite o primeiro texto: ");
		 String texto2 = scan.next();
		 
		 System.out.println(concatenarStrings(texto1,texto2));
		 
		 

	}

}
