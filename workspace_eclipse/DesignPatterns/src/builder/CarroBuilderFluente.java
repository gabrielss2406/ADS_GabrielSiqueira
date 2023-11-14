package builder;

/**
 * Fluent builder class for constructing a {@link Carro} object.
 *
 * This builder enforces a specific order for building a car. It starts by setting the doors, followed by the motor,
 * onboard computer, and ABS brake system. The car is then validated before being returned.
 *
 * @author Gabriel Siqueira
 * @version 1.0
 */
public class CarroBuilderFluente {
    private Carro carro = new Carro();

    /**
     * Sets the doors of the car.
     *
     * @param portas an array of doors
     * @return the current builder instance
     */
    public CarroBuilderFluente buildPortas(Porta[] portas) {
        carro.setPortas(portas);
        return this;
    }

    /**
     * Sets the motor of the car.
     *
     * @param m the motor of the car
     * @return the current builder instance
     */
    public CarroBuilderFluente buildMotor(Motor m) {
        carro.setMotor(m);
        return this;
    }

    /**
     * Sets the onboard computer of the car.
     *
     * @param cb the onboard computer of the car
     * @return the current builder instance
     */
    public CarroBuilderFluente buildComputadorBordo(ComputadorBordo cb) {
        carro.setComputadorBordo(cb);
        return this;
    }

    /**
     * Sets the ABS brake system of the car.
     *
     * @param f the ABS brake system of the car
     * @return the current builder instance
     */
    public CarroBuilderFluente buildFreioABS(FreioABS f) {
        carro.setFreioABS(f);
        return this;
    }

    // Private methods for validation

    /**
     * Validates the number of doors in the car.
     * 
     * @throws IllegalStateException if the number of doors is invalid
     */
    private void validarPortas() {
        if (carro.getPortas() == null) {
            throw new IllegalStateException("Carro sem portas!");
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
