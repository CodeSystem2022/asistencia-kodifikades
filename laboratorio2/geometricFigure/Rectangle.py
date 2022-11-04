from GeometricFigure import GeometricFigure
from Color import Color

class Rectangle(GeometricFigure, Color):
  def __init__(self, width, height, color):
    GeometricFigure.__init__(self, width, height)
    Color.__init__(self, color)

  def calculateArea(self):
    return self._height * self._width

  def __str__(self):
    return f'{GeometricFigure.__str__(self)} {Color.__str__(self)}'