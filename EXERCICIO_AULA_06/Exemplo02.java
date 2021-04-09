import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //leitura de ordem da matriz
        int ordem = 0;
        do {
            System.out.print("Informe a ordem da matriz: ");
            ordem = input.nextInt();
            if (ordem <= 0)
                System.out.println("Error: valor invalido! Tente novamente.");
        } while (ordem <= 0);

        //leitura da matriz
        int[] diagonalPrincipal = new int[ordem];
        int[][] matriz = new int[ordem][ordem];
        int qtdNumerosNegativos = 0;

        System.out.printf("%nInforme a matriz:%n");
        int i = 0, j = 0;
        for (i = 0; i < ordem; i++) {
            for (j = 0; j < ordem; j++) {
                matriz[i][j] = input.nextInt();
                //quantidade numeros negativos
                if (matriz[i][j] < 0)
                    qtdNumerosNegativos++;
            }
            //valores da diagonal principal
            diagonalPrincipal[i] = matriz[i][i];
        }

        //apresentacao dos resultados
        System.out.printf("%nDiagonal principal:%n");
        for (i = 0; i < ordem; i++)
            System.out.print(diagonalPrincipal[i] + " ");
        System.out.printf("%n%n");

        System.out.println("Quantidade de numeros negativos: " + qtdNumerosNegativos);

        input.close();
    }
}