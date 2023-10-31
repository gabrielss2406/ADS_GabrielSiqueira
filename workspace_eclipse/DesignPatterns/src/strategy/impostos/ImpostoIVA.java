package strategy.impostos;

public class ImpostoIVA implements Tributavel {
	private static final double ALIQUOTA_IVA = 0.05;

	@Override
	public double calcularImposto(double valorTotalNF) {
		return valorTotalNF * ALIQUOTA_IVA;
	}

}
