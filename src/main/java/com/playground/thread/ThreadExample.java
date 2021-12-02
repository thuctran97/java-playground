package com.playground.thread;

class ThreadExample extends Thread{
    public int count;
    public void run() {
        System.out.println("Thread starting");
        try {
            Thread.sleep(1000);
            System.out.println("In Threa, count is: " + count);
        } catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("Terminating");
    }
}
class Example {
    public static void main(String[] args) {
        for (int i=0; i< 10; i++){
            ThreadExample instand = new ThreadExample();
            instand.count = i;
            instand.start();
        }
    }

}
