package builder;

/**
 * The Carro class represents a car entity.
 *
 * It contains information about the car's doors, motor, onboard computer, and ABS brake system.
 *
 * @author Gabriel Siqueira
 * @version 1.0
 */
public class Carro {
    private Porta[] portas;
    private Motor motor;
    private ComputadorBordo computadorBordo;
    private FreioABS freioABS;

    /**
     * Gets the array of doors of the car.
     *
     * @return the array of doors
     */
    public Porta[] getPortas() {
        return portas;
    }

    /**
     * Sets the array of doors for the car.
     *
     * @param portas an array of doors
     */
    public void setPortas(Porta[] portas) {
        this.portas = portas;
    }

    /**
     * Gets the motor of the car.
     *
     * @return the motor of the car
     */
    public Motor getMotor() {
        return motor;
    }

    /**
     * Sets the motor for the car.
     *
     * @param motor the motor of the car
     */
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    /**
     * Gets the onboard computer of the car.
     *
     * @return the onboard computer of the car
     */
    public ComputadorBordo getComputadorBordo() {
        return computadorBordo;
    }

    /**
     * Sets the onboard computer for the car.
     *
     * @param computadorBordo the onboard computer of the car
     */
    public void setComputadorBordo(ComputadorBordo computadorBordo) {
        this.computadorBordo = computadorBordo;
    }

    /**
     * Gets the ABS brake system of the car.
     *
     * @return the ABS brake system of the car
     */
    public FreioABS getFreioABS() {
        return freioABS;
    }

    /**
     * Sets the ABS brake system for the car.
     *
     * @param freioABS the ABS brake system of the car
     */
    public void setFreioABS(FreioABS freioABS) {
        this.freioABS = freioABS;
    }
}
