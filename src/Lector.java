import java.util.ArrayList;

public class Lector {

    private int letraLimite;
    private static int letraInicio = 0;
    private String letraSiguiente;
    private ArrayList<String> listaLetrasSucesoras;
    private ArrayList<ArrayList<String>> matrizResultados;
    private int cantidadSucesores;

    public Lector(){

        letraLimite = 1;
        letraSiguiente = null;
        listaLetrasSucesoras = new ArrayList<>();
        cantidadSucesores= 0;
        matrizResultados = new ArrayList<ArrayList<String>>();

    }

    public void Lematizador(ArrayList<String> listaCorpus){

        String palabraDeCorpus;
        for (int i = 0; i < listaCorpus.size(); i++) {

            palabraDeCorpus = listaCorpus.get(i);

            for (int n = 0; n < palabraDeCorpus.length(); n++) {
                String prefijoActual;
                prefijoActual = obtenerSubHilera(palabraDeCorpus, letraInicio, letraLimite);
                cantidadSucesores = 0;

                for (int j = 0; j < listaCorpus.size(); j++) {

                    if (listaCorpus.get(j).startsWith(prefijoActual)){

                        letraSiguiente = obtenerSubHilera(listaCorpus.get(j), letraLimite, letraLimite+1);

                        if (!listaLetrasSucesoras.contains(letraSiguiente)){

                            listaLetrasSucesoras.add(letraSiguiente);
                            cantidadSucesores++;
                        }
                    }
                }

                //agrega datos a la matriz
                ArrayList<String>sublistaDeTerminosyCantidades = new ArrayList<>();
                sublistaDeTerminosyCantidades.add(prefijoActual);
                sublistaDeTerminosyCantidades.add(Integer.toString(cantidadSucesores));
                matrizResultados.add(sublistaDeTerminosyCantidades);

                listaLetrasSucesoras.clear();
                letraLimite++;
            }
            letraLimite = 0;
        }
    }

    private String obtenerSubHilera(String hileraOriginal, int indiceInicio, int indiceFinal){

        if (hileraOriginal.length()>letraLimite) {
            return hileraOriginal.substring(indiceInicio, indiceFinal);
        }else {

            return hileraOriginal.substring(letraInicio);
        }

    }

    public void mostrarResultadosMatriz(){

        for (int out = 0; out < matrizResultados.size(); out++) {

            for (int p = 0; p < matrizResultados.get(out).size(); p++) {

                System.out.println(matrizResultados.get(out).get(p));
                System.out.println();

            }
        }
    }



}
