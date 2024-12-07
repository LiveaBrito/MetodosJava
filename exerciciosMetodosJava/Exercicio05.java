package exerciciosMetodosJava;

import java.util.Scanner;

public class Exercicio05 {
	
	
	public static String maiorNumero(int n1, int n2) {
		return (n1 > n2)? "O maior número é: "+n1 : "O maior número é: "+ n2 ;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int n1 = scan.nextInt();
		
		System.out.println("Digite outro numero: ");
		int n2 = scan.nextInt();
		
		System.out.println(maiorNumero(n1,n2));
	}

}
