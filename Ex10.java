/* Crie um programa que leia um vetor A de 5 posições e, ao final da leitura, copieos elementos de A em B de forma invertida. Ou seja, o primeiro elemento de A é oúltimo elemento de B, o segundo elemento de A é o penúltimo elemento de B, e assimpor diante. */
public class Ex10 {
    public static void executar() {
        int vet1[] = { 1, 2, 3, 4, 5 };
        int vet2[] = new int[5];

        System.out.println("Vetor B: ");

        for (int i = 0; i < 5; i++) {
            vet2[i] = vet1[5 - 1 - i];
            System.out.println(vet2[i]);
        }
    }
}