package avancado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Exemplo de uso da interface Comparator em Java para ordenar uma lista de objetos da classe Animal.
 */
public class SobreComparator_1 {

    public static void main(String[] args) {
        // Criando uma lista de objetos da classe Animal
        List<Animal> listaDeAnimais = new ArrayList<>();
        
        listaDeAnimais.add(new Animal(1L, "Tartaruga"));
        listaDeAnimais.add(new Animal(2L, "Coelho"));
        listaDeAnimais.add(new Animal(3L, "Cachorro"));
        listaDeAnimais.add(new Animal(4L, "Gato"));
        listaDeAnimais.add(new Animal(5L, "Girafa"));
        listaDeAnimais.add(new Animal(6L, "Gato"));
        
        System.out.println("> Pela ordem do nome: ");
        // Ordenando a lista em ordem alfabética do nome do animal usando o comparador ComparadorPorNome
        Collections.sort(listaDeAnimais, new ComparadorPorNome());
        System.out.println(listaDeAnimais);

        System.out.println("> Pela ordem do ID");
        // Ordenando a lista em ordem crescente do ID do animal usando o comparador ComparadorPorId
        Collections.sort(listaDeAnimais, new ComparadorPorId());
        System.out.println(listaDeAnimais);
    }
}
