package banco;

public class ContaPoupanca extends Conta {
	@Override
	void rentabilizar() {
		saldo *= 1.02;
	}
}
