# клас повна інформація про водойму
class Fullinformation:
    # конструктор
    def __init__(self, Country="default", Region="default", Type="default"):
        self.__country = Country
        self.__region = Region
        self.__type = Type
    # метод повернення країни
    def getCountry(self):
        return self.__country
    # метод повернення регіону
    def getRegion(self):
        return self.__region
    # метод повернення типу
    def getType(self):
        return self.__type
    # метод встановлення країни
    def setCountry(self, Country ):
        self.__country = Country
    # метод встановлення регіону
    def setRegion(self, Region):
        self.__region = Region
    # метод встановлення типу 
    def setType(self, Type):
        self.__type = Type


