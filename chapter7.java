import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class chapter7 {
    public static void main(String[] args) {
        // Creating and Starting Threads
        System.out.println("Creating and Starting Threads:");
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();

        System.out.println();

        // Thread Synchronization
        System.out.println("Thread Synchronization:");
        Counter counter = new Counter();

        Thread incrementThread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        Thread incrementThread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        incrementThread1.start();
        incrementThread2.start();

        try {
            incrementThread1.join();
            incrementThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final counter value: " + counter.getValue());
        System.out.println();

        // ExecutorService
        System.out.println("ExecutorService:");
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> {
                System.out.println("Task executed by thread: " + Thread.currentThread().getName());
            });
        }

        executorService.shutdown();
        System.out.println();

        // Locks and Semaphores
        System.out.println("Locks and Semaphores:");
        final int MAX_CONCURRENT_THREADS = 3;
        final Semaphore semaphore = new Semaphore(MAX_CONCURRENT_THREADS);
        final Lock lock = new ReentrantLock();

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                try {
                    semaphore.acquire();
                    lock.lock();
                    System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                    semaphore.release();
                }
            });
            thread.start();
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + getName() + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Counter {
    private int value;
    private final Object lock = new Object();

    public void increment() {
        synchronized (lock) {
            value++;
        }
    }

    public int getValue() {
        synchronized (lock) {
            return value;
        }
    }
}