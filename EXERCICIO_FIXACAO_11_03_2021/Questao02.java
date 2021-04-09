/*
Autor: Wanderson Gomes da Costa
Instituicao: IFCE - Campus Tiangua
Disciplina: Programacao Orientada a Objetos - POO
Professor: Evandro de Lima Rodrigues

Enunciado:
Faca um programa que leia uma matriz 4x4, imprima essa matriz e retorne a localizacao
(linha e a coluna) do maior valor lido.
*/
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //matriz
        double[][] matriz = new double[4][4];
        int i = 0, j = 0;
        
        //dados maior valor
        int linhaMaiorValor = 0;
        int colunaMaiorValor = 0;
        double maiorValor = 0;

        //preenche a matriz
        for (; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.printf("Informe o valor da posicao [%d][%d]: ", i + 1, j + 1);
                matriz[i][j] = input.nextDouble();
                if (((i == 0) && (j == 0)) || (matriz[i][j] > maiorValor)) {
                    maiorValor = matriz[i][j];
                    linhaMaiorValor = i + 1;
                    colunaMaiorValor = j + 1;
                }
            }
        }
        
        //apresenta a matriz
        System.out.printf("%nMatriz obtida:%n");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++)
                System.out.print(matriz[i][j] + " ");
            System.out.println();
        }

        //apresenta a localizacao do maior valor
        System.out.printf("%nMaior valor: %f%n", maiorValor);
        System.out.printf("Localizcao do maior valor: [%d][%d]%n", linhaMaiorValor, colunaMaiorValor);

        input.close();
    }
}