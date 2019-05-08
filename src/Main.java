import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        Enlistador enlist = new Enlistador("prueba.txt");

        ArrayList<String> corpusPrueba;
        corpusPrueba = enlist.enlistarPalabras();

        Lector lector = new Lector();
        lector.Lematizador(corpusPrueba);
        lector.mostrarResultadosMatriz();

    }
}
