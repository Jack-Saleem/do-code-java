package pack1;
class TestDf8 {
    void m1(){
        System.out.println("I am a default class");
    }
    private int a = 20;

    public static void main(String[] args) {
        TestDf8 d = new TestDf8();
        d.m1();
        System.out.println(d.a);
    }
}
