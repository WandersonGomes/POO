public class Venda {
  private ItemVenda[] itens;
  private int quantidadeItens;
  private int quantidadeAtual;

  //constructor
  public Venda(int quantidadeItens) {
    this.itens = new ItemVenda[quantidadeItens];
    this.quantidadeItens = quantidadeItens;
    this.quantidadeAtual = 0;
  }

  //podeIncluirItem
  public boolean podeIncluirItem() {
    if (this.quantidadeAtual < this.quantidadeItens)
      return true;
    return false;
  }

  //incluirItemVenda
  public void incluirItemVenda(ItemVenda item) {
    this.itens[this.quantidadeAtual] = item;
    this.quantidadeAtual++;
  }

  //setters
  public void setQuantidadeItens(int quantidadeItens) {
    this.quantidadeItens = quantidadeItens;
    this.itens = new ItemVenda[quantidadeItens];
    this.quantidadeAtual = 0;
  }

  //getters
  public ItemVenda[] getItensVenda() {
    return this.itens;
  }
}
