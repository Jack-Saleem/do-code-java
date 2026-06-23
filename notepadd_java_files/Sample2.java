interface A {
void m1();
}
interface B extends A {
void m2();
}
class Test implements B {
public void m1() {
System.out.println("M1 Metod");
}
public void m2() {
System.out.println("M2 Metod");
}
public static void main(String[] args) {
Test t = new Test();
t.m1();
t.m2();
}
}