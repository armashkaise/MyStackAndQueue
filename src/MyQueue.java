import java.util.LinkedList;

public class MyQueue {
    private LinkedList queue = new LinkedList();

    public void add(Object value){
        if (value == null)
            return;
        queue.add(value);
    }

    public Object peek(){
        if (queue.size() < 1) return "Список пуст";
        return queue.peekFirst();
    }

    public Object pope(){
        if (queue.size() == 0)
            return "Значений не имеется";
        Object firstValue = peek();
        queue.removeFirst();
        return firstValue;
    }
}
