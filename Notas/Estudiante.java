package Notas;

public class Estudiante {
    private String nombre;
    private double primeraNota;
    private double segundaNota;
    private double promedio;

    public Estudiante() {

    }

    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = "";
        this.primeraNota = 0.0;
        this.segundaNota = 0.0;
        this.promedio = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getprimeraNota() {
        return primeraNota;
    }

    public void setprimeraNota(double primeraNota) {
        this.primeraNota = primeraNota;
    }

    public double getsegundaNota() {
        return segundaNota;
    }

    public void setsegundaNota(double segundaNota) {
        this.segundaNota = segundaNota;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void calcularPromedio() {
        this.promedio = (primeraNota + segundaNota) / 2;
    }

    /*
    public double calcularNotaMayor() {
        return Math.max(primeraNota, segundaNota);
    }
    */

    public double calcularNotaMayor() {
        if (primeraNota > segundaNota) {
            return primeraNota;
        } else {
            return segundaNota;
        }
    }

    @Override
    public String toString() {
        return nombre + " es el estudiante con mayor promedio del primer corte, con un promedio de: " + promedio;
    }
}
