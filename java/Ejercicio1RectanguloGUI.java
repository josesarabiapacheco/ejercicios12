/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer1;

/**
 *
 * @author SENA
 */

import javax.swing.JOptionPane;

public class Ejercicio1RectanguloGUI {
    public static void main(String[] args) {
        String inputBase = JOptionPane.showInputDialog("Ingrese la base del rectángulo:");
        double base = Double.parseDouble(inputBase);
        
        String inputAltura = JOptionPane.showInputDialog("Ingrese la altura del rectángulo:");
        double altura = Double.parseDouble(inputAltura);
        
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        
        String mensaje = "--- Resultados ---\n" +
                         "Área del rectángulo: " + area + "\n" +
                         "Perímetro del rectángulo: " + perimetro;
                         
        JOptionPane.showMessageDialog(null, mensaje, "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
} 

