/*
Disciplina: Programacao Orientada a Objetos
Professor: Evandro de Lima Rodrigues
Curso: Bacharelado em Ciencia da Computacao
Instituicao: IFCE - Instituto Federal do Ceara - Campus Tiangua
Semestre: 2021.1

Questao:
Foi feita uma pesquisa entre os habitantes de uma cidade. Foram coletados os dados
de idade, sexo(M/F) e salario. Faca um programa que calcule e mostre:

a) A media dos salarios do grupo;
b) A maior e a menor idade do grupo;
c) A quantidade de mulheres na cidade;
d) A idade e o sexo da pessoa que possui o menor salario;

Finalize a entrada de dados ao ser digitada uma idade igual a zero.
*/
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        //constantes
        final int MAIOR_IDADE_POSSIVEL = 160;

        Scanner input = new Scanner(System.in);
        //dados habitante
        int idade = 0;
        char sexo = 'a';
        double salario = 0.00;

        //dados calculados
        double mediaSalarios = 0.00;
        double somaSalarios = 0.00;
        int qtdHabitantes = 0;
        int maiorIdade = 0, menorIdade = MAIOR_IDADE_POSSIVEL+1;
        int qtdMulheres = 0;
        int idadeMenorSalario = 0;
        char sexoMenorSalario = 'a';
        double menorSalario = 0.00;

        //ler os dados dos habitantes
        while (true) {
            //idade
            do {
                System.out.print("Informe a idade do habitante ou 0 para sair: ");
                idade = input.nextInt();
                if ((idade < 0) || (idade > MAIOR_IDADE_POSSIVEL))
                    System.out.println("Error: valor invalido! Tente novamente.");
            } while ((idade < 0) || (idade > MAIOR_IDADE_POSSIVEL));
            
            //sair
            if (idade == 0)
                break;
            
            //limpa o buffer
            if (input.hasNextLine())
                input.nextLine();

            //sexo
            do {
                System.out.print("Informe o sexo do habitante (M/F): ");
                sexo = input.nextLine().charAt(0);
                if ((sexo != 'M') && (sexo != 'm') && (sexo != 'F') && (sexo != 'f'))
                    System.out.println("Error: valor invalido! Tente novamente.");
            } while ((sexo != 'M') && (sexo != 'm') && (sexo != 'F') && (sexo != 'f'));

            //salario
            do {
                System.out.print("Informe o salario do habitante: ");
                salario = input.nextDouble();
                if (salario <= 0.00)
                    System.out.println("Error: valor invalido! Tente novamente.");
            } while (salario <= 0.00);


            //calculos
            somaSalarios += salario;

            if (idade > maiorIdade)
                maiorIdade = idade;
            if (idade < menorIdade)
                menorIdade = idade;

            if ((sexo == 'M') || (sexo == 'm'))
                qtdMulheres++;
            
            if ((menorSalario == 0) || (salario < menorSalario)) {
                idadeMenorSalario = idade;
                sexoMenorSalario = sexo;
                menorSalario = salario;
            }

            qtdHabitantes++;
            System.out.println(); //espaco
        }

        //calcula media de salarios
        if (qtdHabitantes > 0) {
            mediaSalarios = somaSalarios/qtdHabitantes;

            //apresenta os resultados
            System.out.println();
            System.out.printf("Media de salarios do grupo: %.2f%n", mediaSalarios);
            System.out.println("Maior idade do grupo e: " + maiorIdade);
            System.out.println("Menor idade do grupo e: " + menorIdade);
            System.out.println("Quantidade de mulheres na cidade: " + qtdMulheres);
            System.out.println("Idade do habitante com menor salario: " + idadeMenorSalario);
            System.out.println("Sexo do habitante com menor salario: " + sexoMenorSalario);
        } else {
            System.out.println("Nenhum dado foi lido!");
        }

        input.close();
    }
}
