import Base.Pessoa;
import Logica.FiladeEspera;

public class Main {
    public static void main(String[] args) {

        FiladeEspera fila = new FiladeEspera();

        // Adicionando pessoas
        fila.adicionar(1, 0, 5, 10, false, false);
        fila.adicionar(2, 3, 7, 15, true, false);
        fila.adicionar(6, 2, 0, 20, false, true);
        fila.adicionar(4, 1, 4, 25, true, true);
        fila.adicionar(3, 1, 4, 25, true, true);
        fila.adicionar(7, 1, 4, 25, true, true);

        fila.imprimir();

        fila.retirar(1);

        fila.imprimir();


    }
}
