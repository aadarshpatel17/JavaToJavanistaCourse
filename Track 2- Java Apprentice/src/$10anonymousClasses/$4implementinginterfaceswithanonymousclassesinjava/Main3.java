package $10anonymousClasses.$4implementinginterfaceswithanonymousclassesinjava;

public class Main3 {

    public static void main(String[] args) {

        /**
         * Implementing Interfaces with Anonymous Classes in Java
         *  -   Thread: A Thread of execution is the smaller sequence of programming instructions
         *      that can be managed by your machines' scheduler.
         */

/*
        System.out.println("Current thread name: " + Thread.currentThread().getName());
        System.out.println("Current thread priority: " + Thread.currentThread().getPriority());

        class LocalThread extends Thread {
            public void run() {
                System.out.format("Current thread name: %s priority: %d\n",
                        Thread.currentThread().getName(),
                        Thread.currentThread().getPriority());
            }
        }

        Thread thread = new LocalThread();
        thread.start();

        System.out.format("Current thread name: %s, priority: %d\n",
                Thread.currentThread().getName(), Thread.currentThread().getPriority());
*/


//        passing runnable interface into new Thread;
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.format("Current thread name: %s, priority: %d\n", Thread.currentThread().getName(), Thread.currentThread().getPriority());
            }
        });

        thread.start();

        System.out.format("Current thread name: %s, priority: %d\n", Thread.currentThread().getName(), Thread.currentThread().getPriority());

    }

}
