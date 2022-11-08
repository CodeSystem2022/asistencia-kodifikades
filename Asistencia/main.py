# Asistencia, Alumno: Miguel Angel Bru Melis.

from Rectangulo import Rectangulo #Importamos la clase Rectangulo.

# Los objetos deben ser 3.
for x in range(1,4): 
  base = int(input(f'Ingrese la base del rectangulo {x}: '))
  altura = int(input(f'Ingrese la altura del rectangulo {x}: '))
  print(f'El area del rectangulo {x} es: {Rectangulo(base, altura).calcular_area()}')
  print() # Espacio para mejorar la legibilidad en la consola.

print("Ejercicio realizado por: Miguel Angel Bru Melis")