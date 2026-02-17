
/**
 *
 * @author Nappe
 */

public class Vehiculo {

    private String marca;
    private double precio;
    private String motor;

    public Vehiculo(String marca, double precio, String motor) {

        this.marca = marca;
        this.precio = precio;
        this.motor = motor;

    }

    @Override
    public String toString() {
        return "Marca: " + this.marca
                + "\nPrecio: " + this.precio
                + "\nMotor: " + this.motor;
    }

    public String getMarca() {
        return this.marca;
    }

    public double getPrecio() {
        return this.precio;
    }

    public String getMotot() {
        return this.motor;
    }

    public void setMarca(String nmarca) {
        this.marca = nmarca;
    }

    public void setPrecio(double nprecio) {
        this.precio = nprecio;
    }

    public void setMotor(String nmotor) {
        this.motor = nmotor;
    }

}
