# клас площа водойми
class Square:
#конструктор
    def __init__(self, xwidth=0, xlength=0):
        self.__width = xwidth
        self.__length = xlength
#метод повернення ширини
    def getWidth(self):
        return self.__width
#метод повернення довжини
    def getLength(self):
        return self.__length
#метод встановлення ширини
    def setWidth(self, xwidth):
        self.__width = xwidth
#метод встановлення довжини
    def setLength(self, xlength):
        self.__length = xlength
#метод для обрахунку площі водойми
    def CalcSquare(self):
        square = self.__width * self.__length
        return square
#метод для обрахунку глибини водойми
    def CalcDepth(self):
        depth = 4*(self.__width) / (self.__length)
        return depth
