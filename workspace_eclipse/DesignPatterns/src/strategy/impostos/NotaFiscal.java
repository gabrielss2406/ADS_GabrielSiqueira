package strategy.impostos;

import java.time.LocalDate;

public class NotaFiscal {
	private long numero;
	private LocalDate dataEmissao;
	private double valorTotal;
	
	public NotaFiscal(long numero, LocalDate dataEmissao, double valorTotal) {
		super();
		this.numero = numero;
		this.dataEmissao = dataEmissao;
		this.valorTotal = valorTotal;
	}

	public long getNumero() {
		return numero;
	}
	public LocalDate getDataEmissao() {
		return dataEmissao;
	}
	public double getValorTotal() {
		return valorTotal;
	}
}
