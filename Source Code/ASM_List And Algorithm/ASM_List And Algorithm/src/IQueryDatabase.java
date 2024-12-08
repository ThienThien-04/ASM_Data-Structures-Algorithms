public interface IQueryDatabase extends IDatabase {
    public void insertData();
    public void updateDataById(int id);
    public void deleteDataById(int id);
}
