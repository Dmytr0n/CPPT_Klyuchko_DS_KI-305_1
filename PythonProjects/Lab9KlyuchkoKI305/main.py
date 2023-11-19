from my_Sea import Sea

# основна програма
if __name__ == "__main__":
    # об'єкт на основі класу море
    black = Sea(27, 11, 34, 4, 0)

    # використання методів класу за допомогою створеного об'єкта
    black.Shippingbalance()
    black.Printer("Сальдо суднолавства:", black.getShippingbalance(), "DWT")
    black.Printer("Приріст кораблів:", black.Shipgrowth(), "GRT")
    black.setParametersSquare(11.5, 32)
    black.Printer("Площа водойми:", black.getCalcSquare(), "m^2")
    black.Printer("Максимальна глибина:", black.getMaxDepth(), "m")
    black.Printer("Поточна глибина:", black.getCurrentDepth(), "m")
    black.setParametersforEcologysituation("Зелений", 20)
    black.CurentEcologysituation()
    black.setParametersforInformation("Україна", "Закарпаття", "Озеро")
    black.getInformation()
