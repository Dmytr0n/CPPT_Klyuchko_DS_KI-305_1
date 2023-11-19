from my_Water import Water

#клас море
class Sea(Water):
   #конструктор
    def __init__(self, xtemperature=0, Xshipsaresailing=0, Xshipsareinports=0, Xdata=0, Xshippinbalance=0):
        super().__init__(xtemperature)
        self.__shipsaresailing = Xshipsaresailing
        self.__shipsareinports = Xshipsareinports
        self.__data = Xdata
        self.__shippinbalance = Xshippinbalance
    #метод обраховує сальдо судноплавства
    def Shippingbalance(self):
        self.__shippinbalance = self.__shipsareinports - self.__shipsaresailing

   #метод повертає сальдо судноплавства
    def getShippingbalance(self):
        return self.__shippinbalance
   #метод повертає приріст кораблів
    def Shipgrowth(self):
        return self.__shippinbalance / self.__data
   # метод виводить на екран властивості класу
    def Printer(self, line,line1, line3):
        print(line, line1, line3)
