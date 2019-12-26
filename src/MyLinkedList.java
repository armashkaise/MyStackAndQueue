

import java.util.ArrayList;

public class MyLinkedList {
    private MyNode first;
    private MyNode last;
    private int count;

    public void add(Object value) {
        MyNode localLast = last;
        MyNode newNode = new MyNode(null, value, localLast);

        last = newNode;
        if (localLast == null){
            first = newNode;
        }
        else {
            localLast.next = newNode;
        }
        count++;
    }
    public void add(int index, int value) {
        if (index == count) {
            add(value);
            print();
            return;
        }
        if (index > (count-1)) {
            System.out.println("Заданый индекс ячейки превышает размер максимального индекса списка");
            return;
        }
        if (index < 0) {
            System.out.println("Заданый индекс ячейки не соответствует списку");
            return;
        }
        int def = count / 2;

        if (index <= def){
            MyNode localFirst = first;
            MyNode predNode = null;
            MyNode nextNode = null;
            for (int i = 0; i <= def; i++) {
                if (i == index){
                    break;
                }
                else localFirst = localFirst.next;
            }
            if (localFirst != null){
                predNode = localFirst.prev;
                nextNode = localFirst.next;
            }
            MyNode newNode = new MyNode(nextNode.prev, value,predNode);
            if (index == 0){
                localFirst.prev = newNode;
                first = newNode;
            }
            else {
                predNode.next = newNode;
                localFirst.prev = newNode;
            }
            count++;
        }
        if (index > def){
            MyNode localLast = last;
            MyNode predNode = null;
            MyNode nextNode = null;
            for (int i = count-1; i >= 0; i--) {
                if (i == index){
                    break;
                }
            localLast = localLast.prev;
            }
            if (localLast != null){
                predNode = localLast.prev;
                nextNode = localLast;
            }


            MyNode newNode = new MyNode(nextNode, value,predNode);
            if (index == (count-1)){
                predNode.next = newNode;
                newNode.next = localLast;
                localLast.prev = newNode;
                last = nextNode;
            }
            else {
                predNode.next = newNode;
                localLast.prev = newNode;
            }
            count++;
        }
        //print();
    }


    public void deleteByIndex(int index){
        if (index > (count-1)) {
            System.out.println("Заданый индекс ячейки превышает размер максимального индекса списка");
            return;
        }
        if (index < 0) {
            System.out.println("Заданый индекс ячейки не соответствует списку");
            return;
        }
        int def = count / 2;

        if (index <= def) {
            MyNode localFirst = first;
            MyNode predNode = null;
            MyNode nextNode = null;
            for (int i = 0; i <= def; i++) {
                if (i == index) {
                    break;
                } else localFirst = localFirst.next;
            }
            if (localFirst != null) {
               predNode = localFirst.prev;
               nextNode = localFirst.next;
                if (index == 0) {
                    if (nextNode != null) nextNode.prev = null;
                    first = nextNode;
                    if (count == 1) last = first;
                }
                else {
                    if (predNode != null) predNode.next = nextNode;
                    if (nextNode != null) nextNode.prev = predNode;
                    if (index == def) last = first;
                }
            }
        }
        if (index > def) {
            MyNode localLast = last;
            MyNode predNode = null;
            MyNode nextNode = null;
            for (int i = count - 1; i >= 0; i--) {
                if (i == index) {
                    break;
                }
                localLast = localLast.prev;
            }
            if (localLast != null) {
                predNode = localLast.prev;
                nextNode = localLast.next;
                if (index == count-1){
                    predNode.next = null;
                    last = predNode;
                }
                else {
                    predNode.next = nextNode;
                    nextNode.prev = predNode;
                }
            }
        }
        count--;
    }

    public void getCountElement(){
        System.out.println("Количество элементов в массиве: " + count);
    }

    @Override
    public String toString() {
        String result = "";
        MyNode localFirst = first;
        if (localFirst == null){
            System.out.println("Значения не найдены");
        }
        for (int i = 0; i < count; i++) {
//            MyNode predNod = localFirst.prev;
            MyNode nextNod = localFirst.next;
            Object item = localFirst.item;
            result = result + "[" + i + "]" + item + " ";
            if (nextNod != null) localFirst = nextNod;
        }
        return result;
    }

    public void print(){
        MyNode localFirst = first;
        if (localFirst == null){
            System.out.println("Значения не найдены");
            return;
        }
        System.out.println("****************************************");
        for (int i = 0; i < count; i++) {
                MyNode predNod = localFirst.prev;
                MyNode nextNod = localFirst.next;
                Object item = localFirst.item;
            if (predNod != null) System.out.print("[" +  predNod.item + "] ");
            else System.out.print("[null] ");
            System.out.print(item);
            if (nextNod != null) System.out.print(" [" +  nextNod.item + "] ");
            else System.out.print(" [null]");
            System.out.println();
            if (nextNod != null) localFirst = nextNod;
        }
        System.out.println("****************************************");
    }

    public MyNode getFirst() {
        return first;
    }

    public MyNode getLast() {

        return last;
    }

    public int getCount() {
        return count;
    }

}

class MyNode{
    MyNode prev;
    MyNode next;
    Object item;

    MyNode(MyNode last , Object value, MyNode first){
        this.prev = first;
        this.item = value;
        this.next = last;
    }

    @Override
    public String toString() {
        return "" + item;
    }
}


