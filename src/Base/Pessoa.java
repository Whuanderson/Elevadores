package Base;

public class Pessoa {

    private int id;
    private int andarOrigem;
    private int andarDestino;
    private int tempoChegada;
    private boolean idoso;
    private boolean cadeirante;
    private Pessoa prox;


    public Pessoa(int id, int andarOrigem, int andarDestino, int tempoChegada, boolean idoso, boolean cadeirante, Pessoa prox) {
        this.id = id;
        this.andarOrigem = andarOrigem;
        this.andarDestino = andarDestino;
        this.tempoChegada = tempoChegada;
        this.idoso = idoso;
        this.cadeirante = cadeirante;
        this.prox = prox;
    }

    public int getId() { return id; }
    public int getAndarOrigem() { return andarOrigem; }
    public int getAndarDestino() { return andarDestino; }
    public int getTempoChegada() { return tempoChegada; }
    public boolean isIdoso() { return idoso; }
    public boolean isCadeirante() { return cadeirante; }
    public Pessoa getProx() { return prox; }
    public void setProx(Pessoa prox) { this.prox = prox; }



}
