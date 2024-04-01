/* Elabore um programa que leia um vetor de 5 números digitados pelo usuário e umavariável de um número n qualquer, depois mostre na tela o índice dos elementos quesão inferiores a n */

import java.util.Scanner;

public class Ex04 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);
        int vetor[] = new int[5];
        int num = 10;

        System.out.println("Digite uma sequencia de 5 números: ");
        for (int i = 0; i < 5; i++) {
            vetor[i] = scan.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (vetor[i] < num) {
                System.out.println("Os números inferios a 10 são: " + vetor[i]);
            }
        }

        scan.close();
    }
}