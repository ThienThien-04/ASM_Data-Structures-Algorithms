import java.util.ArrayList;
import java.util.List;

public class ArrayListADT {
    public List<String> createArrayList(){
        List<String> animals = new ArrayList<>();
        // ArrayList<String> fruits = new ArrayList<>();
        animals.add("pig");
        animals.add("chicken");
        animals.add("Tiger");
        animals.add("Mouse");
        return animals;
    }
    public void showArrayList(List<String> myArrayList){
        System.out.println("ArrayList : " + myArrayList);
    }
    public void getElement(List<String> list, int index){
        String data = list.get(index); // truy cap vao phan tu
        System.out.println("Element : " + data);
    }
    public void changElement(List<String> list, int index, String value){
        list.set(index, value);
        showArrayList(list);
    }
    public void getSizeArrayList(List<String> list){
        int size = list.size();
        System.out.println("Size of ArrayList : " + size);
    }
    public void removeElement(List<String> list, int index){
        list.remove(index);
        showArrayList(list);
    }
    public void loopElementArrayList(List<String> list){
        for (int i = 0; i < list.size(); i++){
            System.out.println("Item = " + list.get(i));
        }
        for (String data : list){
            System.out.println("data = " + data);
        }
    }
}
