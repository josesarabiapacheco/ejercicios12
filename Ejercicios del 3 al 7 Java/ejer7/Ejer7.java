/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

    package com.mycompany.ejer7;

import javax.swing.JOptionPane;

public class Ejer7 {

    public static void main(String[] args) {
        double suma = 0;
        int cantidad = 0;

        while (true) {
            String entrada = JOptionPane.showInputDialog(null,
                "Ingrese un número mayor o igual a 0.\n"
                + "Para finalizar: escriba un número negativo (ej: -1),\n"
                + "deje el campo vacío o presione Cancelar.",
                "Acumulador", JOptionPane.QUESTION_MESSAGE);

            // Cancelar, cerrar ventana o campo vacío -> terminar
            if (entrada == null || entrada.trim().isEmpty()) {
                break;
            }

            try {
                // Acepta "2,5" y "2.5"
                double num = Double.parseDouble(entrada.trim().replace(",", "."));

                if (num < 0) {
                    break; // negativo -> terminar
                }

                suma += num;
                cantidad++;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                    "Entrada inválida. Ingrese solo números.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (cantidad > 0) {
            double promedio = suma / cantidad;
            String reporte = "RESULTADOS FINALES\n"
                           + "Suma total: " + suma + "\n"
                           + "Cantidad de números ingresados: " + cantidad + "\n"
                           + "Promedio: " + promedio;

            JOptionPane.showMessageDialog(null, reporte, "Resumen",
                JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresaron números válidos.",
                "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
}