/*
Disciplina: Programacao Orientada a Objetos
Professor: Evandro de Lima Rodrigues
Curso: Bacharelado em Ciencia da Computacao
Instituicao: IFCE - Instituto Federal do Ceara - Campus Tiangua
Semestre: 2021.1

Questao:
Peras custam R$ 1.00 cada se forem compradas menos do que uma duzia, e R$ 0.75 se
forem compradas pelo menos doze. Escreva um programa que leia o numero de peras
compradas, calcule e escreva o valor total dessa compra.
*/
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        //constantes
        final double VALOR_MENOR_DUZIA = 1.00;
        final double VALOR_MAIOR_IGUAL_DUZIA = 0.75;

        Scanner input = new Scanner(System.in);
        int qtdPeras = 0;
        double totalCompra = 0.00;

        //leitura da quantidade
        do {
            System.out.print("Informe a quantidade de peras: ");
            qtdPeras = input.nextInt();
            if (qtdPeras <= 0)
                System.out.println("Error: valor invalido! Tente novamente.");
        } while (qtdPeras <= 0);

        //calculo do total
        if (qtdPeras < 12)
            totalCompra = qtdPeras * VALOR_MENOR_DUZIA;
        else
            totalCompra = qtdPeras * VALOR_MAIOR_IGUAL_DUZIA;
        
        //apresenta o resultado
        System.out.printf("Valor total da compra: %.2f%n", totalCompra);

        input.close();
    }
}
