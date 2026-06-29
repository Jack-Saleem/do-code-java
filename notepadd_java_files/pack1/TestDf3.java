package pack1;
class TestDf3 {
    public void m1(){
        System.out.println("I am a default class");
    }
    private int a = 20;

    public static void main(String[] args) {
        TestDf3 d = new TestDf3();
        d.m1();
        System.out.println(d.a);
    }
}
