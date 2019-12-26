import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //**************stack**********************
        System.out.println("**************stack**************");
        MyStack myStack = new MyStack();

        myStack.add(1);
        myStack.add("stroka");
        myStack.add(new Men("Ivan", 10));
        myStack.add(2);
        myStack.add("stroka2");
        myStack.add(new Men("Arman", 20));

        System.out.println("метод peek " + myStack.peek());
//
        System.out.println("метод pope " + myStack.pope());
        System.out.println("метод pope " + myStack.pope());
        System.out.println("метод pope " + myStack.pope());
        System.out.println("метод pope " + myStack.pope());
        System.out.println("метод pope " + myStack.pope());
        System.out.println("метод pope " + myStack.pope());
        System.out.println("метод pope " + myStack.pope());

        //**************queue**********************
        System.out.println("**************queue**************");
        MyQueue myQueue = new MyQueue();

        myQueue.add(1);
        myQueue.add("stroka");
        myQueue.add(new Men("Ivan", 10));
        myQueue.add(2);
        myQueue.add("stroka2");
        myQueue.add(new Men("Arman", 20));
//
        System.out.println("метод peek " + myQueue.peek());
        System.out.println("метод pope " + myQueue.pope());
        System.out.println("метод pope " + myQueue.pope());
        System.out.println("метод pope " + myQueue.pope());
        System.out.println("метод pope " + myQueue.pope());
        System.out.println("метод pope " + myQueue.pope());
        System.out.println("метод pope " + myQueue.pope());
        System.out.println("метод pope " + myQueue.pope());


    }
}

class Men{
    private String name;
    private int age;

    public Men(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Men{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}