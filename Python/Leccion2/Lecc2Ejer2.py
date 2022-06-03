"""
Ejercicio 2
Pedir al usuario que ingrese un mes del año, el programa debera determinar en
que estacion del año se encuentra
"""
mes = (input("Ingrese un mes del año "))
estacion = None
if mes == "Enero" or mes == "enero" or mes == "1" or mes == "Febrero" or mes == "febrero" or mes == "2" or mes == "Marzo" or mes == "marzo" or mes == "3":
     estacion = "Verano"
elif mes == "Abril" or mes == "abril" or mes == "4" or mes == "Mayo" or mes == "mayo" or mes == "5" or mes == "Junio" or mes == "junio" or mes == "6":
    estacion = "Otoño"
elif mes == "Julio" or mes == "julio" or mes == "7" or mes == "Agosto" or mes == "agosto" or mes == "8" or mes == "Septiembre" or mes == "septiembre" or mes == "9":
    estacion = "Invierno"
elif mes == "Octubre" or mes == "octubre" or mes == "10" or mes == "Noviembre" or mes == "noviembre" or mes == "11" or mes == "Diciembre" or mes == "diciembre" or mes == "12":
    estacion = "Primavera"
else:
    print("Mes no valido")
print(f"La estacion del año es {estacion}")

