public class Turista {
    private String nome;
    private String email;

    public Turista(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}