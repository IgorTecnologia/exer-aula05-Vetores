package com.igor.cursojava.aula05;

import java.util.Arrays;
import java.util.Scanner;

public class Exer01Vetores {

	public static void main(String[] args) {
	
		int numeros [] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		
		Scanner scan = new Scanner(System.in);
		
		Arrays.sort(numeros);
		
		System.out.println("\nVetor ordenado:");
		for (int i=0; i<numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println("\nEste elemento existe no array ? em qual posição ?");
		
for(int i=0; i <2; i++) {
			
			System.out.println("Entre com um número: ");
			numeros[i] = scan.nextInt();
			
			if(numeros[i] >=0 && numeros[i] <=10) {
				System.out.println("\nO número " + numeros[i] + " está localizado na posição: " + (numeros[i]-1));
			}else {
				System.out.println("\nO número " + numeros[i] + " não foi encontrado!");
			}
}
			
	}
}

	
		
			
		
		
	


