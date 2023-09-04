package banco;

/**
 * A classe abstrata Conta representa uma conta genérica em um banco.
 */
public abstract class Conta {

    Double saldo = 0.0;

    /**
     * Realiza a rentabilização da conta.
     */
    void rentabilizar() {}

    /**
     * Realiza um depósito na conta.
     *
     * @param valor O valor a ser depositado.
     */
    void depositar(Double valor) {
        saldo += valor;
    }

    /**
     * Realiza um saque na conta.
     *
     * @param valor O valor a ser sacado.
     */
    void sacar(Double valor) {
        saldo -= valor;
    }

    @Override
    public String toString() {
        return "Conta [saldo=" + saldo + "]";
    }
}
