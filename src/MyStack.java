

public class MyStack extends MyLinkedList {


    public void add(Object value){
        if (value == null) return;
        super.add(value);
    }

    public Object peek(){
        if (super.getCount() < 1) return "Значений не имеется";
        return super.getLast();
    }

    public Object pope(){

        int count = super.getCount();
        if (count == 0) return "Значений не имеется";

        Object lastValue = peek();
        try {
            super.deleteByIndex(count - 1);
        } catch (NullPointerException e){

        }
//
        return lastValue;
    }
}
