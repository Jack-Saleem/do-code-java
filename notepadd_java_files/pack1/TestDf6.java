package pack1;
class TestDf6 {
    public void m1(){
        System.out.println("I am a default class");
    }
     int a = 20;

    public static void main(String[] args) {
        TestDf6 d = new TestDf6();
        d.m1();
        System.out.println(d.a);
    }
}
