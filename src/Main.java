import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        ArrayList<String> corpusPrueba;
        corpusPrueba = new ArrayList<>();
        corpusPrueba.add("casa");
        corpusPrueba.add("casita");
        corpusPrueba.add("casas");
        corpusPrueba.add("cabeza");
        corpusPrueba.add("casamiento");
        corpusPrueba.add("caza");
        corpusPrueba.add("cazador");
        corpusPrueba.add("capas");
        corpusPrueba.add("casucha");

        Lector lector = new Lector();
        lector.Lematizador(corpusPrueba);
        lector.mostrarResultadosMatriz();

    }
}
