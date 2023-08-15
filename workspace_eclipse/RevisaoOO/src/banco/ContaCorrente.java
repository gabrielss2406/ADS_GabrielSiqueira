package banco;

public class ContaCorrente extends Conta {
	@Override
	void rentabilizar() {
		saldo *= 1.01;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente [saldo=" + saldo + "]";
	}
}
