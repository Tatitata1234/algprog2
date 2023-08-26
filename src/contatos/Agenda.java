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

        int posicao = descobreProximaPosicaoDisponivel();
        if (posicao == -1)
            return false;

        contatos[posicao] = contato;
        return true;
    }

    public int descobreProximaPosicaoDisponivel(){
        for (int i = 0; i < MAXIMO_CONTATOS; i++) {
            if (contatos[i] == null)
                return i;
        }
        return -1;
    }

    public boolean adicionaContatoPosicao(Contato contato, int posicao){
        if (!isPosicaoValida(posicao))
            return false;

        contatos[posicao] = contato;
        return true;
    }

    public Contato buscarContato(int posicao){
        if (isPosicaoValida(posicao))
            return null;

        return contatos[posicao];
    }

    public int buscaPosicao(Contato contato){
        for (int i = 0; i < contatos.length; i++){
            Contato c = buscarContato(i);

            if (c != null && c.equals(contato)){
                return i;
            }
        }
        return -1;
    }

    public boolean removePosicao(int posicao){
        if(isPosicaoValida(posicao))
            return false;

        contatos[posicao] = null;
        return true;
    }

    public boolean isPosicaoValida(int posicao){
        return ! (posicao >= 0 && posicao < MAXIMO_CONTATOS);
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
