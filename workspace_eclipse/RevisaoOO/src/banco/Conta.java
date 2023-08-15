package banco;

public abstract class Conta {
	
	Double saldo = 0.0;
	
	void rentabilizar() {}
	
	void depositar(Double valor) {
		saldo += valor;
	}
	
	void sacar(Double valor) {
		saldo -= valor;
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + "]";
	}
}
