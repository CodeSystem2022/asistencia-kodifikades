# Asistencia, Alumno: Miguel Angel Bru Melis.

class Rectangulo:
  """
    Crear una clase llamada Rectangulo, debe tenér 2 atributos: altura y base
    el nombre del método será calcular_area utilizando la formula:
    area = base * altura. Pero la base y la altura deben ser ingresadas por
    el usuario y los objetos deben ser tres.
    """

  def __init__(self, base, altura):
    self._base = base
    self._altura = altura

  # Método getter y setter de la altura.
  @property
  def altura(self):
    return self._altura

  @altura.setter
  def altura(self, altura):
    self._altura = altura

  # Método getter y setter de la base.
  @property
  def base(self):
    return self._base

  @base.setter
  def altura(self, base):
    self._base = base

  # Método para calcular el área.
  def calcular_area(self):
    return self._base * self._altura

 