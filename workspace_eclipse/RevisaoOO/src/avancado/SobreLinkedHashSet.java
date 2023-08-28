package avancado;

import java.util.LinkedHashSet;
import java.util.Set;

public class SobreLinkedHashSet {

    public static void main(String[] args) {
        Set<Animal> setDeAnimais = new LinkedHashSet<>();

        setDeAnimais.add(new Animal(1L, "Tartaruga"));
        setDeAnimais.add(new Animal(2L, "Coelho"));
        setDeAnimais.add(new Animal(3L, "Cachorro"));
        setDeAnimais.add(new Animal(4L, "Gato"));

        for (Animal animal : setDeAnimais) {
            System.out.println(animal);
        }
    }
}