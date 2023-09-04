package avancado;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Exemplo de uso de coleções em Java para armazenar objetos da classe String e operações comuns de coleções.
 */
public class SobreCollection_2 {

    public static void main(String[] args) {
        // 1. Criando uma coleção (ArrayList) para armazenar strings representando engenharias atuais
        Collection<String> engenhariasAtuais = new ArrayList<String>();

        engenhariasAtuais.add("Telecomunicação");
        engenhariasAtuais.add("Biomédica");
        engenhariasAtuais.add("Computação");
        engenhariasAtuais.add("Software");
        engenhariasAtuais.add("Produção");

        System.out.println("Engenharias atuais: " + engenhariasAtuais);

        // 2. Criando uma coleção (ArrayList) para armazenar strings representando engenharias futuras
        Collection<String> engenhariasFuturas = new ArrayList<String>();
        engenhariasFuturas.add("Mecânica");
        engenhariasFuturas.add("Mecatrônica");

        System.out.println("Engenharias futuras: " + engenhariasFuturas);

        // 3. Criando uma coleção (ArrayList) para armazenar todas as engenharias (atuais e futuras)
        Collection<String> todas = new ArrayList<String>();

        todas.addAll(engenhariasAtuais);
        todas.addAll(engenhariasFuturas);

        System.out.println("Todas as engenharias: " + todas);

        System.out.println("\n>> Entendendo isEmpty() e size()");
        // Construtor sobrecarregado que recebe outra coleção
        Collection<String> engenharias = new ArrayList<>(todas);

        System.out.println("Engenharias vazias? " + engenharias.isEmpty());
        System.out.println("Quantidade de elementos em engenharias: " + engenharias.size());

        // Esses dois são equivalentes
        imprimirStatusDaColecao(engenharias);

        System.out.println("\n>> Entendendo clear(): ");

        imprimirStatusDaColecao(engenharias);

        System.out.println("...invocando clear()");
        engenharias.clear();

        imprimirStatusDaColecao(engenharias);
    }

    private static void imprimirStatusDaColecao(Collection<String> engenharias) {
        if (engenharias.isEmpty())
            System.out.println("vazio");
        else
            System.out.println("tem elementos");
    }
}
