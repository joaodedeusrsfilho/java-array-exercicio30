package aula19_Arrays;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		/*
		 * Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo que nos
		 * vetor B e C serão armazenados os valores pares e ímpares de A,
		 * respectivamente
		 */
		Scanner ler = new Scanner(System.in);
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];// pares
		int[] vetorC = new int[vetorA.length];// impares

		for (int x = 0; x < vetorA.length; x++) {
			System.out.println("Entre com os valores da posicao " + (x + 1));
			vetorA[x] = ler.nextInt();
		}
		int posicaoB = 0;// flag
		int posicaoC = 0;// flag

		for (int x = 0; x < vetorA.length; x++) {
			if (vetorA[x] % 2 == 0) {
				vetorB[posicaoB] = vetorA[x];
				posicaoB++;
			} else {
				vetorC[posicaoC] = vetorA[x];
				posicaoC++;
			}
		}

		System.out.println();
		System.out.print("VetorA = ");
		for (int x = 0; x < vetorA.length; x++) {
			System.out.print(vetorA[x] + " ");
		}
		System.out.println();
		System.out.print("VetorB = Pares ");
		for (int x = 0; x < posicaoB; x++) {
			System.out.print(vetorB[x] + " ");
		}
		System.out.println();
		System.out.print("VetorC = Impares ");
		for (int x = 0; x < posicaoC; x++) {
			System.out.print(vetorC[x] + " ");
		}
	}
}
