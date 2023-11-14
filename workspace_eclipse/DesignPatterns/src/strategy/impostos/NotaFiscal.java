package strategy.impostos;

import java.time.LocalDate;

/**
 * The NotaFiscal class represents an invoice with a unique number, emission date, and total value.
 * It is used to store information related to a financial transaction.
 * 
 * @author Gabriel Siqueira
 * @version 1.0
 */
public class NotaFiscal {
    
    private long numero;
    private LocalDate dataEmissao;
    private double valorTotal;

    /**
     * Constructs a new NotaFiscal with the specified parameters.
     * 
     * @param numero       the unique number of the invoice
     * @param dataEmissao  the date when the invoice was issued
     * @param valorTotal   the total value of the invoice
     */
    public NotaFiscal(long numero, LocalDate dataEmissao, double valorTotal) {
        super();
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        this.valorTotal = valorTotal;
    }

    /**
     * Gets the unique number of the invoice.
     * 
     * @return the unique number of the invoice
     */
    public long getNumero() {
        return numero;
    }

    /**
     * Gets the date when the invoice was issued.
     * 
     * @return the date of issuance
     */
    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    /**
     * Gets the total value of the invoice.
     * 
     * @return the total value of the invoice
     */
    public double getValorTotal() {
        return valorTotal;
    }
}
