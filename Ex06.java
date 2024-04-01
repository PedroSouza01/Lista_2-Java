/* Elabore um programa que leia um vetor com 5 notas de um aluno e um outro vetorcom 5 pesos e calcule a média ponderada do aluno. */

import java.util.Scanner;

public class Ex06 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        float nota[] = new float[5];
        float peso[] = new float[5];
        int quantidadeN = 0;
        int quantidadeP = 0;
        float media;
        float multiplicacao = 0;
        float somaPeso = 0;

        for (int i = 0; i < 5; i++) {
            quantidadeN++;
            System.out.println("Digite a nota " + quantidadeN + " do aluno: ");
            nota[i] = scan.nextFloat();
        }

        for (int i = 0; i < 5; i++) {
            quantidadeP++;
            System.out.println("Digite o peso " + quantidadeP + " do aluno: ");
            peso[i] = scan.nextFloat();
        }

        for (int i = 0; i < 5; i++) {
            multiplicacao = +nota[i] * peso[i];
            somaPeso = +peso[i];
        }
        media = multiplicacao / somaPeso;

        System.out.println("A media ponderada do aluno é " + media);

        scan.close();
    }

}