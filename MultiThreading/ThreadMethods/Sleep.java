//package MultiThreading.ThreadMethods;

import java.security.spec.ECField;

public class Sleep {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());// main

        Thread t1 = new Thread(()->{

            try {
                Thread.sleep(2000);

            }catch (Exception e){

            }
            System.out.println(Thread.currentThread().getName());
//            System.out.println(Thread.currentThread().getState());
        });
        System.out.println(t1.getState()); // new
        t1.start();

        try {
            Thread.sleep(4000);
        }catch (Exception e){

        }

        System.out.println(Thread.currentThread().getState());
        System.out.println("main Thread ended");
    }
}
