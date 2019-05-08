import java.io.*;
import java.util.ArrayList;

public class Enlistador {

    File file;
    FileReader fileReader;
    BufferedReader br;
    private ArrayList<String> listaCorpus;
    public Enlistador(String input) throws FileNotFoundException {

        file = new File(input);
        fileReader = new FileReader(file);
        br = new BufferedReader(fileReader);
        listaCorpus = new ArrayList<>();

    }

    public ArrayList<String> enlistarPalabras() throws IOException {

        String hilera;
        while ((hilera = br.readLine()) != null){

            listaCorpus.add(hilera);
        }


        return listaCorpus;
    }
}
