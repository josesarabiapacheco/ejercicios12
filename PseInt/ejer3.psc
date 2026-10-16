Algoritmo ParidadYSigno
    Definir numero Como Entero
    
    Escribir "Ingrese un número entero:"
    Leer numero
    
    Si numero > 0 Entonces
        Escribir Sin Saltar "El número es Positivo "
        Si numero MOD 2 = 0 Entonces
            Escribir "y es Par."
        Sino
            Escribir "y es Impar."
        FinSi
    Sino
        Si numero < 0 Entonces
            Escribir Sin Saltar "El número es Negativo "
            Si numero MOD 2 = 0 Entonces
                Escribir "y es Par."
            Sino
                Escribir "y es Impar."
            FinSi
        Sino
            Escribir "El número es Cero (neutro)."
        FinSi
    FinSi
FinAlgoritmo
