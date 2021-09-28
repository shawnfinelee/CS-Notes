package notes.thread;

public class SynchronizedExample {
    public void func1() {
        synchronized (this) {
            for (int i=0; i<5 ; i++) {
                System.out.println(i);
            }
        }
    }
}
