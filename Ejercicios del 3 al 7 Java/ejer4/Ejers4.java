/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejers4;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class Ejers4 {


    public static void main(String[] args) {
        System.out.println("Hello World!");


   
        String menu = " CALCULADORA BÁSICA\n"
                    + "1. Suma\n"
                    + "2. Resta\n"
                    + "3. Multiplicación\n"
                    + "4. División\n\n"
                    + "Seleccione una opción (1-4):";

        String opcionStr = JOptionPane.showInputDialog(null, menu, "Menú", JOptionPane.QUESTION_MESSAGE);

        if (opcionStr != null && !opcionStr.isEmpty()) {
            int opcion = Integer.parseInt(opcionStr);

            double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número:"));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo número:"));

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Resultado: " + (num1 + num2));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Resultado: " + (num1 - num2));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Resultado: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(null, "Error: No es posible dividir entre cero.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Resultado: " + (num1 / num2));
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}


