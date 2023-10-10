package builder;


public class CarroBuilderFluente {
	private Carro carro = new Carro();
	
	public CarroBuilderFluente buildPortas(Porta[] portas) {
		carro.setPortas(portas);
		return this;
	}
	public CarroBuilderFluente buildMotor(Motor m) {
		carro.setMotor(m);
		return this;
	}
	public CarroBuilderFluente buildComputadorBordo(ComputadorBordo cb) {
		carro.setComputadorBordo(cb);
		return this;
	}
	public CarroBuilderFluente buildFreioABS(FreioABS f) {
		carro.setFreioABS(f);
		return this;
	}
	
	private void validarPortas() {
		if(carro.getPortas() == null) {
			throw new IllegalStateException("Carro sem portas!");
		}
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
