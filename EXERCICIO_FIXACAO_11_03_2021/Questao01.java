/*
Autor: Wanderson Gomes da Costa
Instituicao: IFCE - Campus Tiangua
Disciplina: Programacao Orientada a Objetos - POO
Professor: Evandro de Lima Rodrigues

Enunciado:
Crie um programa que declare uma matriz 3x3. Em seguida preencha com o numero 1 a
diagonal principal e com 0 os demais elementos. Escreva ao final a matriz obtida.
*/
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //matriz
        int[][] matriz = new int[3][3];
        int i = 0, j = 0;

        //preenche a diagonal
        for (; i < 3; i++)
            matriz[i][i] = 1;
        
        //apresenta a matriz
        System.out.println("Matriz obtida: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++)
                System.out.print(matriz[i][j] + " ");
            System.out.println();
        }

        input.close();
    }
}