package Base;

import Logica.FiladeEspera;

public class Elevador {
    private int id;
    private int andarAtual;
    private boolean subindo;
    private int capacidadeMaxima;
    private FiladeEspera passageiros;

    public Elevador(int id, int capacidadeMaxima) {
        this.id = id;
        this.andarAtual = 0;
        this.subindo = true;
        this.capacidadeMaxima = capacidadeMaxima;
        this.passageiros = new FiladeEspera();
    }

    public int getId() {
        return id;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void subir() {
        andarAtual++;
        subindo = true;
    }

    public void descer() {
        andarAtual--;
        subindo = false;
    }

    public boolean isSubindo() {
        return subindo;
    }

    public void setAndarAtual(int andar) {
        this.andarAtual = andar;
    }

    public FiladeEspera getPassageiros() {
        return passageiros;
    }

    public boolean estaCheio() {
        return passageiros.getTamanho() >= capacidadeMaxima;
    }

    public void embarcar(Pessoa p) {
        if (!estaCheio()) {
            passageiros.adicionar(
                    p.getId(),
                    p.getAndarOrigem(),
                    p.getAndarDestino(),
                    p.getTempoChegada(),
                    p.isIdoso(),
                    p.isCadeirante()
            );
        }
    }

    public void imprimirStatus() {
        System.out.println("Elevador " + id + " - Andar atual: " + andarAtual +
                " - Subindo: " + subindo +
                " - Passageiros: " + passageiros.getTamanho());
    }
}
