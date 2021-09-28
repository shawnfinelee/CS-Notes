package notes.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyCDL {
    public static void main(String[] args) throws InterruptedException {
        int total = 10;
        CountDownLatch cdl = new CountDownLatch(total);
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < total; i++) {
            es.execute(() -> {
                System.out.println("run..");
                cdl.countDown();
            });
        }

        cdl.await(); //等待线程都执行完，即count为0时执行
        System.out.println("end");
        es.shutdown();
    }
}
