package banco;

/**
 * A classe ContaPoupanca representa uma conta poupança em um banco, herdando da classe Conta.
 */
public class ContaPoupanca extends Conta {

    /**
     * Implementação da rentabilização específica para a conta poupança.
     * A rentabilização é realizada multiplicando o saldo por 1.02.
     */
    @Override
    void rentabilizar() {
        saldo *= 1.02;
    }
}
