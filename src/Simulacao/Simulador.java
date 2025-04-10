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
            fila.adicionar(i, random.nextInt(this.andares), 0, random.nextInt(50), false, false);
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
