packagecom.example.bubble;

public class Triangle extends Shape{

    // ATTRIBUTES
    private int height;
    private int base;
    String triangleColor = "white";

    // CONSTRUCTOR
    public Triangle(int x, int y, int base, int height, String color){
        super(x,y,color);
        this.height = height;
        this.base = base;
        this.triangleColor=color
    }

    // GETTERS AND SETTERS
    public void setHeight(int height){this.height=height;}
    public void setBase(int base){this.base=base;}
    public void setTriangleColor(String color){this.triangleColor=color;}
    public int getHeight(){return height;}
    public int getBase(){return base;}
    public String getTriangleColor(){return triangleColor;}

    // METHODS
}