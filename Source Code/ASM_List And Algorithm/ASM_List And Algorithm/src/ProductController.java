    public class ProductController extends ProductModel{
    public static String myName = "Teo";
    public static int age = 20;
    public ProductController(String conn) {
        super(conn);
    }
    static {
        age += 10;
    }
    public static void showAge(){
        age += 30;
    }

//    public void test(){
//
//    }
}
