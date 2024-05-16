# Chapter 7: Multithreading and Concurrency

In this chapter, we'll explore multithreading and concurrency in Java, which are essential concepts for building efficient and responsive applications.

## Threads

A thread is a separate path of execution within a program. Java supports multithreading, which means that a single Java application can have multiple threads running concurrently.

### Creating and Starting Threads

You can create a new thread in Java by extending the `Thread` class or implementing the `Runnable` interface. Here's an example of creating a thread by extending the `Thread` class:

```java
class MyThread extends Thread {
    @Override
    public void run() {
        // Code to be executed by the thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + getName() + ": " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start(); // Starting the first thread
        thread2.start(); // Starting the second thread
    }
}
```

In this example, we create two instances of the `MyThread` class and call the `start()` method to start the threads. Each thread will execute the code in the `run()` method.

### Thread Synchronization

When multiple threads access shared resources (e.g., variables or objects), there is a possibility of race conditions and data inconsistency. Java provides the `synchronized` keyword to control access to shared resources and prevent race conditions.

```java
class Counter {
    private int value;

    public synchronized void increment() {
        value++;
    }

    public synchronized int getValue() {
        return value;
    }
}

public class SynchronizationExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final counter value: " + counter.getValue()); // Output: 20000
    }
}
```

In this example, the `Counter` class has two methods, `increment()` and `getValue()`, that are marked as `synchronized`. This ensures that only one thread can access these methods at a time, preventing race conditions when incrementing the `value` variable.

## Concurrency Utilities

Java provides several concurrency utilities in the `java.util.concurrent` package to simplify the development of concurrent applications.

### ExecutorService

The `ExecutorService` interface provides a way to execute tasks asynchronously using thread pools. This can help improve performance and resource utilization.

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4); // Create a thread pool with 4 threads

        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> {
                // Task to be executed
                System.out.println("Task executed by thread: " + Thread.currentThread().getName());
            });
        }

        executorService.shutdown(); // Shut down the executor service
    }
}
```

In this example, we create an `ExecutorService` with a fixed thread pool of 4 threads. We then submit 10 tasks to the executor service using the `execute()` method. The tasks are executed by the threads in the pool concurrently.

### Locks and Semaphores

Java provides several lock and semaphore implementations in the `java.util.concurrent.locks` package for more advanced synchronization and coordination between threads.

```java
import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    private static final int MAX_CONCURRENT_THREADS = 3;
    private static final Semaphore semaphore = new Semaphore(MAX_CONCURRENT_THREADS);

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                try {
                    semaphore.acquire(); // Acquire a permit from the semaphore
                    System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
                    Thread.sleep(2000); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release(); // Release the permit
                }
            });
            thread.start();
        }
    }
}
```

In this example, we create a `Semaphore` with a maximum of 3 permits. Each thread tries to acquire a permit from the semaphore before executing its task. If no permits are available, the thread will wait until a permit becomes available. After completing the task, the thread releases the permit, allowing other threads to acquire it.

These are just a few examples of the multithreading and concurrency features in Java. In the next chapter, we'll explore Java's networking capabilities and how to create network-based applications.