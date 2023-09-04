package avancado;

import java.util.ArrayList;
import java.util.List;

/**
 * Exemplo de uso de uma lista (List) para armazenar alimentos.
 */
public class SobreList_1 {

    public static void main(String[] args) {
        // Criando uma lista de alimentos usando ArrayList
        List<String> listaDeAlimentos = new ArrayList<String>();
        
        // Adicionando alimentos à lista
        listaDeAlimentos.add("Damasco");
        listaDeAlimentos.add("Batata");
        listaDeAlimentos.add("Arroz");
        listaDeAlimentos.add("Cenoura");
        
        // Imprimindo a lista de alimentos
        System.out.println(listaDeAlimentos);
    }
}
