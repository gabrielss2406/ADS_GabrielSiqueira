package avancado;

/**
 * Exemplo de uso de arrays em Java para armazenar objetos da classe Animal.
 */
public class SobreArrays {

    public static void main(String[] args) {
        // Criando um array de objetos da classe Animal com tamanho 4
        Animal[] arrayDeAnimais = new Animal[4];
        
        // Inicializando elementos do array com instâncias da classe Animal
        arrayDeAnimais[0] = new Animal(1L, "Tartaruga");
        arrayDeAnimais[1] = new Animal(2L, "Coelho");
        arrayDeAnimais[2] = new Animal(3L, "Cachorro");
        arrayDeAnimais[3] = new Animal(4L, "Gato");
        
        System.out.println("Array de Animais: ");
        
        // Iterando pelo array e imprimindo o nome de cada animal
        for (Animal animal : arrayDeAnimais)
            System.out.println(animal.getNome());
    }
}
