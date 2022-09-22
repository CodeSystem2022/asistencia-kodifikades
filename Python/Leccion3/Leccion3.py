#Ciclo while
'''
contador = 0
while contador < 1000:
    print("Ejecutamos nuestro ciclo while ",contador)
    contador += 1
else:
    print("Fin del ciclo while")

#Ciclo for
cadena = 'Hello'
for letra in cadena:
    print(letra)
else:
    print("Fin del ciclo 'for' ")

#Palabra reservada 'Break'
for letra in "Alemania":
    if letra == "A":
        print(f"Letra encontrada {letra}")
        break
else:
    print("Fin del ciclo 'For' ")'''

#Palaba reservada "Continue"
for i in range(6):
    if i % 2 == 0:
        print(f"Valor {i}")

for i in range (6):
    if i % 2 != 0:
      continue
    print(f"Valor {i}")