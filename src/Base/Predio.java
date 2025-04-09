package Base;

public class Predio {

    private int andares;
    private int elevadores;
// lembrar de elevador maior que 0
//lembrar de andares maior que 0


    public Predio(int andares, int elevadores) {
        this.andares = andares;
        this.elevadores = elevadores;
    }

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }

    public int getElevadores() {
        return elevadores;
    }

    public void setElevadores(int elevadores) {
        this.elevadores = elevadores;
    }

    public void imprimirPredio(){
        System.out.println("Andares: " + andares);
        System.out.println("Elevadores: " + elevadores);
    }

}





