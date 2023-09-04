package avancado;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Exemplo de uso de streams em Java para operações de filtragem e transformação.
 */
public class SobreStreams {
    public static void main(String[] args) {
        // Criação de uma lista de produtos
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(1L, "Cadeira", 100.0));
        produtos.add(new Produto(2L, "Cama", 400.0));
        produtos.add(new Produto(3L, "Mesa", 200.0));
        produtos.add(new Produto(4L, "Sofá", 500.0));
        produtos.add(new Produto(5L, "Cadeira", 150.0));

        // Filtragem de produtos com preço acima de 300.0
        List<Produto> produtosFiltrados = produtos.stream()
                .filter(p -> p.getPreco() > 300.0)
                .collect(Collectors.toList());
        produtosFiltrados.forEach(System.out::println);

        // Mapeamento das descrições dos produtos
        List<String> descricoes = produtos.stream()
                .map(Produto::getDescricao)
                .collect(Collectors.toList());
        descricoes.forEach(System.out::println);

        // Cálculo do preço total de todos os produtos
        Double precoTotal = produtos.stream()
                .map(Produto::getPreco)
                .reduce(0.0, Double::sum);
        System.out.println(precoTotal);

        // Cálculo do total de preços para produtos com preço abaixo de 300.0
        Double totalParaAbaixoDe300 = produtos.stream()
                .filter(p -> p.getPreco() < 300.0)
                .map(Produto::getPreco)
                .reduce(0.0, Double::sum);
        System.out.println(totalParaAbaixoDe300);
    }
}
