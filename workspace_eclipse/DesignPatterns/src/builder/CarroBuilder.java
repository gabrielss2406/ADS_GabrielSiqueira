package builder;

/**
 * The CarroBuilder class constructs a {@link Carro} object in a step-by-step manner.
 *
 * It allows the construction of a car by setting its doors, motor, onboard computer, and ABS brake system. The built car
 * is then validated before being returned.
 *
 * @author Gabriel Siqueira
 * @version 1.0
 */
public class CarroBuilder {
    private Carro carro = new Carro();

    /**
     * Sets the doors of the car.
     *
     * @param portas an array of doors
     */
    public void buildPortas(Porta[] portas) {
        carro.setPortas(portas);
    }

    /**
     * Sets the motor of the car.
     *
     * @param m the motor of the car
     */
    public void buildMotor(Motor m) {
        carro.setMotor(m);
    }

    /**
     * Sets the onboard computer of the car.
     *
     * @param cb the onboard computer of the car
     */
    public void buildComputadorBordo(ComputadorBordo cb) {
        carro.setComputadorBordo(cb);
    }

    /**
     * Sets the ABS brake system of the car.
     *
     * @param f the ABS brake system of the car
     */
    public void buildFreioABS(FreioABS f) {
        carro.setFreioABS(f);
    }

    // Private methods for validation

    /**
     * Validates the number of doors in the car.
     *
     * @throws IllegalStateException if the number of doors is invalid
     */
    private void validarPortas() {
        if (carro.getPortas() == null) {
            throw new IllegalStateException("Numero de portas inválido!");
        }
        int qntPortas = carro.getPortas().length;
        if (!(qntPortas == 2 || qntPortas == 4)) {
            throw new IllegalStateException("Numero de portas inválido!");
        }
    }

    /**
     * Validates the presence of a motor in the car.
     *
     * @throws IllegalStateException if the car has no motor
     */
    private void validarMotor() {
        if (carro.getMotor() == null) {
            throw new IllegalStateException("Não tem motor");
        }
    }

    /**
     * Builds and validates the {@link Carro} object.
     *
     * @return the constructed and validated Carro object
     * @throws IllegalStateException if the car configuration is invalid
     */
    public Carro getCarro() {
        validarPortas();
        validarMotor();
        return carro;
    }
}
