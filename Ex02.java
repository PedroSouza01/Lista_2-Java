/*
 * Escreva um algoritmo que leia em um vetor uma sequência finita de números
 * digitados pelo usuário e, logo após, mostre o número de cada posição do vetor
 * e seele é positivo, negativo ou zero
 */

import java.util.Scanner;

public class Ex02 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);
        int vet[] = new int[10];

        System.out.println("Digite uma seuqencia de 10 numeros: ");
        for (int i = 0; i < 10; i++) {
            vet[i] = scan.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (vet[i] < 0) {
                System.out.println("Número Negativo!");
            } else if (vet[i] > 0) {
                System.out.println("Número Positivo!");
            } else if (vet[i] == 0) {
                System.out.println("Numero 0!");
            } else {
                System.out.println("Numero inválido!");
            }
        }

        scan.close();

    }
}
