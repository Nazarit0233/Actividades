package Notas;
import javax.swing.*;

import Notas.Estudiante;
public class App {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante:"));
        String carrera = JOptionPane.showInputDialog("Ingrese la carrera del estudiante:");

        Estudiante estudiante = new Estudiante(nombre, edad, carrera);
        JOptionPane.showMessageDialog(null, "Datos del estudiante:\n" + estudiante.toString());
    }
}
