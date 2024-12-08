public class Rectangle extends Shapes{
    public Rectangle(double w, double h){
        width = w;
        height = h;
    }
    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public double calculatePerimeter() {
        return (height + width)*2;
    }
}
