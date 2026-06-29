package pack1;
class TestDf7 {
    public void m1(){
        System.out.println("I am a default class");
    }
    int a = 20;

    static void main(String[] args) {
        TestDf7 d = new TestDf7();
        d.m1();
        System.out.println(d.a);
    }
}
