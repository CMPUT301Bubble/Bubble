packagecom.example.bubble;

public class Triangle extends Shape{

    // ATTRIBUTES
    private int height;
    private int base;
    String color = "white";

    // CONSTRUCTOR
    public Triangle(int x, int y, int base, int height, String color){
        super(x,y,color);
        this.height = height;
        this.base = base;
        this.color=color
    }

    // GETTERS AND SETTERS
    public void setHeight(int height){this.height=height;}
    public void setBase(int base){this.base=base;}
    public void setColor(String color){this.color=color;}
    public int getHeight(){return height;}
    public int getBase(){return base;}
    public String getColor(String color){return color;}

    // METHODS
}