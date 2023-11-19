# клас екологічна ситуація водойми
class EcologyWater:
    # конструктор
    def __init__(self, Colorwater="default", Transparency=0):
        self.__colorwater = Colorwater
        self.__transparency = Transparency
    # метод повернення кольору води
    def getColorwater(self):
        return self.__colorwater
    # метод повернення прозорості води
    def getTransparency(self):
        return  self.__transparency
    # метод встановлення кольору води
    def setColorwater(self, Colorwater):
        self.__colorwater = Colorwater
    # метод встановлення прозорості води
    def setTransparency(self, Transparency):
        self.__transparency = Transparency
    # метод для визначення екологічної ситуації водойми
    def Ecologysituation(self):
        if(self.__colorwater == "Зелений" or self.__colorwater == "Жовтий" or self.__colorwater == "Коричневий" ):
            print("Колір води є незадовільним! В даній водоймі брудна вода!!!")
        else:
            print("За результатами перевірки кольору води, водойма є чистою!")
        if(self.__transparency < 60):
            print("Вода не є прозорою! В даній водоймі брудна вода!!!")
        else:
            print("Вода прозора,отже водойма є чистою!")