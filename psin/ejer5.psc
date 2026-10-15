Algoritmo TablaMultiplicar
    Definir n, i, producto, contadorPares Como Entero
    
    Escribir "Ingrese un número entero N:"
    Leer n
    
    contadorPares <- 0
    Escribir "Tabla de multiplicar del ", n, ":"
    
    Para i <- 1 Hasta 10 Con Paso 1 Hacer
        producto <- n * i
        Escribir n, " x ", i, " = ", producto
        
        Si producto MOD 2 = 0 Entonces
            contadorPares <- contadorPares + 1
        FinSi
    FinPara
    
    Escribir "Cantidad de resultados pares obtenidos: ", contadorPares
FinAlgoritmo
