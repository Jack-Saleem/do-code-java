package pack1;

public class PublicTestPrvr {
    private void name(){
        System.out.println("I am name method");
        System.out.println(age);
    }
    private int age = 20;

    public static void main(String[] args) {
        PublicTestPrvr t = new PublicTestPrvr();
        t.name();

    }
}
