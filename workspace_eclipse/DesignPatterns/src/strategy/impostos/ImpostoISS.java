package strategy.impostos;

public class ImpostoISS implements Tributavel {
	private static final double ALIQUOTA_ISS = 0.02;

	@Override
	public double calcularImposto(double valorTotalNF) {
		return valorTotalNF * ALIQUOTA_ISS;
	}
}
