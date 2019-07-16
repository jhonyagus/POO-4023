package PrimitiveVariables;

public class Quadrilateral {
    //Atributes
    
    private float side1;
    private float side2;
    
    //Methods

    public Quadrilateral(float side1, float side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
    
    //Only square
    public Quadrilateral(float side1) {
        this.side1 = this.side2 = side1;
    }
    
    public float getPerimeter(){
        float perimeter = 2 * (side1+side2);
        return perimeter;
    }
    
    public float getArea(){
        float area = side1*side2;
        return area;
    }  
}
