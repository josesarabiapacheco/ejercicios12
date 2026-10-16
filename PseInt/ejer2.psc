Algoritmo CelsiusAFahrenheit
    Definir celsius, fahrenheit Como Real
    Definir FACTOR_MULTIPLICACION, FACTOR_ADICION Como Real
    
    FACTOR_MULTIPLICACION <- 9.0 / 5.0
    FACTOR_ADICION <- 32.0
    
    Escribir "Ingrese la temperatura en grados Celsius:"
    Leer celsius
    
    fahrenheit <- (celsius * FACTOR_MULTIPLICACION) + FACTOR_ADICION
    
    Escribir celsius, " °C equivalen a ", fahrenheit, " °F"
FinAlgoritmo
