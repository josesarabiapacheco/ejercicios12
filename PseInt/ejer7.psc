Algoritmo CuentaBancariaSimulacion
    Definir titular Como Cadena
    Definir saldo, monto Como Real
    Definir opcion Como Entero
    
    // Inicialización de valores (simulando el constructor)
    titular <- "Carlos Pérez"
    saldo <- 300000.0
    
    Repetir
        Escribir ""
        Escribir "=== MENÚ CUENTA BANCARIA ==="
        Escribir "1. Consultar Saldo"
        Escribir "2. Depositar Dinero"
        Escribir "3. Retirar Dinero"
        Escribir "4. Salir"
        Escribir "Seleccione una opción:"
        Leer opcion
        
        Segun opcion Hacer
            1:
                Escribir "Titular: ", titular, " | Saldo actual: $", saldo
            2:
                Escribir "Ingrese el monto a depositar:"
                Leer monto
                Si monto > 0 Entonces
                    saldo <- saldo + monto
                    Escribir "Depósito exitoso. Nuevo saldo: $", saldo
                Sino
                    Escribir "El monto a depositar debe ser mayor a cero."
                FinSi
            3:
                Escribir "Ingrese el monto a retirar:"
                Leer monto
                Si monto > 0 Y monto <= saldo Entonces
                    saldo <- saldo - monto
                    Escribir "Retiro exitoso. Nuevo saldo: $", saldo
                Sino
                    Si monto > saldo Entonces
                        Escribir "Fondos insuficientes. Saldo actual: $", saldo
                    Sino
                        Escribir "El monto a retirar debe ser mayor a cero."
                    FinSi
                FinSi
            4:
                Escribir "Saliendo del sistema bancario..."
            De Otro Modo:
                Escribir "Opción inválida. Intente de nuevo."
        FinSegun
    Hasta Que opcion = 4
FinAlgoritmo