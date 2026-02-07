package docodejava.junior.operators;

public class InstanceofO {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t instanceof Object); //true
        System.out.println(t instanceof Runnable); //true

//        instance of only works if there is a relation b/w the types.
//        System.out.println(t instanceof String);

//        null instanceof of object or any interface always returns false
        System.out.println(null instanceof Object); //false

    }
}
