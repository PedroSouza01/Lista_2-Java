/* Dados dois vetores A e B de 5 elementos cada, criar um vetor C que representa aconcatenação de A e B, ou seja, C contém os elementos de A seguidos dos elementosde B */

import java.util.Scanner;

public class Ex08 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        int vet1[] = { 1, 2, 3, 4, 5 };
        int vet2[] = { 6, 7, 8, 9, 10 };
        int vet3[] = new int[10];

        for (int i = 0; i < 5; i++) {
            vet3[i] = vet1[i];
            vet3[i + 5] = vet2[i];
        }

        System.out.println("Vetor concatenado: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(vet3[i]);
        }
        scan.close();
    }
}