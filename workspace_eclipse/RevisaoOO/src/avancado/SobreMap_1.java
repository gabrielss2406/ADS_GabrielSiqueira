package avancado;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Exemplo de uso de mapas (Map) em Java com objetos personalizados.
 */
public class SobreMap_1 {

    public static void main(String[] args) {
        // Criando instâncias de animais
        Animal a1 = new Animal(1L, "Tartaruga");
        Animal a2 = new Animal(2L, "Coelho");
        Animal a3 = new Animal(3L, "Cachorro");
        Animal a4 = new Animal(4L, "Gato");
        Animal a5 = new Animal(5L, "Girafa");
        
        // Criando um mapa de animais usando a implementação HashMap
        Map<String, Animal> mapaDeAnimais = new HashMap<>();
    
        // Adicionando animais ao mapa, associando cada animal a uma chave única
        mapaDeAnimais.put("TAR", a1);
        mapaDeAnimais.put("COE", a2);
        mapaDeAnimais.put("CAO", a3);
        mapaDeAnimais.put("GAT", a4);
        mapaDeAnimais.put("GIT", a5);
        System.out.println(mapaDeAnimais);
        
        // Obtendo o conjunto de chaves do mapa
        Set<String> setDasChaves = mapaDeAnimais.keySet();
        System.out.println(setDasChaves);
    
        // Obtendo a coleção de valores do mapa
        Collection<Animal> colecaoDeValores = mapaDeAnimais.values();
        System.out.println(colecaoDeValores);
        
        // Obtendo o conjunto de pares chave-valor do mapa e iterando sobre eles
        Set<Entry<String,Animal>> entrySet = mapaDeAnimais.entrySet();
        for(Entry<String,Animal> entry : entrySet) {
            System.out.println("Chave: " + entry.getKey());
            System.out.println("Valor: " + entry.getValue());
        }
    }
}
