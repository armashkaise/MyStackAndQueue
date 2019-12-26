import java.util.LinkedList;

public class MyQueue extends MyLinkedList {
//    private LinkedList queue = new LinkedList();

    public void add(Object value){
        if (value == null) return;
        super.add(value);
    }

    public Object peek(){
        if (super.getCount() < 1) return "Значений не имеется";
        return super.getFirst();
    }

    public Object pope(){
        int count = super.getCount();
        if (count == 0) return "Значений не имеется";

        Object firstValue = peek();
        try {
            super.deleteByIndex(0);
        } catch (NullPointerException e){

        }
//
        return firstValue;
    }
}
