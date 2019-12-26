import java.util.ArrayList;
import java.util.LinkedList;

public class MyStack {
    private ArrayList stack = new ArrayList();

    public void add(Object value){
        if (value == null) return;
        stack.add(value);
    }

    public Object peek(){
        if (stack.size() < 1) return "Значений не имеется";
        return stack.get(stack.size() - 1);
    }

    public Object pope(){
        Object lastValue = peek();

        try {
            stack.remove(stack.size() - 1);
        } catch (IndexOutOfBoundsException e){
            return "Значений не имеется";
        }

        return lastValue;
    }
}
