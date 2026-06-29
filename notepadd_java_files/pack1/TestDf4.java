package pack1;
class TestDf4 {
    private void m1(){
        System.out.println("I am a default class");
    }
    private int a = 20;

    public static void main(String[] args) {
        TestDf4 d = new TestDf4();
        d.m1();
        System.out.println(d.a);
    }
}
