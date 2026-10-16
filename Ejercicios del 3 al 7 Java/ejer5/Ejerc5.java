/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerc5;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class Ejerc5 {

    public static void main(String[] args) {
    

    
        String entrada = JOptionPane.showInputDialog(null, "Ingrese un número entero N:", "Tabla de Multiplicar", JOptionPane.QUESTION_MESSAGE);

        if (entrada != null && !entrada.isEmpty()) {
            int n = Integer.parseInt(entrada);
            int contadorPares = 0;
            StringBuilder tabla = new StringBuilder("Tabla de multiplicar del " + n + " \n\n");

            for (int i = 1; i <= 10; i++) {
                int resultado = n * i;
                tabla.append(n).append(" x ").append(i).append(" = ").append(resultado).append("\n");

                if (resultado % 2 == 0) {
                    contadorPares++;
                } else {
                    // Estructura si / sino opcional para control interno
                }
            }

            tabla.append("\nCantidad de resultados pares obtenidos: ").append(contadorPares);

            JOptionPane.showMessageDialog(null, tabla.toString(), "Resultado Ejercicio 5", JOptionPane.INFORMATION_MESSAGE);
    
        }
    }
        }