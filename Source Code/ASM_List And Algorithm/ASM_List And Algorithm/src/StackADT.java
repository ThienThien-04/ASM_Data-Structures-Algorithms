import java.util.List;
import java.util.Stack;

public class StackADT {
    public Stack<Integer> createStack(){
        Stack<Integer> numbers = new Stack<>();
        List<String> cars = new Stack<>();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(4);
        numbers.push(5);
        return  numbers;
    }
    public void displayStack(Stack<Integer> numbers){
        System.out.println("Stack : " + numbers);
    }
    public void removeElement(Stack<Integer> numbers){
        numbers.pop(); // xoa phan tu tren dau Stack
        System.out.println("Stack after remove : " + numbers);
    }
    public void peekElement(Stack<Integer> numbers){
        int num = numbers.peek();
        System.out.println("element is peeked : " + num);
        System.out.println("Stack after peeked : " + numbers);
    }
    public void countElement(Stack<Integer> numbers){
        int count = numbers.size();
        System.out.println("Size of Stack : " + count);
    }
    public void findElementStack(Stack<Integer> stack, int number){
        int position = stack.search(number);
        if (position == -1) {
            System.out.println(number + " not found");
        } else {
            System.out.println(number + " found at position " + position);
        }
    }
    public void isEmptyStack(Stack<Integer> numbers){
        if (numbers.empty()){
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }
}
