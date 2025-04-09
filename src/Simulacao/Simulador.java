package Simulacao;

import Base.Predio;

import java.util.Scanner;

public class Simulador {

    Scanner teclado = new Scanner(System.in);

    public void iniciar(){
        System.out.println("Iniciando a Simulação");

        System.out.print("Digite a quantidade de andares: ");
        int andares = teclado.nextInt();
        System.out.print("Digite a quantidade de elevadores: ");
        int elevadores = teclado.nextInt();

        Predio v1 = new Predio(andares, elevadores);
        v1.imprimirPredio();
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
