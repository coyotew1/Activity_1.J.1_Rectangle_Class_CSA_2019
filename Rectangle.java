/**
 * Rectangle
 */
public class Rectangle {
    private double length;
    private double width;
    private String name;

    public Rectangle(double length, double width, String name)
    {
        this.length = length;
        this.width = width;
        this.name = name;
    }

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
        this.name = "";
    }

    public Rectangle()
    {
        this.length = 0;
        this.width = 0;
        this.name = "";
    }

    
    //mutators
    public void setLength(double length)
    {
        this.length = length;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    //accessors
    public Double getLength()
    {
        return this.length;
    }

    public Double getWidth()
    {
        return this.width;
    }

    public String getName()
    {
        return this.name;
    }


    //additional methods specific to this object

    public Double area()
    {
        return this.width*this.length;
    }

    public Double perimeter()
    {
        double a = this.length*2;
        double b = this.width*2;
        return a+b;
    }
    @Override
    public String toString() {
        return "Name: "  + this.name + "\n" + "Length: " + this.length + "\nwidth: " + this.width;
    }
    
}