package contatos;

public class Agenda {
    private int numeroElementos;
    private Contato[] contatos;
    private static final int MAXIMO_CONTATOS = 10;


    public Agenda() {
        this.contatos = new Contato[MAXIMO_CONTATOS];
        numeroElementos = 0;
    }

    public boolean adicionarContato(Contato contato){
        if (numeroElementos == this.contatos.length)
            return false;

        contatos[numeroElementos] = contato;
        numeroElementos++;
        return true;
    }

    public Contato buscarContato(int posicao){
        return contatos[posicao];
    }



    public int getNumeroElementos() {
        return numeroElementos;
    }

    public void setNumeroElementos(int numeroElementos) {
        this.numeroElementos = numeroElementos;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }
}
