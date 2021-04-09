public class Quarto {
    private final int OCUPADO = 1;
    private final int LIVRE = 0;

    private int status;
    private int numero;
    private Turista ocupante;

    public Quarto(int numero) {
        this.numero = numero;
        this.status = LIVRE;
    }

    //apresenta os dados do quarto
    public void printDadosQuarto() {
        System.out.printf("Quarto: %d%n", this.numero);
        System.out.printf("Nome: %s%n", ocupante.getNome());
        System.out.printf("Email: %s%n%n", ocupante.getEmail());
    }

    //retorna true se o quarto estive ocupado
    public boolean estaOcupado() {
        return this.status == OCUPADO;
    }

    //setters
    public void setOcupante(Turista ocupante) {
        this.ocupante = ocupante;
        this.status = OCUPADO;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}