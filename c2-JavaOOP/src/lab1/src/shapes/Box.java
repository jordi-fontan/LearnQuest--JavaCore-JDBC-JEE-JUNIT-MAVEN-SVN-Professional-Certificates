package shapes;
/* 

2. A Box has three pieces of information

  a. height

  b. width

  c. length

3. Create private attributes in your Box class for each of these pieces of information. 
Use double as the data type for each attribute.
4. Create public methods to set each attribute and retrieve (get) each attribute. 
Right click on the editor window and select the Source menu. 
From 	that menu select “Generate Getters and Setters”. Check the “Select all” and “Generate Comments” boxes. 
From the location dropdown choose last member and then click finish.
*/

/*
 *      5.  Create two constructors for the Box class.

  a. The first should accept 3 parameters and assign them to the length, width and height attributes respectively. 

  b. The second should accept 1 parameter and assign it to all 3 attributes  (creating a cube). 
  This constructor should make a call to the other constructor to avoid duplication of code.
 */

 /*
   6. Create a method named getVolume that accepts no parameters and returns adouble
   containing the volume of the Box.

  7. Create a method named getSurfaceArea that accepts no parameters 
  and returns a double containing the surface area of the Box.
   	[Hint: Surface area is the sum of the areas of the 6 sides of the Box.]* 


    8. Create a method named printBox which does the following:

  a. If any one of the 3 attributes is less than or equal to 0, 
  it will print a message stating that the box contains invalid properties.

  b. If all 3 sides are set correctly (i.e. greater than 0), it will print a message in the following form:
  */

public class Box {

    public Box(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }
    
    public Box(double height) {
        this.height = height;
        setWidth(height);
        setLength(height);
    }

    public double getVolume() {
        return height * length * width;
    }

    public double getSurface() {
        return 2 * height * length + 2 * length * width + 2 * height * width;
    }

    public void printBox() {
        if (length <= 0 || height <= 0 || width <= 0)
            System.out.println("Invalid parameters");
        else {
            System.out.printf("Height: %f %n Width: %f %n Length:%f %n Volume: %f %n Surface=%f %n",
                    height, width, length, getVolume(), getSurface());

        }
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    
    private double height;
    private double width;
    private double length;

    public static void main(String[] args)
    {
           Box cube=new Box(3.9);
           cube.printBox();
           Box box=new Box(3.9,2.3,8.1);
           box.printBox();
           Box badbox=new Box(-3.9,2.3,8.1);
           badbox.printBox();  

    }
}
