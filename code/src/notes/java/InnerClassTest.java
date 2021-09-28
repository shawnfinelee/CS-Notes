package notes.java;

public class InnerClassTest {
    static class InnerClass{
        public String name;
    }

    public static void main(String[] args) {
        InnerClass ic = new InnerClass();
        ic.name = "aaa";

        System.out.println(ic);
    }
}
