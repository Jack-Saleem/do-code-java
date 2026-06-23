interface SampleInterface2 {
void m1();
}
interface SampleInterface3{
int m2();
}
abstract class Test implements SampleInterface2, SampleInterface3 {
public void m1(){
System.out.println("From SampleInterface2");
}
}
class Test2 extends Test{
public int m2(){
	return 20;
}
	public static void main(String[] args){
Test2 t2 = new Test2();
t2.m1();
System.out.println(t2.m2());
}
}