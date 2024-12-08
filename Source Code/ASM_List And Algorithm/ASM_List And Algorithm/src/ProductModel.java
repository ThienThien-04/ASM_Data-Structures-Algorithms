public class ProductModel implements IQueryDatabase{
    public ProductModel(String conn){
    }

    public final void test(){
        // cam class con override lai phuong thuc nay. tu khoa final
    }

    @Override
    public String getConnection() {
        return connection;
    }

    @Override
    public String disConnection() {
        return "";
    }

    @Override
    public void insertData() {

    }

    @Override
    public void updateDataById(int id) {

    }

    @Override
    public void deleteDataById(int id) {

    }
}
