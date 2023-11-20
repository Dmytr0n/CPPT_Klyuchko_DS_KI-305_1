package lab3Klyuchko305;

import java.io.*;
/**
 * Class App realize program to lab work 3
 * 
 * @author Klyuchko Dmytro
 * @version 1.1
 * @since version 1.0
 */
public class WaterApp {
   /**
     * @param args
     * @throws FileNotFoundException
     */
	public static void main(String[] args) throws FileNotFoundException {
	Sea lake =  new Sea(22,35,2);
    lake.setParametersforSquare(10.5, 12.34);
	lake.GetCalcSquare();
	lake.setParametersforEcologysituation("Голубий", 70);
	lake.CurentEcologysituation();
	lake.Depth();
	lake.CurrentDepth();
	lake.setParametersforInformation("Україна", "Закарпаття", "Озеро");
	lake.getInformation();
	lake.Shippingbalance();
	System.out.print("Сальдо суднолавства: ");
	lake.Print(lake.getShippingbalance());
	System.out.print("Приріст кораблів: ");
	lake.Print(lake.Shipgrowth());
	lake.WritetoFile("Сальдо суднолавства: ");
	lake.WritetoFile(lake.getShippingbalance());
	lake.WritetoFile("Приріст кораблів: ");
	lake.WritetoFile(lake.Shipgrowth());
  }
}
