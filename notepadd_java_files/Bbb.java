public class Bbb extends Aaa {
    public void m1(){
        System.out.println("I am a abstract method from clas Aaa");
    }

    public static void main(String[] args) {
        Bbb b=  new Bbb();
        b.m1();
    }
}
