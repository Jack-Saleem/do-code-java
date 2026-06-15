interface InterVar {
int x = 48;
void m1();
}
class Var {
public void m1() {
		System.out.println("I am a m1 method of interface InterVar");
		}
		public static void main(String[] args){
Var v = new Var();
v.m1();
System.out.println("I'm an interface variable " + InterVar.x);
}
}
