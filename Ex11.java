/* Elabore um algoritmo que calcule o produto escalar entre dois vetores de inteiros de tamanho igual a 5. Exemplo: {0, 2, 4, 6, 8}, {1, 3, 5, 7, 9} = 0*1 + 2*3 + 4*5 + 6*7 +8*9 = 140 */
public class Ex11 {
    public static void executar() {
        int vet1[] = { 0, 2, 4, 6, 8 };
        int vet2[] = { 1, 3, 5, 7, 9 };
        int resultado = 0;

        for (int i = 0; i < 5; i++) {
            resultado += vet1[i] * vet2[i];
        }

        System.out.println(resultado);

    }
}