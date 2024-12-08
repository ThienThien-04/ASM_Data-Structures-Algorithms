public class Square extends Shapes{
    public Square(double w, double h){
        width = w;
        height = h;
    }
    @Override
    public double calculateArea() {
        return width * width;
    }

    @Override
    public double calculatePerimeter() {
        return (width *4);
    }
}
