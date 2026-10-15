Algoritmo AcumuladorPromedio
    Definir valor, suma Como Real
    Definir cantidad Como Entero
    
    suma <- 0
    cantidad <- 0
    
    Escribir "Ingrese números (ingrese un número negativo para finalizar):"
    
    Repetir
        Leer valor
        Si valor >= 0 Entonces
            suma <- suma + valor
            cantidad <- cantidad + 1
        FinSi
    Hasta Que valor < 0
    
    Si cantidad > 0 Entonces
        Escribir " Resultados Finales "
        Escribir "Suma total: ", suma
        Escribir "Cantidad de números ingresados: ", cantidad
        Escribir "Promedio: ", (suma / cantidad)
    Sino
        Escribir "No se ingresaron números válidos."
    FinSi
FinAlgoritmo
