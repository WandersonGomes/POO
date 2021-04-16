public class ItemVenda {
  private Produto produto;
  private int quantidade;

  //constructor
  public ItemVenda(Produto produto, int quantidade) {
    this.produto = produto;
    this.quantidade = quantidade;
  }

  //formataString
  private String formataString(String texto, int tamanho) {
    String stringFormatada = texto;

    for (int i = 0; i < (tamanho - texto.length()); i++) {
      stringFormatada += " ";
    }

    return stringFormatada;
  }

  //mostrarDados
  public String mostrarDados() {
    return formataString(Integer.toString(this.produto.getNumero()), 4) +
           formataString(this.produto.getDescricao(), 20) +
           formataString(Integer.toString(this.quantidade), 4) +
           formataString(Double.toString(this.quantidade * this.produto.getPreco()), 10);
  }

  //setters
  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  //getters
  public Produto getProduto() {
    return this.produto;
  }

  public int getQuantidade() {
    return this.quantidade;
  }
}
