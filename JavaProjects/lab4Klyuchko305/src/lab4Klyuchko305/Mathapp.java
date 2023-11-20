package lab4Klyuchko305;

import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;
/**
 * Class <code>EquationsApp</code> Implements driver for Equations class
 * 
 * @author Klyuchko Dmytro
 * @version 1.0
 */
public class Mathapp {
	/**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
			double result;

			try {
			    int inputX;
			    out.print("Введіть значення x: ");
			    inputX = in.nextInt();
			    
			    calcEquations eq = new calcEquations();
			    result = eq.calculate(inputX);

			    out.print("Результат обчислення функції y = sin(x) / tg(4x) = ");
			    out.print(result);

			    
			    writeResultToFile(result);
			} catch (CalcException ex) {
			    out.print(ex.getMessage());
			} catch (FileNotFoundException e) {
			    out.println("Файл не знайдено !");
			}
		}
    }

 
    private static void writeResultToFile(double result) throws FileNotFoundException {
        try (PrintWriter fout = new PrintWriter("MyFile.txt")) {
            fout.print("Результат обчислення функції y = sin(x) / tg(4x) = ");
            fout.print(result);
            fout.flush();
        }
    }
}
/**
 * Class <code>CalcException</code> more precises ArithmeticException
 * 
 * @author Klyuchko Dmytro
 * @version 1.0
 */
class CalcException extends Exception {
    public CalcException() {
    }

    public CalcException(String cause) {
        super(cause);
    }
}
/**
 * Class <code>calcEquations</code> implements method for  y=sin(x)/tg(4x)
 * expression
 * calculation
 * 
 * @author Klyuchko Dmytro
 * @version 1.0
 */
class calcEquations {
	/**
	 * Method calculates the y=sin(x)/tg(4x) expression
	 * 
	 * @param <code>x</code> Angle in degrees
	 * @throws CalcException
	 */
    public double calculate(int x) throws CalcException {
        double y, rad, rad1;
        rad = x * Math.PI / 180.0;
        rad1 = 4*rad;
        // створимо виключення вищого рівня з поясненням причини
        // виникнення помилки
        try {
            y = Math.sin(rad) / Math.tan(rad1);
            if (Double.isNaN(y) || Double.isInfinite(y) || x == 90 || x == -90) {
                throw new CalcException("Причина помилки: некоретне значення кута для обчислення тангенсу!");
            }
        } catch (ArithmeticException ex) {
             if (x == 0) {
                throw new CalcException("Причина помилки: x = 0");
            } else {
                throw new CalcException("Незрозуміла помилка при обрахунках!");
            }
        }
        return y;
    }
}