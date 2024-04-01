import java.util.Scanner;

public class Ex07 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        int vet1[] = new int[5];
        int vet2[] = new int[5];

        System.out.println("Digite uma sequecia de 5 numeros para o primeiro vetor: ");
        for (int i = 0; i < 5; i++) {
            vet1[i] = scan.nextInt();
        }
        System.out.println("Digite uma sequecia de 5 numeros para o segundo vetor : ");
        for (int i = 0; i < 5; i++) {
            vet2[i] = scan.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (vet1[i] == vet2[i]) {
                System.out.println(vet1[i] + " Correto!");
            } else {
                System.out.println("numero inválido");
            }

        }
        scan.close();
    }
}