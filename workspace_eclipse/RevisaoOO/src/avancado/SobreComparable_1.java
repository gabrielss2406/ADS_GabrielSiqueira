package avancado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Exemplo de uso da interface Comparable em Java para ordenar uma lista de strings.
 */
public class SobreComparable_1 {

    public static void main(String[] args) {
        // Criando uma lista de strings
        List<String> listaDeAlimentos = new ArrayList<String>();
        listaDeAlimentos.add("Damasco");
        listaDeAlimentos.add("Batata");
        listaDeAlimentos.add("Arroz");
        listaDeAlimentos.add("Cenoura");

        System.out.println("> Pela ordem de inserção: ");
        System.out.println(listaDeAlimentos);

        // Ordenando a lista em ordem alfabética usando a função Collections.sort
        System.out.println("> Pela ordem alfabética: ");
        Collections.sort(listaDeAlimentos);
        System.out.println(listaDeAlimentos);
    }
}
