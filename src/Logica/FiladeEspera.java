package Logica;

import Base.Pessoa;

public class FiladeEspera {
    public Pessoa inicio;
    public Pessoa fim;
    int tamanhoFila;

    public FiladeEspera() {
        this.inicio = null;
        this.fim = null;
        this.tamanhoFila = 0;
    }

    public void adicionar(int id, int andarOrigem, int andarDestino, int tempoChegada, boolean idoso, boolean cadeirante) {
       Pessoa p1 = new Pessoa(id, andarOrigem, andarDestino, tempoChegada, idoso, cadeirante, null);

       if(tamanhoFila == 0){
           inicio = p1;
           fim = p1;
       }else {
           fim.prox = p1;
           fim = p1;
       }
        tamanhoFila++;
    }
}
