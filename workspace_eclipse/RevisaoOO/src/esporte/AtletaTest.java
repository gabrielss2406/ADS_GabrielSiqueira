package esporte;

import org.junit.jupiter.api.Test;

/**
 * Classe de teste para a hierarquia de classes envolvendo Atletas e Pessoas.
 */
class AtletaTest {

    /**
     * Testa a construção de instâncias de Pessoa e Atleta.
     */
    @Test
    void testConstructor() {
        Pessoa pessoa = new Pessoa("Edson", 121);
        
        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        
        Atleta atleta = new Atleta("Edson", 21, 80, false);
        System.out.println(atleta.nome);
        System.out.println(atleta.idade);
        System.out.println(atleta.peso);
        System.out.println(atleta.aposentado);
    }
    
    /**
     * Testa as funcionalidades específicas da classe Nadador.
     */
    @Test
    void testNadador() {
        Nadador nadador = new Nadador("Gustavo", 35, 90, false);
        nadador.nadar();
        
        nadador.envelhecer();
        System.out.println(nadador.idade);
        
        nadador.aposentar();
        System.out.println(nadador.aposentado);
    }
    
    /**
     * Testa as funcionalidades específicas da classe Ciclista.
     */
    @Test
    void testCiclista() {
        Ciclista ciclista = new Ciclista("Tiago", 44, 85, false);
        System.out.println("Está aposentado");
        if(ciclista.aposentado) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
        
        ciclista.pedalar();
        ciclista.envelhecer();
        ciclista.aposentar();
        System.out.println("Agora já está aposentado!");
        System.out.println(ciclista.aposentado ? "Sim" : "Não");
    }
}
