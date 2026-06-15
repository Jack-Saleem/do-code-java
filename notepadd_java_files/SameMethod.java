interface A {
public void m1();
}
interface B {
public void m1();
}
class C implements A,B {
public void m1() {
		System.out.println("I am a m1 method of interface A & B");
}
public static void main(String[] args){
C obj = new C();
obj.m1();

A a = new C();
a.m1();

B b = new C();
b.m1();
}
}
