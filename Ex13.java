/* Elabore um algoritmo que receba um número n e retorne um vetor com os nprimeiros termos da sequência de Fibonacci. Exemplo: n = 8, vetor = {1, 1, 2, 3, 5, 8,13, 21}.14.z  */

import java.util.Scanner;

public class Ex13 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.println("Digite um numero qualquer: ");
        num = scan.nextInt();

        int vet[] = new int[num];

        for (int i = 0; i < num; i++) {
            if (i < 2) {
                vet[i] = 1;
            } else {
                vet[i] = vet[i - 1] + vet[i - 2];
            }
        }

        for (int i = 0; i < num; i++) {
            System.out.println(vet[i]);
        }
        scan.close();
    }
}