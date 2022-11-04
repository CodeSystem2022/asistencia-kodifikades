## EJERCICIO FIGURA GEOMETRICA, RUIZ LUCAS MIGUEL

class GeometricFigure:
  def __init__(self, width, height):
    self._width = width
    self._height = height

  @property
  def getWidth(self):
    return self._width

  @getWidth.setter
  def setWidth(self, newWidth):
    self._width = newWidth

  @property
  def getHeight(self):
    return self._height

  @getHeight.setter
  def setHeight(self, newHeight):
    self._width = newHeight

  def __str__(self):
    return f'Geometric Figure description, Width: {self._width}, Height: {self._height}'
