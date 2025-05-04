package Logica;

import Base.Pessoa;

public class FiladeEspera {
    private Pessoa inicio;
    private Pessoa fim;
    private int tamanhoFila;

    public FiladeEspera() {
        this.inicio = null;
        this.fim = null;
        this.tamanhoFila = 0;
    }

    public int getTamanho() {
        return tamanhoFila;
    }

    public void adicionar(int id, int andarOrigem, int andarDestino, int tempoChegada, boolean idoso,
            boolean cadeirante) {
        Pessoa p1 = new Pessoa(id, andarOrigem, andarDestino, tempoChegada, idoso, cadeirante, null);

        if (tamanhoFila == 0) {
            inicio = p1;
            fim = p1;
        } else {
            fim.setProx(p1);
            ;
            fim = p1;
        }
        tamanhoFila++;
    }

    public Pessoa retirar(int id) {
        if (inicio == null) {
            return null;

        } else if (inicio.getProx() == null) {
            Pessoa atual = inicio;
            inicio = null;
            fim = null;
            return atual;
        } else {
            Pessoa atual = inicio;
            inicio = inicio.getProx();
            atual.setProx(null);
            return atual;

        }

    }

    public void imprimir() {
        Pessoa atual = inicio;
        System.out.println("Fila de Espera:");

        while (atual != null) {
            System.out.println("ID: " + atual.getId() +
                    ", Origem: " + atual.getAndarOrigem() +
                    ", Destino: " + atual.getAndarDestino() +
                    ", Tempo: " + atual.getTempoChegada() +
                    ", Idoso: " + atual.isIdoso() +
                    ", Cadeirante: " + atual.isCadeirante());
            atual = atual.getProx();
        }
    }
}
