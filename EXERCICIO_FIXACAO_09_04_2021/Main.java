import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //inicializa os 10 quartos vazios
        Quarto[] quartos = new Quarto[10];
        for (int i = 0; i < 10; i++) {
            quartos[i] = new Quarto(i);
        }

        //ler a quantidade de turistas
        int qtd_turistas = 0;
        do {
            System.out.print("Quantos quartos serao alugados? ");
            qtd_turistas = Integer.parseInt(input.nextLine());
            if ((qtd_turistas < 1) || (qtd_turistas > 10)) {
                System.out.println("Error: quantidade de turistas invalida! Tente novamente.");
            }
        } while ((qtd_turistas < 1) || (qtd_turistas > 10));

        //realiza o registro (turista -> quarto)
        int numeroQuarto = 0;
        String nome = "Desconhecido";
        String email = "sem e-mail";
        int flagErro = 0;

        for (int i = 1; i <= qtd_turistas; i++) {
            System.out.printf("%n===Aluguel #%d:===%n", i);
            
            System.out.print("Nome: ");
            nome = input.nextLine();
            System.out.print("Email: ");
            email = input.nextLine();

            do {
                flagErro = 0;
                System.out.print("Quarto: ");
                numeroQuarto = Integer.parseInt(input.nextLine());
                if ((numeroQuarto < 0) || (numeroQuarto > 9)) {
                    System.out.println("Error: numero do quarto invalido! Tente novamente.");
                    flagErro = 1;
                } else if (quartos[numeroQuarto].estaOcupado()) {
                    System.out.println("Error: quarto ja esta ocupado! Tente novamente.");
                    flagErro = 1;
                }
            } while (flagErro == 1);

            //ocupa o quarto
            quartos[numeroQuarto].setOcupante(new Turista(nome, email));
        } 

        //imprime o relatorio
        System.out.printf("%n=== RELATORIO DE OCUPACAO DE QUARTOS ===%n%n");
        for (Quarto quarto : quartos) {
            if (quarto.estaOcupado())
                quarto.printDadosQuarto();
        }

        input.close();
    }
}