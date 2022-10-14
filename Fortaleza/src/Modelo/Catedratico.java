package Modelo;

public class Catedratico extends Profesor {

    private int contratoSemestral;
    private int horasSemanales;
    private double valorHora;

    public Catedratico(int contratoSemestral, int horasSemanales, double valorHora, String codigo, String nombre, String titulo, Departamento departamento) {
        super(codigo, nombre, titulo, departamento);
        this.contratoSemestral = contratoSemestral;
        this.horasSemanales = horasSemanales;
        this.valorHora = valorHora;
    }

    public int getContratoSemestral() {
        return contratoSemestral;
    }

    public void setContratoSemestral(int contratoSemestral) {
        this.contratoSemestral = contratoSemestral;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    
}
