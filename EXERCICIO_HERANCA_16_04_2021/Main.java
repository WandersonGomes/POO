import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //dados dos funcionarios
    String nome = "";
    int horasTrabalhadas = 0;
    double valorHora = 0.00;
    double despesaAdicional = 0.00;

    //leitura dados funcionario proprio
    System.out.printf("%n=== Funcionario Propriro ===%n");
      //nome
      System.out.print("Nome: ");
      nome = input.nextLine();

      //horas trabalhadas
      do {
        System.out.print("Horas Trabalhadas: ");
        horasTrabalhadas = Integer.parseInt(input.nextLine());
        if (horasTrabalhadas < 0)
          System.out.println("Error: valor invalido! Tente novamente.");
      } while (horasTrabalhadas < 0);

      //valor da hora de trabalho
      do {
        System.out.print("Valor da Hora Trabalhada: ");
        valorHora = Double.parseDouble(input.nextLine());
        if (valorHora < 0)
          System.out.println("Error: valor invalido! Tente novamente.");
      } while (valorHora < 0);

    //cria o funcionario proprio
    FuncionarioProprio funcionarioProprio = new FuncionarioProprio(nome, horasTrabalhadas, valorHora);

    //leitura dados funcionario tercerizado
    System.out.printf("%n=== Funcionario Tercerizado ===%n");
      //nome
      System.out.print("Nome: ");
      nome = input.nextLine();

      //horas trabalhadas
      do {
        System.out.print("Horas Trabalhadas: ");
        horasTrabalhadas = Integer.parseInt(input.nextLine());
        if (horasTrabalhadas < 0)
          System.out.println("Error: valor invalido! Tente novamente.");
      } while (horasTrabalhadas < 0);

      //valor da hora de trabalho
      do {
        System.out.print("Valor da Hora Trabalhada: ");
        valorHora = Double.parseDouble(input.nextLine());
        if (valorHora < 0)
          System.out.println("Error: valor invalido! Tente novamente.");
      } while (valorHora < 0);

      //valor despesa adicional
      do {
        System.out.printf("Despesa Adicional: ");
        despesaAdicional = Double.parseDouble(input.nextLine());
        if (despesaAdicional < 0)
          System.out.println("Error: valor invalido! Tente novamente.");
      } while (despesaAdicional < 0);

    //cria funcionario tercerizado
    FuncionarioTercerizado funcionarioTercerizado = new FuncionarioTercerizado(nome, horasTrabalhadas, valorHora, despesaAdicional);

    //saida dos resultados
    System.out.printf("%n === Pagamentos ===%n");
      System.out.printf("%s: %.2f%n", funcionarioProprio.getNome(), funcionarioProprio.pagamento());
      System.out.printf("%s: %.2f%n", funcionarioTercerizado.getNome(), funcionarioTercerizado.pagamento());

    input.close();
  }
}
