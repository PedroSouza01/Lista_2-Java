/* Construa um programa que leia em um vetor uma sequência de 5 números digitadospelo usuário, calcule a média e apresente na tela quais valores são menores, iguaisou superiores à média. */

import java.util.Scanner;

public class Ex01 {

    public static void executar() {
        Scanner scan = new Scanner(System.in);
        int vet[] = new int[5];

        System.out.println("Digite uma sequencia de 5 números: ");
        for (int i = 0; i < 5; i++) {
            vet[i] = scan.nextInt();
        }

        int calculo = 0;
        for (int i = 0; i < 5; i++) {
            calculo += vet[i];
        }
        double media = (double) calculo / 5;

        System.out.println("A media é " + media);

        for (int i = 0; i < 5; i++) {
            if (vet[i] > media) {
                System.out.println("Numeros maiores que a média: " + vet[i]);
            }

        }

        for (int i = 0; i < 5; i++) {
            if (vet[i] == media) {
                System.out.println("Numeros iguais que a média: " + vet[i]);
            }
        }

        for (int i = 0; i < 5; i++) {
            if (vet[i] < media) {
                System.out.println("Numeros menores que a média: " + vet[i]);
            }
        }
        scan.close();

    }
}
