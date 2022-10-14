package Modelo;

import java.util.Date;

public class Planta extends Profesor {

    private double salarioBasico;
    private int puntosSalariales;
    private double valorPunto;
    private String categoria;
    private String numResNombramiento;
    private Date fechaNombramiento;

    public Planta() {
    }

    public Planta(int salarioBasico, int puntosSalariales, int valorPunto, String categoria, String numResNombramiento, Date fechaNombramiento, String codigo, String nombre, String titulo, Departamento departamento) {
        super(codigo, nombre, titulo, departamento);
        this.salarioBasico = salarioBasico;
        this.puntosSalariales = puntosSalariales;
        this.valorPunto = valorPunto;
        this.categoria = categoria;
        this.numResNombramiento = numResNombramiento;
        this.fechaNombramiento = fechaNombramiento;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public int getPuntosSalariales() {
        return puntosSalariales;
    }

    public void setPuntosSalariales(int puntosSalariales) {
        this.puntosSalariales = puntosSalariales;
    }

    public double getValorPunto() {
        return valorPunto;
    }

    public void setValorPunto(double valorPunto) {
        this.valorPunto = valorPunto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNumResNombramiento() {
        return numResNombramiento;
    }

    public void setNumResNombramiento(String numResNombramiento) {
        this.numResNombramiento = numResNombramiento;
    }

    public Date getFechaNombramiento() {
        return fechaNombramiento;
    }

    public void setFechaNombramiento(Date fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }

    public void calcularSalario() {

        double valTotalPunto = getPuntosSalariales() * getValorPunto();
        double salarioTotal = valTotalPunto + salarioBasico;
        
    }

}
