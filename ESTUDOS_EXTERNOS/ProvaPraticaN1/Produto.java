public class Produto {
  private int numero;
  private String descricao;
  private double preco;

  //constructor
  public Produto(int numero, String descricao, double preco) {
      this.numero = numero;
      this.descricao = descricao;
      this.preco = preco;
  }

  //setters
  public void setNumero(int numero) {
    this.numero = numero;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  //getters
  public int getNumero() {
    return this.numero;
  }

  public String getDescricao() {
    return this.descricao;
  }

  public double getPreco() {
    return this.preco;
  }
}
