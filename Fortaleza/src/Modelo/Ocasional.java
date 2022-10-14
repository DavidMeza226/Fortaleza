package Modelo;

public class Ocasional extends Profesor {

    private double salarioBasico;

    public Ocasional(int salarioBasico, String codigo, String nombre, String titulo, Departamento departamento) {
        super(codigo, nombre, titulo, departamento);
        this.salarioBasico = salarioBasico;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }
    
}
