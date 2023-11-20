
package lab2Klyuchko305;
/**
 * Class App realize program to lab work 2
 * 
 * @author Klyuchko Dmytro
 * @version 1.1
 * @since version 1.0
 */
import java.io.*;
public class WaterApp {
	/**
     * @param args
     * @throws FileNotFoundException
     */
	public static void main(String[] args) throws FileNotFoundException {
	Water lake = new Water(27);
	lake.setParametersforSquare(24, 32);
	lake.GetCalcSquare();
	lake.setParametersforEcologysituation("Голубий", 70);
	lake.CurentEcologysituation();
	lake.Depth();
	lake.CurrentDepth();
	lake.setParametersforInformation("Україна", "Закарпаття", "Озеро");
	lake.getInformation();
	}
}
 