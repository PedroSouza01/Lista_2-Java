/* Elabore um programa que leia 5 números do teclado e os armazene em um vetor.Em seguida, leia um número n qualquer e apresente na tela a quantidade de vezesque o número n aparece no vetor. */

import java.util.Scanner;

public class Ex05 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        int vetor[] = new int[5];
        int num;
        int quantidade = 0;

        System.out.println("Digite uma sequncia de 5 numeros: ");
        for (int i = 0; i < 5; i++) {
            vetor[i] = scan.nextInt();
        }

        System.out.println("Digite um numero desejado para mostrar quantidade de vezes que ele se repete: ");
        num = scan.nextInt();

        for (int j = 0; j < 5; j++) {
            if (vetor[j] == num) {
                quantidade++;
            } else if (vetor[j] != num) {

            }

            System.out.println("A quantidade de vezes que a variavel " + num + " aparece é: " + quantidade);

            scan.close();

        }
    }

}