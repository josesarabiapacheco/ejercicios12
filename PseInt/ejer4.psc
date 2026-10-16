Algoritmo CalculadoraBasica
    Definir opcion Como Entero
    Definir num1, num2 Como Real
    
    Escribir "=== CALCULADORA BÁSICA ==="
    Escribir "1. Suma"
    Escribir "2. Resta"
    Escribir "3. Multiplicación"
    Escribir "4. División"
    Escribir "Seleccione una opción (1-4):"
    Leer opcion
    
    Escribir "Ingrese el primer número:"
    Leer num1
    Escribir "Ingrese el segundo número:"
    Leer num2
    
    Segun opcion Hacer
        1:
            Escribir "Resultado: ", (num1 + num2)
        2:
            Escribir "Resultado: ", (num1 - num2)
        3:
            Escribir "Resultado: ", (num1 * num2)
        4:
            Si num2 <> 0 Entonces
                Escribir "Resultado: ", (num1 / num2)
            Sino
                Escribir "Error: No se puede dividir entre cero."
            FinSi
        De Otro Modo:
            Escribir "Opción de menú inválida."
    FinSegun
FinAlgoritmo
