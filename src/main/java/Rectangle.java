/**
 * This program collects the length and width of a rectangle
 * it has different constructors 
 * @author cindy Pan
 * @version i dont know and i dont know how to check
 */
class Rectangle{
    private double length;
    private double width;

/**
 * This constructor contains no parameters
 * It is just putting the value 4.0 and 8.0 into the instance variables
 */
 public Rectangle(){
    this.length = 4.0;
    this.width= 8.0;
 }
 /**
  * This constructor has a parameter for the length variable
  * and stores that data into the length variable
  * @param length1 is a double variable that is then stored into the instance variable of length 
  */
 public Rectangle(double length1){
    this.length = length1;
    this.width = 8.0;
 }
 /**
  * this constructor has 2 parameters for both the variables
  * @param length1 a double variable that is put into the length instance variable 
  * @param width1 a double variable that is put into the width instance variable
  */
  public Rectangle(double length1, double width1){
    this.length = length1;
    this.width = width1;
  }

  /**
   * the following method gets and returns the value stored in the variables
   * @return getLength returns the value stored in the length variable
   * @return getWidth returns the value stored in the width variable
   */
  public double getLength(){
    return length;
  }
  public double getWidth(){
    return width;
  }
}