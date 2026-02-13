/**
 *
 * @author Nappe
 */

public class Vehiculo {
    
    private String marca;
    private double precio;
    private String motor;
    
    public Vehiculo(String marca, double precio, String motor){
    
        this.marca = marca;
        this.precio = precio;
        this.motor = motor;
            
    }
    
    @Override
    public String toString(){
        return "Marca: " + this.marca
            + "\nPrecio: " + this.precio
            + "\nMotor: " + this.motor;
    }
    
}
