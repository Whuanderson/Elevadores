package Base;

public class Pessoa {

    int id;
    int andarOrigem;
    int andarDestino;
    int tempoChegda;
    boolean idoso;
    boolean cadeirante;
    Public Pessoa prox;


    public Pessoa(int id, int andarOrigem, int andarDestino, int tempoChegda, boolean idoso, boolean cadeirante, Pessoa prox) {
        this.id = id;
        this.andarOrigem = andarOrigem;
        this.andarDestino = andarDestino;
        this.tempoChegda = tempoChegda;
        this.idoso = idoso;
        this.cadeirante = cadeirante;
        this.proximo = null;
    }
}
