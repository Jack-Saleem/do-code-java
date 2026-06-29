package pack1;
class TestDf5 {
    void m1(){
        System.out.println("I am a default class");
    }
    public int a = 20;

    public static void main(String[] args) {
        TestDf5 d = new TestDf5();
        d.m1();
        System.out.println(d.a);
    }
}
