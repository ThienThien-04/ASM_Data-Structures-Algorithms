import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueADT {
    public Queue<String> createQueue(){
        Queue<String> colors = new LinkedList<>();
        // Queue<String> animals = new ArrayDeque<>();
        // Queue<String> countries = new PriorityQueue<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("pink");
        colors.add("violet");
        return colors;
    }
    public void showQueue(Queue<String> myQueue){
        System.out.println("Queue : " + myQueue);
    }
    public void insertDataQueue(Queue<String> queue){
        queue.offer("White");
        queue.offer("Black");
        queue.offer("Yellow");
    }
    public void checkSizeQueue(Queue<String> queue){
        int size = queue.size(); // kich thuoc cua queue
        System.out.println("Size od queue : " + size);
    }
    public void getElementQueue(Queue<String> queue){
        String element = queue.element();
        // thong bao ra 1 loi neu queue rong
        System.out.println("Data element : " + element);
    }
    public void getElementQueueV2(Queue<String> queue){
        String data = queue.peek();
        // tra ve null neu queue rong
        System.out.println("Element : " + data);
    }
    public void removeElement(Queue<String> queue){
        if (queue.isEmpty()){
            System.out.println("Queue is Empty, so do not remove");
        } else {
            String data = queue.remove();
            // neu Queue rong(khong co phan tu nao de xoa), thong bao ra 1 loi
            System.out.println("Element removed : " + data);
        }
    }
    public void removeElementV2(Queue<String> queue){
        String data2 = queue.poll();
        //neu Queue rong(khong co phan tu nao de xoa), tra ve null
        System.out.println("Element Poll : " + data2);
    }
    public void loopElement(Queue<String> queue){
        for (String item : queue){
            System.out.println("Data item = " + item);
        }
    }
}
