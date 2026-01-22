package test;

import java.io.IOException;

public class test{

    public static void main(String[] args) throws IOException {
        ThreadWithClass thread1 = new ThreadWithClass();
        Thread thread2 = new Thread(new ThreadWithRunnable());

        thread1.start();
        thread2.start();

    }

}

class ThreadWithClass extends Thread{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(getName());
            try{
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

class ThreadWithRunnable implements Runnable {

    @Override
    public void run() {
        for(int i = 0 ; i < 5; i++){
            System.out.println(Thread.currentThread().getName());

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

