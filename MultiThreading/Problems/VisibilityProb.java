//package MultiThreading.Problems;

import java.util.concurrent.atomic.AtomicBoolean;

public class VisibilityProb {
    public static void main(String[] args) {

        AtomicBoolean flag = new AtomicBoolean(false);

        Thread t1 = new Thread(()->{
            boolean cache = flag.get();
            System.out.println(Thread.currentThread().getName()+ " " + cache );
        });
        Thread t2 = new Thread(()->{
            boolean cache = flag.get();
            try{
                Thread.sleep(2000);
            }catch(Exception e){

            }
            flag.set(true);

        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (Exception e){

        }

        System.out.println(flag);

    }
}
