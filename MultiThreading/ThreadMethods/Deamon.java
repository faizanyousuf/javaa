//package MultiThreading.ThreadMethods;

public class Deamon {
    public static void main(String[] args) {


        System.out.println(Thread.currentThread().getName());

        Thread t1  = new Thread(()->{;
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
            System.out.println(Thread.currentThread().getName());
            System.out.println("Thread t1 Is Demon: "+ Thread.currentThread().isDaemon());
             int i  = 0;
            while(i < 1000){
                System.out.println(Thread.currentThread().getName()+" Running");
                i++;
            }
        });
        t1.setDaemon(true);
        t1.start();
        System.out.println("main thread ended");
    }
}
