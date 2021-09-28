package notes.java;

public class A {

    // 静态语句块在类初始化时运行一次
    static {
        System.out.println("123");
    }

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
    }
}
