'''
Ejercicio 4: Sistema de calificaciones
Realizar un programa con el siguiente esquema de calificaciones:
9 o 10 = A
Entre 8 y menor a 9 = B
Entre 7 y menor a 8 = C
Entre 6 y menor a 7 = D
Menor a 6 = F
'''
nota = float(input("Ingrese su nota "))
mensaje = None
if nota == 10 or nota == 9:
    mensaje = "A"
elif nota == 8:
    mensaje = "B"
elif nota == 7:
    mensaje = "C"
elif nota == 6:
    mensaje = "D"
elif nota < 6 and nota > 0:
    mensaje = "F"
else:
    print("Nota no valida")
print(f"Su calificacion es: {mensaje}")