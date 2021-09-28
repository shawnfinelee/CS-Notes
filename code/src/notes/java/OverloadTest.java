package notes.java;

public class OverloadTest {
    public void show(int i) {
        System.out.println(i);
    }

    public void show(int i, String s) {
        System.out.println(i + " " + s);
    }
}
