import java.util.ArrayList;

public class Lector {

    private int letraLimite;
    private static int letraInicio = 0;
    private String letraSiguiente;
    private ArrayList<String> listaLetrasSucesoras;
    public ArrayList<ArrayList<String>> matrizResultados;

    public Lector(){

        letraLimite = 1;
        letraSiguiente = null;
        listaLetrasSucesoras = new ArrayList<>();

    }

    public void Lematizador(ArrayList<String> listaCorpus){

        String palabraDeCorpus;
        for (int i = 0; i < listaCorpus.size(); i++) {

            palabraDeCorpus = listaCorpus.get(i);

            for (int n = 0; n < palabraDeCorpus.length(); n++) {

                String prefijoActual = palabraDeCorpus.substring(letraInicio, letraLimite);

                for (int j = 0; j < listaCorpus.size(); j++) {

                    if (listaCorpus.get(j).startsWith(prefijoActual)){

                        letraSiguiente = listaCorpus.get(j).substring(letraLimite, letraLimite+1);
                        if (letraSiguiente != null && !listaLetrasSucesoras.contains(letraSiguiente)){

                            listaLetrasSucesoras.add(letraSiguiente);
                        }
                    }
                }

                //agrega datos a la matriz
                listaLetrasSucesoras.clear();
                letraLimite++;
            }
        }
    }
}
