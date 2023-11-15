package com.igor.cursojava.aula05;

import java.util.Scanner;

public class Exer02Vetores {

	public static void main(String[] args) {
		
		int vetor [] = new int [10];
		int soma = 0;
		double media;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 10 números inteiros: ");
		for(int i=0; i<vetor.length; i++) {
			vetor[i] = scan.nextInt();
		}
		System.out.println("\nElementos dos índices ímpares do vetor:");
		for(int i=1; i<vetor.length; i +=2) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
		System.out.println("\nElemento pares no vetor:");
		for(int num : vetor) {
			if(num % 2 == 0) {
				System.out.print(num + " ");
			}
		}
		
		for(int num : vetor) {
			soma += num;
		}
		System.out.println();
		System.out.println("\nSoma de todos os elementos do vetor: " + soma);
		
		media = (double) soma / vetor.length;
		
		System.out.println("\nMédia de todos os elementos do vetor: " + media);
		
		}
	}


