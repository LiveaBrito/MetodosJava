package exerciciosMetodosJava;

import java.util.Scanner;

public class Exercicio08 {

public static int calcularFatorial(int numeroFatoriado) {
		
		int contador = 1;
		int aux = numeroFatoriado;
		
		while(numeroFatoriado>contador) {
			
			aux*=contador;
			contador++;
		}
		
		return aux;	
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número e descubra qual seu fatorial");
		System.out.println("\n");
		
		System.out.print("Digite um número: ");
		int numero = scan.nextInt();
		System.out.println("Resultado: " +calcularFatorial(numero));
		
		scan.close();
	}
}
