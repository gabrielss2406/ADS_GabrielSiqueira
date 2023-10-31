package strategy.impostos;

public class ImpostoICMS implements Tributavel {
	private static final double ALIQUOTA_ICMS = 0.10;

	@Override
	public double calcularImposto(double valorTotalNF) {
		return valorTotalNF * ALIQUOTA_ICMS;
	}
}
