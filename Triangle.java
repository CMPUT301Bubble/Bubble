public class Triangle extends Shape{

    // ATTRIBUTES
    private int height;
    private int base;

    // CONSTRUCTOR
    public Triangle(int x, int y, int base, int height, String color){
        super(x,y,color);
        this.height = height;
        this.base = base;
    }

    // GETTERS AND SETTERS
    public void setHeight(int height){this.height=height;}
    public void setBase(int base){this.base=base;}
    public void setColor(String color){this.color=color;}
    public int getHeight(){return height;}
    public int getBase(){return base;}

    // METHODS
}