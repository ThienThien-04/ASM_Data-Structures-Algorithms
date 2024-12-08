import java.util.ArrayList;

public class StudentArrayList {
    public void createDataStudent(Student student, ArrayList<Student> arrayList){
        arrayList.add(student);
    }
    public boolean findStudentById(ArrayList<Student> students, String id){
        for (Student student : students){
            if(student.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
    public boolean updateNameStudentById(ArrayList<Student> students, String id, String nameStudent){
        for (int i = 0; i < students.size(); i++){
            if (students.get(i).getId().equals(id)){
                students.get(i).setName(nameStudent);
                return true;
            }
        }
        return false;
    }
    public boolean removeStudent(ArrayList<Student> students, String id){
        for (int i =0 ; i<students.size(); i++){
            if (students.get(i).getId().equals(id)){
                students.remove(i);
                return true;
            }
        }
        return false;
    }
    public void showInfoStudents(ArrayList<Student> students){
        for (Student item : students){
            System.out.println("ID = " + item.getId() + " ; Name = " + item.getName());
        }
    }

    public void addStudent(Student student) {

    }
}
