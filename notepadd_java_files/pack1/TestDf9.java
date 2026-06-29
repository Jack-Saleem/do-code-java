package pack1;
class TestDf9 {
    private void m1(){
        System.out.println("I am a default class");
    }
    int a = 20;

    public static void main(String[] args) {
        TestDf9 d = new TestDf9();
        d.m1();
        System.out.println(d.a);
    }
}
