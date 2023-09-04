package avancado;

import java.util.Objects;

/**
 * A classe Animal representa um animal com um identificador único (ID) e um nome.
 * Implementa a interface Comparable para permitir a comparação com base no nome do animal.
 */
public class Animal implements Comparable<Animal> {
    private Long id;
    private String nome;
    
    /**
     * Construtor para criar uma instância de Animal com o ID e o nome especificados.
     *
     * @param id   O identificador único do animal.
     * @param nome O nome do animal.
     */
    public Animal(Long id, String nome) {
        super();
        this.id = id;
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "Animal [id=" + id + ", nome=" + nome + "]";
    }
    
    /**
     * Implementação do método compareTo da interface Comparable para comparar animais com base no nome.
     *
     * @param that O animal a ser comparado.
     * @return Um valor negativo se este animal vier antes de "that" na ordem alfabética, um valor positivo
     *         se este animal vier depois de "that" e 0 se os nomes forem iguais.
     */
    @Override
    public int compareTo(Animal that) {
        return this.nome.compareTo(that.nome);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Animal other = (Animal) obj;
        return Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
    }

    /**
     * Obtém o identificador único do animal.
     *
     * @return O identificador único do animal.
     */
    public Long getId() {
        return id;
    }

    /**
     * Obtém o nome do animal.
     *
     * @return O nome do animal.
     */
    public String getNome() {
        return nome;
    }
}
