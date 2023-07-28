public class GeometricShape {
//    attributes
    protected String color;
    protected Boolean filled;

//    constructor
    public GeometricShape(String color, Boolean filled){
        this. color = color;
        this.filled = filled;
    }

//    setters and getters methods
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean IsFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }
}
