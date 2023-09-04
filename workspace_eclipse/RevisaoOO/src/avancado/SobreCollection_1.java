package avancado;

import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Exemplo de uso de coleções em Java para armazenar objetos da classe String.
 */
public class SobreCollection_1 {

    public static void main(String[] args) {
        // Criando uma coleção (TreeSet) para armazenar strings
        Collection<String> colecao = extracted();
        
        // Adicionando strings à coleção
        colecao.add("Gato");
        colecao.add("Cachorro");
        colecao.add("Leão");
        colecao.add("Pantera");
        colecao.add("Avestruz");
        
        // Imprimindo a coleção
        System.out.println(colecao);
    }

    /**
     * Método para criar e retornar um TreeSet vazio de strings.
     *
     * @return Um TreeSet vazio de strings.
     */
    private static TreeSet<String> extracted() {
        return new TreeSet<String>();
    }
}
