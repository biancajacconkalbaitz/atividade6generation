package atividade6exercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class atividade6exercicio2 {



	public static void main(String[] args) {
	ArrayList<Integer> num = new ArrayList<>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
	Scanner ler = new Scanner(System.in);


	System.out.println("Qual nº deseja encontrar? ");


	Integer valor = ler.nextInt();
	Integer indexOfvalor = num.indexOf(valor);


	if (indexOfvalor == -1){
	System.out.println("O nº " + valor + " não foi encontrado");
	}else {
	System.out.println("O nº " + valor + " está na posição: " + indexOfvalor);
	}
	for (int i = 0; i < 1 ; i++) {
	System.out.println("");
	}
	
	}


}
