interface Animal {
void sound();
}
class Dog implements Animal {
public void sound() {
System.out.println("Dog barks");
}
public static void main(String[] args){
Dog a1 = new Dog();
a1.sound();
	}
}