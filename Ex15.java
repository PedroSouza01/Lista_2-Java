
/* Elabore um algoritmo que leia 5 números do teclado e preencha um vetor deacordo com a seguinte regra: com exceção do 1º número, só é permitido armazenarum número se ele for maior que o anterior. Ex.: se o primeiro valor lido for 5, o próximovalor lido só poderá ser maior que 5. */
import java.util.Scanner;

public class Ex15 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        int[] vet = new int[5];

        System.out.print("Digite o primeiro número: ");
        vet[0] = scan.nextInt();

        for (int i = 1; i < 5; i++) {
            int numero;
            do {
                System.out.printf("Digite o %dº número: ", i + 1);
                numero = scan.nextInt();
            } while (numero <= vet[i - 1]);

            vet[i] = numero;
        }

        System.out.println("Vetor preenchido:");
        for (int numeros : vet) {
            System.out.print(numeros + " ");
        }

        scan.close();
    }
}