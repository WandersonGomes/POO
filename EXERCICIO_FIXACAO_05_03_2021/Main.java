/*
Autor: Wanderson Gomes da Costa
Disciplina: Programacao Orientada a Objetos - POO
Instituicao: IFCE - Campus Tiangua
Professor: Evandro de Lima Rodrigues

Enunciado:
Elabore um programa que receba o nome de n produtos e seus respectivos
precos, armazene-os em dois vetores separados, um para os produtos e
outro para os precos. O programa deve calcular e mostrar:

a) A quantidade de produtos com preco inferior a R$ 40.00;
b) O nome dos produtos com preco entre R$ 40.00 e R$ 100.00;
c) A media dos precos dos produtos com preco superior a R$ 100.00.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //quantidade de produtos
        int qtdProdutos = 0;
        do {
            System.out.print("Informe a quantidade de produtos: ");
            qtdProdutos = input.nextInt();
            if (qtdProdutos <= 0)
                System.out.println("Error: valor invalido! Tente novamente.");
        } while (qtdProdutos <= 0);

        //nome dos produtos e os precos
        String produtos[] = new String[qtdProdutos];
        double precos[] = new double[qtdProdutos];

        //dados a serem calculados
        int qtdProdutosInferior40 = 0;
        double mediaProdutosSuperior100 = 0.00;
        double somaPrecoProdutosSuperior100 = 0.00;
        int qtdProdutosSuperior100 = 0;

        //leitura dos dados (produto, preco)
        for (int i = 0; i < qtdProdutos; i++) {
            //limpa buffer
            if (input.hasNextLine())
                input.nextLine();
            
            //nome
            System.out.printf("%nInforme o nome do %d.o produto: ", i+1);
            produtos[i] = input.nextLine();

            //preco
            do {
                System.out.printf("Informe o preco do %d.o produto: ", i+1);
                precos[i] = input.nextDouble();
                if (precos[i] <= 0.00)
                    System.out.println("Error: valor invalido! Tente novamente.");
            } while (precos[i] <= 0.00);

            //inferior a 40 reais
            if (precos[i] < 40.00)
                qtdProdutosInferior40++;
            
            //soma os valores superiores a 100 reais
            if (precos[i] > 100.00) {
                qtdProdutosSuperior100++;
                somaPrecoProdutosSuperior100 += precos[i];
            }
        }

        //apresentacao dos resultados
        System.out.printf("%nQuantidade de produtos com preco inferior a R$ 40.00: %d%n", qtdProdutosInferior40);
        
        System.out.println("Produtos com faixa de preco 40.00 <= preco <= 100.00:");
        for (int i = 0; i < qtdProdutos; i++) {
            if ((precos[i] >= 40.00) && (precos[i] <= 100.00))
                System.out.println(produtos[i]);
        }

        System.out.print("A media do preco dos produtos com preco superior a R$ 100.00: ");
        if (qtdProdutosSuperior100 <= 0) {
            System.out.println("0.00");
        } else {
            mediaProdutosSuperior100 = somaPrecoProdutosSuperior100/qtdProdutosSuperior100;
            System.out.printf("%.2f%n", mediaProdutosSuperior100);
        }

        input.close();
    }
}