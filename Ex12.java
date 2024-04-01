/* Elabore um programa que leia um vetor de 12 elementos apresente na tela o produto dos elementos pares positivos (desconsiderar o zero). Exemplo: {0, 5, 8, 1, -6, 4, -7, 9, 10, -14, 3, 12} = 8 * 4 * 10 * 12 = 384013. */
public class Ex12 {
    public static void executar() {
        int vet[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int resultado = 1;

        for (int i = 0; i < 12; i++) {
            if (vet[i] != 0 && vet[i] % 2 == 0 && vet[i] > 0) {
                resultado *= vet[i];
            }
        }

        System.out.println(resultado);

    }
}