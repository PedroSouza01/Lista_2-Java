/* Faça um programa que leia em um vetor uma sequência finita de números digitadospelo usuário. Crie um segundo vetor que armazene o dobro de cada número do primeiro vetor e depois apresente os valores deste vetor */

import java.util.Scanner;

public class Ex03 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);
        int vet1[] = new int[10];
        int vet2[] = new int[10];

        System.out.println("Digite 10 numeros: ");
        for (int i = 0; i < 10; i++) {
            vet1[i] = scan.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            vet2[i] = vet1[i] * 2;

            System.out.println(vet2[i]);
        }
        scan.close();

    }
}
