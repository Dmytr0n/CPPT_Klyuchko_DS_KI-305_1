package lab1Klyuchko305;
/**
 * Class App realize program to lab work №1
 * 
 * @author Klyuchko Dmytro
 * @version 1.1
 * @since version 1.0
 */
import java.io.*;
import java.util.*;
public class Matrix {
	/**
     * Static method main is enter point to program
     * 
     * @param args
     * @throws FileNotFoundException
     *
     */
public static void main(String[] args) throws FileNotFoundException {
        
	Scanner in = new Scanner(System.in); 
	PrintWriter fout = new PrintWriter ("MyFile.txt");
        char[][] arr;
        int n__ROWS;
        String symbol;
        System.out.println("Введіть розмір квадратної матриці: ");
        
        n__ROWS = in.nextInt();
              
        System.out.println("Введіть символ-заповнювач: \n");
        
        in.nextLine();
        
        symbol = in.nextLine();
        
        fout.print("символ-заповнювача: " + symbol +"\n");
        if (symbol.length() != 1)
        {
        	System.out.print("\nСимвол-заповнювач введено невірно.");
        	
        	fout.print("\nСимвол-заповнювач введено невірно");
        	
            System.exit(0);
        }
        
        arr = new char[n__ROWS][];
        
        int checking__of__the__array = 0;
        
        for (int i = 0; i <n__ROWS; i++)
        {
        	arr[i] = new char[n__ROWS/2];
        	if(checking__of__the__array < n__ROWS/2) {
        		for (int j = 0; j < n__ROWS/2; j++)
        		{
        			arr[i][j] = (char)symbol.codePointAt(0);
        			System.out.print(arr[i][j]);
        			fout.write(arr[i][j]);
        		}

        		for (int k = n__ROWS/2; k < n__ROWS; k++) {
        			System.out.print(" ");
        			fout.write(" ");
        		}
        		System.out.println();
        		fout.println();
        	}
        	else {
        		arr[i] = new char[n__ROWS/2];
        		for (int k = 0; k < n__ROWS/2; k++) {
        			System.out.print(" ");
        			fout.write(" ");
        		}
        		for (int j = 0; j < n__ROWS/2; j++)
        		{
        			arr[i][j] = (char)symbol.codePointAt(0);
        			System.out.print(arr[i][j] );
        			fout.write(arr[i][j] );
        		}
        		
        		System.out.println();
        		fout.println();
        	}
        	
        checking__of__the__array +=1;
        }
        
        fout.close();
        in.close();
        System.out.close();
    }
    }

