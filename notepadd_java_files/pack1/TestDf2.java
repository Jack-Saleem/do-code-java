package pack1;
class TestDf2 {
    private void m1(){
        System.out.println("I am a default class");
    }
    public int a = 20;

    public static void main(String[] args) {
        TestDf2 d = new TestDf2();
        d.m1();
        System.out.println(d.a);
    }
}
