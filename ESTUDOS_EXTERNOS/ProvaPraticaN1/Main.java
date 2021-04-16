import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Produto[] produtos = new Produto[10];

    //cadastra produtos
    produtos[0] = new Produto(1, "Pen Drive", 22.00);
    produtos[1] = new Produto(2, "Mouse", 38.00);
    produtos[2] = new Produto(3, "Teclado", 110.00);
    produtos[3] = new Produto(4, "Webcam", 400.00);
    produtos[4] = new Produto(5, "Fone de Ouvido", 75.00);
    produtos[5] = new Produto(6, "Tablet", 1200.00);
    produtos[6] = new Produto(7, "Impressora", 420.00);
    produtos[7] = new Produto(8, "Cartucho de Tinta", 48.00);
    produtos[8] = new Produto(9, "Microfone", 65.00);
    produtos[9] = new Produto(10, "Notebook", 4500.00);

    //listar produtos cadastrados
    System.out.println("ITENS PARA VENDA");
    System.out.println("----------------");
    for (Produto produto : produtos) {
      System.out.println(produto.getNumero() + " - " + produto.getDescricao() + " - R$" + produto.getPreco());
    }

    //incluir itens na Venda
    Venda venda = new Venda(5);

    int numeroItem = 0;
    int quantidade = 0;
    char opcao = 's';

    System.out.printf("%nCADASTRAR NOVA VENDA%n");
    System.out.println("--------------------");
    while (opcao == 's') {
      //checa se eh possivel inserir mais itens
      if (venda.podeIncluirItem()) {
        //leitura dos dados
        System.out.print("Numero do Item: ");
        numeroItem = Integer.parseInt(input.nextLine());
        if ((numeroItem < 1) || (numeroItem > 10)) {
          System.out.println("Nao foi possivel encontrar o produto!");
        } else {
          System.out.print("Quantidade: ");
          quantidade = Integer.parseInt(input.nextLine());
          if (quantidade < 1) {
            System.out.println("Error: quantidade invalida! Tente novamente.");
          } else {
            //insercao do item
            venda.incluirItemVenda(new ItemVenda(produtos[numeroItem - 1], quantidade));
          }
        }
      } else {
        System.out.println("Nao e mais possivel incluir itens nesta venda!");
      }
      //deseja continuar?
      System.out.print("Deseja continuar (s/n)? ");
      opcao = input.nextLine().charAt(0);
    }

    //exibir o resumo da Venda
    double total = 0.00;
    System.out.println("+----------------------------------------+");
    System.out.println("|            RESUMO DA VENDA             |");
    System.out.println("|----------------------------------------|");
    System.out.println("| NUM DESCRICAO           QTD VALOR      |");
    System.out.println("+----------------------------------------+");
    for (ItemVenda item : venda.getItensVenda()) {
      System.out.println("| " + item.mostrarDados() + " |");
      total += (item.getQuantidade() * item.getProduto().getPreco());
    }
    System.out.println("+----------------------------------------+");
    System.out.println("TOTAL: R$" + total);
    input.close();
  }
}
