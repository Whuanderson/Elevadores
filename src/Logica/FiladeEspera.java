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

        if (tamanhoFila == 0) {
            inicio = p1;
            fim = p1;
        } else {
            fim.prox = p1;
            fim = p1;
        }
        tamanhoFila++;
    }

    public Pessoa retirar(int id) {
        if (inicio == null) {
            return null;
        } else if (inicio.prox == null) {
            Pessoa atual = inicio;
            inicio = null;
            fim = null;
            return atual;
        } else {
            Pessoa atual = inicio;
            inicio = inicio.prox;
            atual.prox = null;
            return atual;

        }



    }
    public void imprimir() {
        Pessoa atual = inicio;
        System.out.println("Fila de Espera:");

        while (atual != null) {
            System.out.println("ID: " + atual.id +
                    ", Origem: " + atual.andarOrigem +
                    ", Destino: " + atual.andarDestino +
                    ", Tempo: " + atual.tempoChegada +
                    ", Idoso: " + atual.idoso +
                    ", Cadeirante: " + atual.cadeirante);
            atual = atual.prox;
        }
    }
}

