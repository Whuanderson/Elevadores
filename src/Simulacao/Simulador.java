package Simulacao;

import Base.Predio;
import Logica.FiladeEspera;

import java.util.Random;
import java.util.Scanner;

public class Simulador {

    Scanner teclado = new Scanner(System.in);
    FiladeEspera fila;
    int andares;
    public void iniciar(){
        System.out.println("Iniciando a Simulação");

        System.out.print("Digite a quantidade de andares: ");
        this.andares = teclado.nextInt();
        System.out.print("Digite a quantidade de elevadores: ");
        int elevadores = teclado.nextInt();
        System.out.print("Digite a quantidade de pesoas: ");
        int pessoas = teclado.nextInt();
        this.fila = gerarPessoal(pessoas);
        Predio v1 = new Predio(andares, elevadores);

        v1.imprimirPredio();
        this.fila.imprimir();
    }
    private FiladeEspera gerarPessoal(int pessoas){
        Random random = new Random();
        if (pessoas == 0) {

            pessoas = random.nextInt(20);
        }
        FiladeEspera fila = new FiladeEspera();


        for (int i = 0; i < pessoas; i++) {
            int andarOrigem = random.nextInt(this.andares);
            int andarDestino;
            do {
                andarDestino = random.nextInt(this.andares);
            } while (andarDestino == andarOrigem);

            int tempoChegada = andarDestino - andarOrigem;

            boolean idoso = random.nextInt(100) < 30;
            boolean cadeirante = random.nextInt(100) < 10;

            fila.adicionar(i, andarOrigem, andarDestino, tempoChegada, idoso, cadeirante);
        }

        return fila;
    }
    public void pausar(){

    }

    public void continuar(){

    }

    public void salvar (){

    }




    public static void main(String[] args) {
        Simulador s = new Simulador();
        s.iniciar();
    }
}
