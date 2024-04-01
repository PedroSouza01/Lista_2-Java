/* Faça um programa que leia um vetor de 5 elementos e, após a leitura, posicioneo maior elemento na última posição do vetor. Nenhum número do vetor pode serapagado ou duplicado. Apresente o vetor atualizado na tela.v */

import java.util.Scanner;

public class Ex14 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.println("Digite os 5 números:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = scan.nextInt();
        }

        int maior = vetor[0];
        int posicaoMaior = 0;
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i;
            }
        }

        int temp = vetor[posicaoMaior];
        vetor[posicaoMaior] = vetor[4];
        vetor[4] = temp;

        System.out.println(":");
        for (int numeros : vetor) {
            System.out.print(numeros + " ");
        }

        scan.close();
    }
}