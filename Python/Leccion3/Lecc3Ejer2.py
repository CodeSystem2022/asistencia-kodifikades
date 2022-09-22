#Realizar un programa que determine si un año es bisiesto, repetir el ciclo hasta que el usuario lo decida.
año = int(input("Igrese un año "))
while año:
    if año % 4 == 0:
        print(f"El año {año} es bisiesto")
    else:
        print(f"El año {año} no es bisiesto")
    opcion = input("¿Desea seguir ingresando datos? (s/n) ")
    if opcion == "s" or opcion == "S":
        año = int(input("Igrese un año "))
    else:
        break
