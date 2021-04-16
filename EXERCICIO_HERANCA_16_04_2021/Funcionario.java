public class Funcionario {
  private String nome;
  private int horasTrabalhadas;
  private double valorHora;

  //construtor
  public Funcionario(String nome, int horasTrabalhadas, double valorHora) {
    this.nome = nome;
    this.horasTrabalhadas = horasTrabalhadas;
    this.valorHora = valorHora;
  }

  //pagamento dos funcionarios
  public double pagamento() {
    return this.horasTrabalhadas * this.valorHora;
  }

  //setters
  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setHorasTrabalhadas(int horasTrabalhadas) {
    this.horasTrabalhadas = horasTrabalhadas;
  }

  public void setValorHora(double valorHora) {
    this.valorHora = valorHora;
  }

  //getters
  public String getNome() {
    return this.nome;
  }

  public int getHorasTrabalhadas() {
    return this.horasTrabalhadas;
  }

  public double getValorHora() {
    return this.valorHora;
  }
}
