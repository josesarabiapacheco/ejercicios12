/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerc3;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class Ejerc3 {



    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog(null, "Ingrese un número entero:", "Ejercicio 3", JOptionPane.QUESTION_MESSAGE);
        
        if (entrada != null && !entrada.isEmpty()) {
            int num = Integer.parseInt(entrada);
            String mensaje = "";

            if (num == 0) {
                mensaje = "El número es cero (neutro) y es par.";
            } else {
                // Condicional anidada para el signo
                if (num > 0) {
                    mensaje += "El número es positivo ";
                } else {
                    mensaje += "El número es negativo ";
                }

                // Condicional anidada para la paridad
                if (num % 2 == 0) {
                    mensaje += "y es par.";
                } else {
                    mensaje += "y es impar.";
                }
            }

            JOptionPane.showMessageDialog(null, mensaje, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

    