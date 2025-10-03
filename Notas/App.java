package Notas;

import javax.swing.*;
import Notas.Estudiante;

public class App {
    public static void main(String[] args) {
        int cantidadEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes:"));
        /* double notaMayor = -1; */
        Estudiante[] estudiante = new Estudiante[cantidadEstudiantes];
        for (int i = 0; i < cantidadEstudiantes; i++) {
            estudiante[i] = new Estudiante();
            estudiante[i].setNombre(JOptionPane.showInputDialog("Ingrese el nombre del estudiante "));
            estudiante[i].setprimeraNota(
                    Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primera nota del estudiante ")));
            estudiante[i].setsegundaNota(
                    Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota del estudiante ")));
            estudiante[i].calcularPromedio();
        }
        for (int i = 0; i < cantidadEstudiantes; i++) {
            estudiante[i].calcularPromedio();
            JOptionPane.showMessageDialog(null, estudiante[i].getNombre() + " : " + estudiante[i].getPromedio());
        }
        /* Nota mayor de estudiante correspondiente metodo 1
         * for(int i=0; i<cantidadEstudiantes; i++){
         * double primeraNota = estudiante[i].getprimeraNota();
         * double segundaNota = estudiante[i].getsegundaNota();
         * if (primeraNota > segundaNota) {
         * notaMayor = primeraNota;
         * } else {
         * notaMayor = segundaNota;
         * }
         * JOptionPane.showMessageDialog(null, "La nota mayor del estudiante " +
         * estudiante[i].getNombre() + " es: " + notaMayor);
         * }
         * metodo 2
         * if (primeranota > segundaNota) {
         * JOptionPane.showMessageDialog(null,estudiante[i].getprimeraNota());
         * } else {
         * JOptionPane.showMessageDialog(null,estudiante[i].getsegundaNota());
         * }
         */
        for (int i = 0; i < cantidadEstudiantes; i++) {
            double mayorNota = Math.max(estudiante[i].getprimeraNota(), estudiante[i].getsegundaNota());
            JOptionPane.showMessageDialog(null,
                    "La nota mayor del estudiante " + estudiante[i].getNombre() + " es: " + mayorNota);
        }
    }
}