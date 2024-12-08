abstract public class Shapes {
    protected double height;
    protected double width;

    abstract public double calculateArea();
    public void showMessage(String mess){
        System.out.println(mess);
    }
    abstract public double calculatePerimeter();
}
