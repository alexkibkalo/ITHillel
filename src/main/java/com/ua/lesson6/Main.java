package com.ua.lesson6;


class A extends Thread {
    @Override
    public void run() {
        System.out.println("We are here: Thread");
    }
}

class B implements Runnable {
    @Override
    public void run() {
        System.out.println("We are here: Runnable");
    }
}


public class Main {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        a.start();

        B b = new B();
        b.run();

        Thread c = new Thread(new B());
        c.start();

        Thread[] threads = new Thread[Thread.activeCount()];
        Thread.enumerate(threads);

        int threadCounts = 0;
        for (Thread thread : threads) {
            if(thread != null){
                threadCounts++;
            }
        }
        System.out.println(threadCounts);
    }
}
