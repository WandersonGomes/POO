import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        final double ALTURA_MINIMA = 0.15;
        final double ALTURA_MAXIMA = 2.50;

        Scanner input = new Scanner(System.in);

        //quantidade de numero de pessoas
        int numeroPessoas = 0;

        do {
            System.out.print("Informe a quantidade de pessoas: ");
            numeroPessoas = input.nextInt();
            if (numeroPessoas <= 0)
                System.out.println("Error: valor invalido! Tente novamente.");
        } while (numeroPessoas <= 0);

        //leitura das alturas das N pessoas
        double somaAltura = 0.00;
        double[] alturas = new double[numeroPessoas];

        for (int i = 0; i < numeroPessoas; i++) {
            do {
                System.out.printf("Informe a altura da %d.a pessoa: ", i + 1);
                alturas[i] = input.nextDouble();
                if ((alturas[i] < ALTURA_MINIMA) || (alturas[i] > ALTURA_MAXIMA))
                    System.out.println("Error: valor invalido! Tente novamente.");
            } while ((alturas[i] < ALTURA_MINIMA) || (alturas[i] > ALTURA_MAXIMA));
            
            somaAltura += alturas[i];
        }

        //calculo da media
        double mediaAlturas = somaAltura/numeroPessoas;
        System.out.printf("%nMedia de alturas = %.2f%n", mediaAlturas);

        input.close();
    }
}