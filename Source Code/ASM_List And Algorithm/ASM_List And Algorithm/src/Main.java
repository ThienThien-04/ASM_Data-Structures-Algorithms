import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shapes rec = new Rectangle(4, 5);
        double area = rec.calculateArea();
        double perimeter0 = rec.calculatePerimeter();
        System.out.println("Dien tich hinh chu nhat la : " + area);
        System.out.println("Chu vi hinh chu nhat la : " +  perimeter0);
        Shapes sq = new Square(6, 6);
        double area2 = sq.calculateArea();
        double perimeter = sq.calculatePerimeter();
        System.out.println("Dien tich hinh vuong la : " + area2);
        System.out.println("Chu vi hinh vuong la : " +  perimeter);


        // ProductController product = new ProductController(null);
        // can truy cap vao thuoc tinh myName va age trong ProductController lam nhu the nao
        String name = ProductController.myName;
        System.out.println("ten cua toi la "+name);

        ProductController.showAge();
        ProductController.showAge();
        ProductController.showAge();
        ProductController.showAge();

        int Age = ProductController.age;
        System.out.println("tuoi cua toi la "+Age);

        ArrayBasic arr = new ArrayBasic();
        //arr.showArray();
        int[] radNumber = {300,4,1,99,5,7,8,10,2,3};
        int max = arr.maxNumberInArray(radNumber);
        System.out.println("Max in array number is : " + max);
        int min = arr.minNumberInArray(radNumber);
        System.out.println("Min in array number is : " + min);
        int sum = arr.sumNumber(radNumber);
        System.out.println("Tong cac so nguyen to la : " + sum);
        double avg = arr.avgNumber(radNumber);
        System.out.println("TBC cac so nguyen to trong mang la : " + avg);
        /////////////////////////////////////////////////////////////////
        LinkedListADT listADT = new LinkedListADT();
        List<String> data = listADT.createLinkedList();
        listADT.addElement(data);
        listADT.addElementByIndex(data, 0, "Lion");
        listADT.getElementByIndex(data, 3);
        listADT.changeDataElement(data,3, "Tiger");
        listADT.removeElementByIndex(data, 3);
        listADT.findElement(data, "Cat");
        listADT.findElementV1(data, "Dog");
        listADT.findElementV2(data, "Lion");
        listADT.loopElement(data);
        ///////////////////////////////////////////////////////////////
        StackADT stack = new StackADT();
        Stack<Integer> dataNumber = stack.createStack();
        stack.displayStack(dataNumber);
        stack.removeElement(dataNumber);
        stack.peekElement(dataNumber);
        stack.countElement(dataNumber);
        stack.findElementStack(dataNumber, 5);
        stack.isEmptyStack(dataNumber);
        ///////////////////////////////////////////////////////////////
        QueueADT queueADT = new QueueADT();
        Queue<String> colors = queueADT.createQueue();
        //queueADT.showQueue(colors);
        queueADT.insertDataQueue(colors);
        //queueADT.showQueue(colors);
        queueADT.checkSizeQueue(colors);
        queueADT.getElementQueue(colors);
        queueADT.getElementQueueV2(colors);
        queueADT.showQueue(colors);
        queueADT.removeElement(colors);
        queueADT.showQueue(colors);
        queueADT.removeElementV2(colors);
        queueADT.showQueue(colors);
        queueADT.loopElement(colors);
        //////////////////////////////////////////////
        ArrayListADT arrayListADT = new ArrayListADT();
        List<String> animals = arrayListADT.createArrayList();
        arrayListADT.showArrayList(animals);
        arrayListADT.getElement(animals, 2);
        arrayListADT.changElement(animals, 2, "Lion");
        arrayListADT.getSizeArrayList(animals);
        arrayListADT.removeElement(animals, 2);
        arrayListADT.loopElementArrayList(animals);
        /////////////////////////////////////////////////////////
        Student st1 = new Student("BH001", "Cao Viet Nghiem", 20, "Ha Noi");
        Student st2 = new Student("BH002", "Vu Duy An", 20, "Vinh Phuc");
        Student st3 = new Student("BH003", "Ngo Kim Loc", 21, "Ha Nam");
        Student st4 = new Student("BH004", "Tran Viet Anh", 19, "Nam Dinh");
        ArrayList<Student> dataST = new ArrayList<>();
        StudentArrayList studentArrayList = new StudentArrayList();
        studentArrayList.createDataStudent(st1, dataST);
        studentArrayList.createDataStudent(st2, dataST);
        studentArrayList.createDataStudent(st3, dataST);
        studentArrayList.createDataStudent(st4, dataST);

        boolean checkingST = studentArrayList.findStudentById(dataST, "BH001");
        if (checkingST){
            System.out.println("Found it");
        } else {
            System.out.println("Not found it");
        }
        studentArrayList.updateNameStudentById(dataST, "BH002", "Nguyen Duc Khanh Huy");
        studentArrayList.showInfoStudents(dataST);

        studentArrayList.removeStudent(dataST, "BH004");
        studentArrayList.showInfoStudents(dataST);

    }
}



