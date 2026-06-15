interface intref {
void m1();
}
abstract class Test implements intref {
}
class A extends Test{
public void m1(){
System.out.println("inerface testing");
}
public static void main(String[] args){
A obj = new A();
obj.m1();
}
}

