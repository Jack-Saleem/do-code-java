package pack1;
class TestDf1 {
    public void m1(){
        System.out.println("I am a default class");
    }
    public int a = 20;

    public static void main(String[] args) {
        TestDf1 d = new TestDf1();
        d.m1();
        System.out.println(d.a);
    }
}
