/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerc2;

/**
 *
 * @author SENA
 */


    /**
     * @param args the command line arguments
     */

        // TODO code application logic here
    
    import javax.swing.JOptionPane;

public class Ejercicio2CelsiusFahrenheitGUI {
    public static void main(String[] args) {
        final double FACTOR_MULTIPLICACION = 9.0 / 5.0;
        final double FACTOR_ADICION = 32.0;
        
        String inputCelsius = JOptionPane.showInputDialog("Ingrese la temperatura en grados Celsius:");
        double celsius = Double.parseDouble(inputCelsius);
        
        double fahrenheit = (celsius * FACTOR_MULTIPLICACION) + FACTOR_ADICION;
        
        JOptionPane.showMessageDialog(null, celsius + " °C equivalen a " + fahrenheit + " °F", "Conversión", JOptionPane.INFORMATION_MESSAGE);
    }
}

