package exerciciosMetodosJava;

public class Exercicio06 {
	
		public static boolean ehPar(int numero) {
			return numero%2 == 0;
		}

		public static void main(String[] args) {
			System.out.println(ehPar(8));
			System.out.println(ehPar(6));
			System.out.println(ehPar(9));
			System.out.println(ehPar(0));
		}
}
