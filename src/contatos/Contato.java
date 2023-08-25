package contatos;

public class Contato {
    private String nome;
    private String fone;
    private String email;
    private TipoContato tipoContato;

    public Contato(String nome, String fone, String email, TipoContato tipoContato) {
        this.nome = nome;
        this.fone = fone;
        this.email = email;
        this.tipoContato = tipoContato;
    }

    public TipoContato getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(TipoContato tipoContato) {
        this.tipoContato = tipoContato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
