package lab2Klyuchko305;
import java.io.*;
 public class Water {
 private static Square Squareofwater;
 private EcologyWater Ecologysytuation;
 private double temperature;
 private Fullinformation Information;
 private PrintWriter fout;
 /**
  * The Water class represents properties and functionalities related to a body of water.
  */
 public Water()  throws FileNotFoundException{ 
	// Class attributes including water square, ecological situation, temperature, information, and file output
	 Squareofwater = new Square();
	 Ecologysytuation = new EcologyWater();
	 temperature =0;
	 Information = new Fullinformation();
	 fout = new PrintWriter ("Log.txt");
 }
 /**
  * Constructor with a temperature parameter initializing water properties with given temperature.
  * @param xtemperature the temperature of the water
  * @throws FileNotFoundException if Log.txt file is not found
  */
 public Water(double xtemperature) throws FileNotFoundException{
	 Squareofwater = new Square();
	 Ecologysytuation = new EcologyWater();
	 temperature = xtemperature;
	 Information = new Fullinformation();
	 fout = new PrintWriter ("Log.txt");
 }
 /**
  * Retrieves the calculated square of the water body.
  * @return the calculated square of the water body
  */
 public double GetCalcSquare()
 {
	 return Squareofwater.calcSquare();
 }
 /**
  * Determines and displays the current depth of the water body based on temperature conditions.
  */
 public void CurrentDepth()
 {
	 double curentdepth;
	 if(temperature >= 25 && temperature <=45)
	 {
		 curentdepth = Squareofwater.getDepth()-0.75;
	 }
	 else {
		 curentdepth = Squareofwater.getDepth();
	 }
	 System.out.print("Поточна глибина: ");
	 System.out.print(curentdepth);
	 System.out.println(" m ");
	 fout.print("Поточна глибина: ");
	 fout.print(curentdepth);
	 fout.println(" m");
     }
 /**
  * Sets the width and length parameters for the water body's square.
  * @param widthSquareofwater the width of the water body
  * @param lengthSquareofwater the length of the water body
  */
 public void setParametersforSquare(double widthSquareofwater, double lengthSquareofwater){
	 Squareofwater.setLengts(lengthSquareofwater);
	 Squareofwater.setWidth(widthSquareofwater);
 }
 /**
  * Retrieves the width of the water body.
  * @return the width of the water body
  */
 public double getWidthforWater()
 {
	 return Squareofwater.getWidth();
 }
 /**
  * Retrieves the length of the water body.
  * @return the length of the water body
  */
 public double getLengthforWater()
 {
	 return Squareofwater.getLength();
 }
 /**
  * Sets parameters for the ecological situation such as color and transparency of the water.
  * @param colorwaterEcologysytuation the color of the water
  * @param transparencyEcologysytuation the transparency level of the water
  */
 public void setParametersforEcologysituation(String colorwaterEcologysytuation, int transparencyEcologysytuation)
 {
	 Ecologysytuation.setColorwater(colorwaterEcologysytuation);
	 Ecologysytuation.setTransparency(transparencyEcologysytuation);
 }
 /**
  * Displays the current ecological situation of the water body.
  */
 public void CurentEcologysituation()
 {
	 Ecologysytuation.Ecologysituation();
 }
 /**
  * Displays the maximum depth of the water body.
  */
 public void Depth()
 {
	 fout.print("Максимальна глибина: ");
	 fout.print(Squareofwater.getDepth());
	 fout.println(" m");
	 System.out.print("Максимальна глибина: ");
	 System.out.print (Squareofwater.getDepth());
	 System.out.println(" m ");
 }
 /**
  * Sets parameters for the geographical information of the water body.
  * @param countryInformation the country of the water body
  * @param regionInformation the region of the water body
  * @param typeInformation the type of the water body
  */
 public void setParametersforInformation(String countryInformation,String regionInformation, String typeInformation)
 {
	 Information.setCountry(countryInformation);
	 Information.setRegions(regionInformation);
	 Information.setType(typeInformation);
 }
 /**
  * Displays the geographical information of the water body.
  */
 public void getInformation()
 {
	 System.out.print("Країна: ");
	 System.out.println(Information.getCountry());
	 System.out.print("Регіон: ");
	 System.out.println(Information.getRegion());
	 System.out.print("Тип водойми: ");
	 System.out.println(Information.getType());
	 fout.print ("Країна: ");
	 fout.println(Information.getRegion());
	 fout.print("Регіон: ");
	 fout.println(Information.getCountry());
	 fout.print("Тип водойми: ");
	 fout.println(Information.getType());
	 fout.flush();

 }
 
 //class for calcSquare
 /**
  * The Square class represents the dimensions and calculations related to the square of a water body.
  */
 class Square{
	 private double width;
	 private double length;
	 /**
	   * Default constructor initializing width and length to zero.
	   */
	 public Square(){
		 width = 0.0;
		 length =0.0;
	 }
	 /**
	   * Constructor initializing width and length with provided values.
	   * @param widthSquareofwater the width of the water body
	   * @param lengthSquareofwater the length of the water body
	   */
	 public Square(double widthSquareofwater, double lengthSquareofwater) {
		 width = widthSquareofwater;
		 length = lengthSquareofwater;
	 }
	 // Methods get
	 /**
	   * Gets the width of the water body.
	   * @return the width of the water body
	   */
	 public double getWidth()
	 {
		 return width;
	 }
	 /**
	   * Gets the length of the water body.
	   * @return the length of the water body
	   */
	 public double getLength()
	 {
		 return length;
	 }
	 //Methods set
	 /**
	   * Sets the width and length of another Square object.
	   * @param obj the Square object to set width and length
	   */
	 public void getSquare(Square obj) {
		 obj.width = width;
		 obj.length = length;
	 }
	 /**
	   * Sets the width of the water body.
	   * @param widthSquareofwater the width to set
	   */
	 public void setWidth(double widthSquareofwater)
	 {
		 width = widthSquareofwater;
	 }
	 /**
	   * Sets the length of the water body.
	   * @param lengthSquareofwater the length to set
	   */
	 public void setLengts(double lengthSquareofwater)
	 {
		 length = lengthSquareofwater;
	 }
	 /**
	   * Calculates the depth of the water body based on width and length.
	   * @return the depth of the water body
	   */
	 public double getDepth() {
		 double depth;
		 depth = 4*(width)/(length);
		 return depth;
	 }
	 /**
	   * Calculates the square of the water body and displays it.
	   * @return the calculated square of the water body
	   */
	 public double calcSquare() {
		    double  square;
			square = Squareofwater.getLength() * Squareofwater.getWidth();
			fout.print("Площа водойми: ");
			fout.print(square);
			fout.println(" m^2");
			System.out.print("Площа водойми: ");
			System.out.print(square);
			System.out.println(" m^2");
			return square;
		 }
  }
 /**
  * The EcologyWater class manages ecological parameters and checks for a water body.
  */
 class EcologyWater{
	 private String colorwater;
	 private int transparency;

	 /**
	   * Default constructor initializing default color and transparency values.
	   */
	 public EcologyWater(){
	  colorwater = "Бірюзовий";
	  transparency = 70;
	 }
	 /**
	   * Constructor initializing color and transparency with provided values.
	   * @param colorwaterEcologysytuation the color of the water
	   * @param transparencyEcologysytuation the transparency level of the water
	   */
	 public EcologyWater (String colorwaterEcologysytuation, int transparencyEcologysytuation) {
		 colorwater = colorwaterEcologysytuation;
		 transparency = transparencyEcologysytuation;
	 }
	 /**
	   * Retrieves the color of the water.
	   * @return the color of the water
	   */
	 public String getColorwater()
	 {
		 return colorwater;
	 }
	 /**
	   * Retrieves the transparency level of the water.
	   * @return the transparency level of the water
	   */
	 public int getTransparency()
	 {
		 return transparency;
	 }
	 /**
	   * Sets the color and transparency of another EcologyWater object.
	   * @param obj the EcologyWater object to set color and transparency
	   */
	 public void getEcologyParameters(EcologyWater obj) {
		 obj.colorwater = colorwater;
		 obj.transparency = transparency;
	 }
	 /**
	   * Sets the color of the water.
	   * @param colorwaterEcologysytuation the color to set
	   */
	 public void setColorwater(String colorwaterEcologysytuation)
	 {
		 colorwater = colorwaterEcologysytuation;
	 }
	 /**
	   * Sets the transparency level of the water.
	   * @param transparencyEcologysytuation the transparency level to set
	   */
	 public void setTransparency(int transparencyEcologysytuation)
	 {
		 transparency = transparencyEcologysytuation;
	 }
	 /**
	     * Checks the ecological situation of the water body based on color and transparency.
	     * Prints information about water cleanliness based on defined criteria.
	     */
	 public void Ecologysituation()
	 {
		 if(colorwater=="Зелений"||colorwater=="Жовтий"||colorwater=="Коричневий")
		 {
			 System.out.println("Колір води є незадовільним! В даній водоймі брудна вода!!!");
			 fout.println("Колір води є незадовільним! В даній водоймі брудна вода!!!");
		 }
		 else
		 {
			 System.out.println("За результатами перевірки кольору води, водойма є чистою!");
			 fout.println("За результатами перевірки кольору води, водойма є чистою!");
		 }
		 if(transparency<60)
		 {
			 System.out.println("Вода не є прозорою! В даній водоймі брудна вода!!!");
			 fout.println("Вода не є прозорою! В даній водоймі брудна вода!!!");
		 }
		 else
		 {
			 System.out.println("Вода прозора,отже водойма є чистою!");
			 fout.println("Вода прозора,отже водойма є чистою!");
		 }
	 }
 }
 /**
  * The Fullinformation class manages geographical information about a water body.
  */
 class Fullinformation{
  private String country;
  private String region;
  private String type;
  /**
   * Default constructor initializing default country, region, and type values.
   */
  public Fullinformation(){
	  country = "default";
	  region = "default";
	  type = "default";
 }
  /**
   * Constructor initializing country, region, and type with provided values.
   * @param countryInformation the country of the water body
   * @param regionInformation the region of the water body
   * @param typeInformation the type of the water body
   */
  public Fullinformation (String countryInformation,String regionInformation, String typeInformation) {
	  country = countryInformation;
	  region =regionInformation;
	  type = typeInformation;
  }
  /**
   * Retrieves the country of the water body.
   * @return the country of the water body
   */
  public String getCountry()
	 {
		 return country;
	 }
  /**
   * Retrieves the region of the water body.
   * @return the region of the water body
   */
	 public String getRegion()
	 {
		 return region;
	 }
	 /**
	   * Retrieves the type of the water body.
	   * @return the type of the water body
	   */
	 public String getType()
	 {
		 return type;
	 }
	 /**
	   * Sets the country of the water body.
	   * @param countryInformation the country to set
	   */
	 public void setCountry(String countryInformation)
	 {
		 country = countryInformation;
	 }
	 /**
	   * Sets the region of the water body.
	   * @param regionInformation the region to set
	   */
	 public void setRegions(String regionInformation)
	 {
		 region =regionInformation;
	 }
	 /**
	   * Sets the type of the water body.
	   * @param typeInformation the type to set
	   */
	 public void setType(String typeInformation)
	 {
		 type =typeInformation;
	 }
	 /**
	   * Sets the country, region, and type of another Fullinformation object.
	   * @param obj the Fullinformation object to set country, region, and type
	   */
	 public void getEcologyParameters(Fullinformation obj) {
		 obj.country = country;
		 obj.region = region;
		 obj.type = type;
	 }
 }
 }

