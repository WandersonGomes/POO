public class FuncionarioTercerizado extends Funcionario {
  private double despesaAdicional;

  //construtor
  public FuncionarioTercerizado(String nome, int horasTrabalhadas, double valorHora, double despesaAdicional) {
    super(nome, horasTrabalhadas, valorHora);
    this.despesaAdicional = despesaAdicional;
  }

  //pagamento sobescrito
  public double pagamento() {
    return super.pagamento() + this.despesaAdicional;
  }
}
