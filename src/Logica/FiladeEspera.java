package Logica;

import Base.Pessoa;

public class FiladeEspera {
    Pessoa inicio;
    Pessoa fim;
    int tamanhoFila;

    public FiladeEspera(Pessoa inicio, Pessoa fim, int tamanhoFila) {
        this.inicio = null;
        this.fim = null;
        this.tamanhoFila = 0;
    }

    public void adicionar() {
       Pessoa p1 = new Pessoa()
       if(tamanhoFila ==0){
           p1 = inicio;
           p1 = fim;
       }else if( inicio==fim){
           p1.prox = inicio;
           inicio.prox = elemento;

       }


    }



}
