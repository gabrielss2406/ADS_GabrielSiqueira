package banco;

/**
 * A classe ContaCorrente representa uma conta corrente em um banco, herdando da classe Conta.
 */
public class ContaCorrente extends Conta {

    /**
     * Implementação da rentabilização específica para a conta corrente.
     * A rentabilização é realizada multiplicando o saldo por 1.01.
     */
    @Override
    void rentabilizar() {
        saldo *= 1.01;
    }

    @Override
    public String toString() {
        return "Conta Corrente [saldo=" + saldo + "]";
    }
}
