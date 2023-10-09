package builder;

public class CarroBuilder {
	private Carro carro = new Carro();
	
	public void buildPortas(Porta[] portas) {
		carro.setPortas(portas);
	}
	public void buildMotor(Motor m) {
		carro.setMotor(m);
	}
	public void buildComputadorBordo(ComputadorBordo cb) {
		carro.setComputadorBordo(cb);
	}
	public void buildFreioABS(FreioABS f) {
		carro.setFreioABS(f);
	}
	
	private void validarPortas() {
		int qntPortas = carro.getPortas().length;
		if(!(qntPortas == 2 || qntPortas == 4)) {
			throw new IllegalStateException("Numero de portas inválido!");
		}
	}
	private void validarMotor() {
		if (carro.getMotor() == null) {
			throw new IllegalStateException("Não tem motor");
		}
	}
	
	public Carro getCarro() {
		validarPortas();
		validarMotor();
		return carro;
	}
}
