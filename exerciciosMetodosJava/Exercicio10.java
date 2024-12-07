package exerciciosMetodosJava;

import java.util.Scanner;

public class Exercicio10{	

public static float calcularMedia(float nota01, float nota02, float nota03) {
		
		float media = (nota01+nota02+nota03)/3;
		
		return media;
	}

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite 3 notas para ver a sua média");
		System.out.println("");
		
		System.out.print("Digite a primeira nota: ");
		float nota01 = leitor.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		float nota02 = leitor.nextFloat();

		System.out.print("Digite a terceira nota: ");
		float nota03 = leitor.nextFloat();
		
		System.out.println("Sua média foi: "+calcularMedia(nota01,nota02,nota03));
		
		leitor.close();
	}
	
}