//package MultiThreading.ThreadMethods;

public class Interrupt {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Thread t1 = new Thread(()->{
//            Thread.currentThread().setPriority(1);
            while (!Thread.currentThread().isInterrupted()){
//                Thread.yield();
                    System.out.println(Thread.currentThread().getName()+ " Running ");
            }
        });

        Thread t2 = new Thread(()->{
//            Thread.currentThread().setPriority(10);
            for(int i = 0; i < 100; i++){
                if((i & 1) == 1){
                    System.out.println(Thread.currentThread().getName()+ " Odd "+ i);
                }
            }
            System.out.println(t1.isInterrupted());
            t1.interrupt();
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch(Exception e){

        }

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());


        System.out.println("main Thread Ended");

    }
}
