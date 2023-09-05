package atividade6exercicio4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class atividade6exercicio4 {
	

		public static void main(String[] args) { 

			Scanner ler = new Scanner(System.in);

			int num;
			Set <Integer> setnum = new HashSet <Integer>();
			
			setnum.add(2);
			setnum.add(5);
			setnum.add(1);
			setnum.add(3);
			setnum.add(4);
			setnum.add(9);
			setnum.add(7);
			setnum.add(8);
			setnum.add(10);
			setnum.add(6);

			System.out.println("Qual nº deseja encontrar? ");
			num = ler.nextInt();


			if(setnum.contains(num)) {
				System.out.println("Número " + num + "  encontrado");
			}else {
				System.out.println("Número " + num + " não encontrado");
			}
			
		}
}
		

		
		

	