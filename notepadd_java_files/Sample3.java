interface A {
void m1();
}
interface B {
void m2();
}
class Test implements A, B {
public void m1(){
System.out.println("Interface A");
}
public void m2() {
System.out.println("Interface B");
}
public static void main(String[] args) {
A a = new Test();
a.m1();
B b = new Test();
b.m2();
	}
}