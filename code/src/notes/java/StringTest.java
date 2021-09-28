package notes.java;

public class StringTest {
    public static void main(String[] args) {
        String a1 = new String("aaa");
        String a2 = new String("aaa");
        System.out.println(a1 == a2);

        String a3 = a1.intern();
        String a4 = a1.intern();
        System.out.println(a3 == a4);

        String b1 = "bbb";
        String b2 = "bbb";
        System.out.println(b1 == b2);
    }
}
