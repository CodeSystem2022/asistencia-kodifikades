class Color:
  def __init__(self, color):
    self._color = color

  @property
  def getColor(self):
    return self._color

  @getColor.setter
  def setColor(self, newColor):
    self._color = newColor

  def __str__(self):
    return f'The color of the figure is {self._color}'