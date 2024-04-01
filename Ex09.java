/* Elabore um programa que leia os vetores A e B de 5 elementos e gere um vetor C de acordo com as seguintes regras:
a. Os elementos das posições pares de C são os elementos das posições pares de A;
b. Os elementos das posições ímpares de C são os elementos das posições ímpares de B; */

public class Ex09 {
    public static void executar() {
        int vet1[] = { 2, 4, 6, 8, 10 };
        int vet2[] = { 11, 13, 15, 17, 19 };
        int vet3[] = new int[10];

        System.out.println("Posição A do vetor: ");
        for (int i = 0; i < 5; i++) {
            vet3[i] = vet1[i];
            System.out.println(vet3[i]);
        }
        System.out.println("Posição B do vetor: ");
        for (int i = 0; i < 5; i++) {
            vet3[i] = vet2[i];
            System.out.println(vet3[i]);
        }
    }
}