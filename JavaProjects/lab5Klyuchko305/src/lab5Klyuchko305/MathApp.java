package lab5Klyuchko305;

import java.util.Scanner;



import java.io.*;
import static java.lang.System.out;
/**
 * Class <code>EquationsApp</code> Implements driver for Equations class
 * 
 * @author Klyuchko Dmytro
 * @version 1.0
 */
public class MathApp {
	 /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner in = new Scanner(System.in);
        double result;

        try {
            int inputX;
            out.print("Введіть значення x: ");
            inputX = in.nextInt();
            
            calcEquations eq = new calcEquations();
            result = eq.calculate(inputX);
            ReadWritetxt Workfile = new ReadWritetxt();
            ReadWritebin Workfile1 = new ReadWritebin();
            Workfile.WriteTxt(result);
            Workfile1.WriteBin(result);
            Workfile1.ReadBin();
            try {
				Workfile.ReadTxt();
				// Блок перехоплює помилки роботи з файлом 
			} catch (  FileNotFoundException  ex) {
				
				System.out.println("Файл не знайдено");
			}
         // Блок перехоплює помилки обчислень виразу
        } catch (CalcException ex) {
            out.print(ex.getMessage());
        } 
    }
}
/**
 * Class <code>ReadWritetxt</code> work with text files
 * expression
 * calculation
 * 
 * @author Klyuchko Dmytro
 * @version 1.0
 */
class ReadWritetxt{
	private PrintWriter fout;
	
	public ReadWritetxt()
	{
		try {
		 fout = new PrintWriter("MyFile.txt");
		} catch (FileNotFoundException e) {
			out.print("Файл за даним шляхом відсутній !");
		}
	}
	/**
     * Method write result to text file
     * 
     * @param <code>fName</code> Name of the file
     * @throws
     */
	public void WriteTxt(double result)
	{
		fout.print("Результат обчислення функції y = sin(x) / tg(4x) = ");
         fout.print(result);
         fout.flush();
         fout.close();
	}
	/**
     * Method read result from text file
     * 
     * @param <code>fName</code> Name of the file
     * @throws
     */
	public void ReadTxt() throws FileNotFoundException
	{
		BufferedReader br = null;
		br = new BufferedReader(new FileReader("MyFile.txt"));
		String line;
		try {
			while ((line = br.readLine()) != null)
			{
				out.println(line);
			}
			br.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		 
	}
}
/**
 * Class <code>ReadWritebin</code> work with bin files
 * expression
 * calculation
 * 
 * @author Klyuchko Dmytro
 * @version 1.0
 */
class ReadWritebin{
	 /**
     * Method write result to binary file
     * 
     * @param <code>fName</code> Name of the file
     * @throws
     */
	public void WriteBin(double result) throws FileNotFoundException, IOException
	{
	DataOutputStream f = new DataOutputStream(new FileOutputStream("MyFile.bin"));
	f.writeDouble(result);
	f.close();
	}
	/**
     * Method read result from binary file
     * 
     * @param <code>fName</code> Name of the file
     * @throws
     */
	public void ReadBin() throws FileNotFoundException, IOException
	{
	double line;
	DataInputStream f = new DataInputStream(new FileInputStream("MyFile.bin"));
	line = f.readDouble();
	out.println(line);
	f.close();
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
