from Vehiculos import *
class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad

    def __str__(self):
        return super().__str__() + ', Velocidad(km/hr): ' + str(self.velocidad)

