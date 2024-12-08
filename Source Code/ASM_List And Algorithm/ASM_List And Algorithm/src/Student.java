public class Student {
    public String id;
    public String name;
    public int age;
    public String address;

    public Student(String _id, String _name, int _age, String _address){
        id = _id;
        name = _name;
        age = _age;
        address = _address;
    }

    public Student(String id, String fullName, double mark) {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
