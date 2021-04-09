/*
Autor: Wanderson Gomes da Costa
Instituicao: IFCE - Campus Tiangua
Disciplina: Programacao Orientada a Objetos - POO
Professor: Evandro de Lima Rodrigues
Data: 12/03/2021

Enunciado:
Elabore um programa que corrija provas de multipla escolha. Cada prova tem 10 questoes
e cada questao vale 1 ponto. A primeira informacao a ser lida e o gabarito da prova, em
seguida deve ser lido o numero do aluno e suas respostas. Existem 10 alunos matriculados
nessa turma. Calcule e mostre:

a) O numero de cada aluno e sua respectiva nota;

b) A porcentagem de aprovacao de alunos na prova considerando a nota minima 6.0;

Observacao: o gabarito e resposta dos alunos sao vetores do tipo char;
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int NUMERO_ALUNOS = 10;
        final int NUMERO_QUESTOES = 10;
        final double NOTA_APROVACAO = 6.0;

        Scanner input = new Scanner(System.in);

        //matricula, gabarito e nota
        int[] matriculas = new int[NUMERO_ALUNOS];
        char[] gabarito = new char[NUMERO_ALUNOS];
        int[] notas = new int[NUMERO_ALUNOS];

        //ler o gabarito
        int i = 1, j = 1;
        for (; i <= NUMERO_QUESTOES; i++) {
            System.out.printf("Informe o gabarito da %d.a questao: ", i);
            gabarito[i - 1] = input.nextLine().toUpperCase().charAt(0);
        }

        //ler dados do aluno
        char resposta;
        for (i = 1; i <= NUMERO_ALUNOS; i++) {
            System.out.println();
            do {
                System.out.printf("Informe a matricula do %d.o aluno: ", i);
                matriculas[i - 1] = input.nextInt();
                if (matriculas[i - 1] <= 0)
                    System.out.println("Error: valor invalido! Tente novamente.");   
            } while (matriculas[i - 1] <= 0);
            
            //limpar buffer
            if (input.hasNextLine())
                input.nextLine();

            //calcula pontuacao
            System.out.println();
            for (j = 1; j <= NUMERO_QUESTOES; j++) {
                System.out.printf("Informe a resposta da %d.a questao do %d.o aluno: ", j, i);
                resposta = input.nextLine().toUpperCase().charAt(0);
                if (resposta == gabarito[j - 1])
                    notas[i-1]++;
            }
        }

        //porcentagem de alunos aprovados
        int numeroAlunosAprovados = 0;
        for (i = 0; i < NUMERO_ALUNOS; i++) {
            if (notas[i] >= NOTA_APROVACAO)
                numeroAlunosAprovados++;
        }
        double porcentagemAprovacao = (double) numeroAlunosAprovados/NUMERO_ALUNOS;

        //apresenta os resultados obtidos
        System.out.printf("%n=== RESULTADO ===%n");
        for (i = 0; i < NUMERO_ALUNOS; i++)
            System.out.printf("Matricula = %d | Nota = %d%n", matriculas[i], notas[i]);
        System.out.println();

        System.out.printf("Porcentagem de aprovados: %.2f%%%n", porcentagemAprovacao * 100);

        input.close();
    }
}