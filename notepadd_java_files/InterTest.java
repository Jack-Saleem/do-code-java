interface Left {
	void m1();
}
interface Right {
	void m1(int x);
}
class J implements Left, Right {
	public void m1(){
		System.out.println("I am a m1 method with return type void");
	}
	public void m1(int x) {
				System.out.println("I am a m1 method with argument int " + x);
	}
	public static void main(String[] args){
		J obj = new J();
obj.m1();
obj.m1(10);
	}		
}
