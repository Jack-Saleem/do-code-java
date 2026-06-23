interface SampleInterface1 {
	void m1();
}
class Sample implements SampleInterface1 {
	public void m1(){
		System.out.println("SampleInterface1");
	}
	public static void main(String[] args){
		Sample s = new Sample();
		s.m1();
	}
}
