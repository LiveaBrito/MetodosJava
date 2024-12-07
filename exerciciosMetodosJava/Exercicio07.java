package exerciciosMetodosJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio07 {

	public static void buscarDataAtual() {
		Date dataAtual = new Date();
		
		String dataFormatada = new SimpleDateFormat("dd/MM/yyyy").format(dataAtual);
		
		System.out.println("Data atual: "+dataFormatada);
	}

	public static void main(String[] args) {
		buscarDataAtual();	
	}

}
