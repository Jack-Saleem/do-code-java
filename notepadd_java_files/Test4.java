interface Inter1 {
void m1();
}
interface Inter2 {
void m2();
}
interface Inter3 {
void m3();
}
interface Inter4 {
void m4();
}
interface Inter5 {
void m5();
}
interface Inter6 {
void m6();
}

abstract class a {
abstract public void m7();
}

class Test extends a implements Inter1, Inter2, Inter3, Inter4, Inter5, Inter6 {
public void m1() {
System.out.println("From Inter1");
}
public void m2() {
System.out.println("From Inter2");
}
public void m3() {
System.out.println("From Inter3");
}
public void m4() {
System.out.println("From Inter4");
}
public void m5() {
System.out.println("From Inter5");
}
public void m6() {
System.out.println("From Inter6");
}
public void m7() {
System.out.println("From Inter7");
}

	public static void main(String[] args){
	Test t = new Test();
	t.m1();
	t.m2();
	t.m3();
	t.m4();
	t.m5();
	t.m6();
	t.m7();
	}
}
	