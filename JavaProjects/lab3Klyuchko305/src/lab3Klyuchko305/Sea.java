package lab3Klyuchko305;

import java.io.FileNotFoundException;
//Interface defining the behavior for shipping balance
interface Balance {
    void Shippingbalance();
}
//Interface defining the behavior for ship growth
interface Growth {
    int Shipgrowth();
}
/**
 * Sea class extends Water and implements Balance and Growth interfaces.
 * Represents attributes and functionalities related to the sea.
 */
public class Sea extends Water implements Balance, Growth {
    private int shipsaresailing;
    private int shipsareinports;
    private int data;
    private int shippinbalance;
    /**
     * Constructor initializing Sea object with specified parameters.
     * @param Xshipsaresailing number of ships sailing
     * @param Xshipsareinports number of ships in ports
     * @param Xdata data parameter
     * @throws FileNotFoundException if file not found
     */
    public Sea(int Xshipsaresailing, int Xshipsareinports, int Xdata) throws FileNotFoundException {
        shipsaresailing = Xshipsaresailing;
        shipsareinports = Xshipsareinports;
        data = Xdata;
        shippinbalance = 0;
    }
    /**
     * Calculates shipping balance based on ships in ports and sailing.
     */
    public void Shippingbalance() {
        shippinbalance = shipsareinports - shipsaresailing;
    }
    /**
     * Gets the calculated shipping balance.
     * @return the calculated shipping balance
     */
    public int getShippingbalance() {
        return shippinbalance;
    }
    /**
     * Calculates ship growth based on ships in ports, sailing, and data.
     * @return the calculated ship growth
     */
    public int Shipgrowth() {
        return (shipsareinports - shipsaresailing) / data;
    }
    /**
     * Prints a line.
     * @param line the line to print
     */
    public void Print(int line) {
        System.out.println(line);
    }
    /**
     * Writes an integer line to the file and closes it if the line is 0.
     * @param line the line to write
     */
    public void WritetoFile(int line) {
        if (line == 0) {
            fout.close();
        }
        fout.println(line);
        fout.flush();
    }
    /**
     * Gets the number of ships sailing.
     * @return the number of ships sailing
     */
    public int getShiparesaling()
    {
    	return shipsaresailing;
    }
    /**
     * Writes a string line to the file and closes it if the line is null.
     * @param line the line to write
     */
    public void WritetoFile(String line) {
        if (line == null) {
            fout.close();
        }
        fout.print(line);
        fout.flush();
    }
}