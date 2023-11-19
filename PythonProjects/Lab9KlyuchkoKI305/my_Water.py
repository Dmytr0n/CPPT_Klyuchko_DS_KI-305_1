from my_square import Square
from my_EcologyWater import EcologyWater
from my_Fullinformation import Fullinformation

#клас водойма
class Water:
    # конструктор
    def __init__(self, xtemperature=0):
        self.__squareofwater = Square()
        self.__ecologysytuation = EcologyWater()
        self.__information = Fullinformation()
        self.__temperature = xtemperature

    # метод для отримання площі водойми
    def getCalcSquare(self):
        return self.__squareofwater.CalcSquare()

    # метод для отримання поточної глибини
    def getCurrentDepth(self):
        currentdepth = 0.0
        if (self.__temperature >= 25 and self.__temperature <= 45):
            currentdepth = self.__squareofwater.CalcDepth() - 0.75
            return currentdepth
        else:
            currentdepth = self.__squareofwater.CalcDepth()
            return currentdepth

    # метод для встановлення параметрів для обчислення площі
    def setParametersSquare(self, xwidth, xlength):
        self.__squareofwater.setWidth(xwidth)
        self.__squareofwater.setLength(xlength)

    # метод для поверненя ширини
    def getWidthforWater(self):
        return self.__squareofwater.getWidth()

    # метод для повернення довжини
    def getLengthforWater(self):
        return self.__squareofwater.getLength()

    # метод для встановлення параметрів щоб оцінити екологічну ситуацію водойми
    def setParametersforEcologysituation(self, Colorwater, Transparency):
        self.__ecologysytuation.setColorwater(Colorwater)
        self.__ecologysytuation.setTransparency(Transparency)

    # метод для оцінки  екологічної ситуації водойми
    def CurentEcologysituation(self):
        return self.__ecologysytuation.Ecologysituation()

    # метод для поверненя максимальної глибини водойми
    def getMaxDepth(self):
        return self.__squareofwater.CalcDepth()

    # метод для встановлення повної інформації про водойму
    def setParametersforInformation(self, Country, Region, Type):
        self.__information.setCountry(Country)
        self.__information.setRegion(Region)
        self.__information.setType(Type)

    # метод для отримання повної інформації про водойму
    def getInformation(self):
        print("Країна:", self.__information.getCountry())
        print("Регіон:", self.__information.getRegion())
        print("Тип:", self.__information.getType())

