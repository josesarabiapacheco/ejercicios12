/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerc6;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class Ejerc6 {

    public static void main(String[] args) {
        System.out.println("He"
                + ""
                + "llo World!");
    
        double suma = 0;
        int cantidad = 0;

        while (true) {
            String entrada = JOptionPane.showInputDialog(null, 
                "Ingrese un número mayor o igual a 0.\n(Ingrese un número negativo para finalizar):", 
                "Acumulador", JOptionPane.QUESTION_MESSAGE);

            if (entrada == null) {
                break; 
            }

            double num = Double.parseDouble(entrada);

            // Uso de estructura si / sino para evaluar la parada
            if (num < 0) {
                break;
            } else {
                suma += num;
                cantidad++;
            }
        }

        if (cantidad > 0) {
            double promedio = suma / cantidad;
            String reporte = "RESULTADOS FINALES\n"
                           + "Suma total: " + suma + "\n"
                           + "Cantidad de números ingresados: " + cantidad + "\n"
                           + "Promedio: " + promedio;

            JOptionPane.showMessageDialog(null, reporte, "Resumen", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresaron números válidos.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
}