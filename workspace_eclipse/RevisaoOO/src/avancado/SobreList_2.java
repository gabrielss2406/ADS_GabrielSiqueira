package avancado;

import java.util.ArrayList;
import java.util.List;

/**
 * Exemplo de uso de uma lista (List) para armazenar objetos da classe Animal.
 */
public class SobreList_2 {

    public static void main(String[] args) {
        // Criando uma lista de animais usando ArrayList
        List<Animal> listaDeAnimais = new ArrayList<>();
        
        // Adicionando animais à lista
        listaDeAnimais.add(new Animal(1L, "Tartaruga"));
        listaDeAnimais.add(new Animal(2L, "Coelho"));
        listaDeAnimais.add(new Animal(3L, "Cachorro"));
        listaDeAnimais.add(new Animal(4L, "Gato"));
        listaDeAnimais.add(new Animal(5L, "Girafa"));
        listaDeAnimais.add(new Animal(6L, "Gato"));
        
        // Imprimindo a lista de animais
        System.out.println(listaDeAnimais);
    }
}
