public interface IDatabase {
    // duoc phep khai bao thuoc tinh
    public final String connection = "Connection is successfully";

    // duoc phep khai bao phuong thuc - phuong thuc rong
    public String getConnection();
    public String disConnection();
}
