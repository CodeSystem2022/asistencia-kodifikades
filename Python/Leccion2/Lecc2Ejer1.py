"""
Ejercicio 1:
Escribir un programa que calcule la siguiente expresion.
A^3x(b^2-2ac)
   2b
"""
a = float(input("Ingrese un valor para a"))
b = float(input("Ingrese un valor para b"))
c = float(input("Ingrese un valor para c"))
resultado = ((a**3)*(b**2-2*a*c))/(2*b)
print(f"El resultado es {resultado}")