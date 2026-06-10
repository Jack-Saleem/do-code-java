public class Student{
String name;
int age;

void study(){
	System.out.println("Student is studying");
}

public static void main(String[] args){
Student s1 = new Student();
s1.name = "sadik";
s1.age = 22;
System.out.println("Name: " + s1.name);
System.out.println("Age: " + s1.age);
s1.study();
}
}
