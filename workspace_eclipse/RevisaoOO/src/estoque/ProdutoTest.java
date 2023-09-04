package estoque;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

/**
 * Classe de teste para a classe Produto.
 */
class ProdutoTest {

    /**
     * Testa a funcionalidade básica da classe Produto como um JavaBean.
     */
    @Test
    void testProdutoComoJavaBean() {
        Produto p = new Produto();
        p.setDescricao("Queijo Minas 1Kg");
        p.setValorCompra(50.00);
        p.setDataValidade(LocalDate.of(2022, Month.DECEMBER, 30));
        
        System.out.println("Dados do produto:");
        System.out.println(p.getDescricao());
        System.out.println(p.getValorCompra());
        System.out.println(p.getDataValidade());
    }
}
