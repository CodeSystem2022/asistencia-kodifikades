'''
Ejercicio 3: Etapas de la vida
Realizaremos un programa que cuando el usuario ingrese su edad, imprima una breve oracion
'''
edad = int(input("Ingrese su edad "))
if edad >=1 and edad <= 10:
    print("La infacia es increible y bella")
elif edad > 10 and edad <= 19:
    print("Tienes muchos cambios, mucho que estudiar")
elif edad > 19 and edad <= 29:
    print("Amor y comienza el trabajo")
elif edad > 29 and edad <= 40:
    print("Te diste cuenta de que el amor es una pelotudez, si tuviste hijos, vas a estar al borde del suicidio")
elif edad > 40 and edad <= 65:
    print("Veo que todavia no te suicidaste, sos un boludo. Ahora no solo te queres matar a vos, tambien a tu jefe y a tu ingrata familia")
elif edad > 65 and edad < 95:
    print("Tenes suerte, cada vez falta menos para que te mueras")
elif edad < 0:
    print("¿Como vas a escribir una edad negativa? Jaja, seguro te gorrean")
elif edad >= 95:
    print("¿Cuantos años pensas vivir? Jaja, contame como eran los dinosaurios")
