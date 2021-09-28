package notes.thread;

import java.util.concurrent.*;

public class MyThread {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Runnable runner = new MyRunnable();
//        Thread thread = new Thread(runner);
//        thread.start();

//        Callable<Integer> call = new MyCallable();
//        FutureTask<Integer> ft = new FutureTask<>(call);
//        Thread thread = new Thread(ft);
//        thread.start();
//        System.out.println(ft.get());

//        ExecutorService es = Executors.newCachedThreadPool();
//        for (int i = 0; i<5; i++) {
//            es.execute(new MyRunnable());
//        }
//        es.shutdown();
//        System.out.println("ok");

//        SynchronizedExample synchronizedExample = new SynchronizedExample();
//        ExecutorService es = Executors.newCachedThreadPool();
//        es.execute(synchronizedExample::func1);
//        es.execute(synchronizedExample::func1);
//        es.shutdown();

        A a = new A();
        B b = new B(a);
        b.start();
        a.start();
    }
}
