package Base;

public class Pessoa {

    public int id;
    public int andarOrigem;
    public int andarDestino;
    public int tempoChegada;
    public boolean idoso;
    public boolean cadeirante;
    public Pessoa prox;


    public Pessoa(int id, int andarOrigem, int andarDestino, int tempoChegada, boolean idoso, boolean cadeirante, Pessoa prox) {
        this.id = id;
        this.andarOrigem = andarOrigem;
        this.andarDestino = andarDestino;
        this.tempoChegada = tempoChegada;
        this.idoso = idoso;
        this.cadeirante = cadeirante;
        this.prox = prox;
    }


}
