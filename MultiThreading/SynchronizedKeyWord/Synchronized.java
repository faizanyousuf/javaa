//package MultiThreading.SynchronizedKeyWord;

public class Synchronized {

    public static void main(String[] args) {
        Counter c =  new Counter();

        Thread t1 = new Thread(()->{
//            System.out.println(Thread.currentThread().getName()+" Running "+ c.count);
            c.increment();
            try {
                Thread.sleep(4000);
            }catch(Exception e){

            }
        });

        Thread t2 = new  Thread(()->{
//            System.out.println(Thread.currentThread().getName()+" Running  "+ c.count);
            c.increment();
        });
        System.out.println(t1.getState());
        System.out.println(t2.getState());

        t1.start();
        t2.start();

        try {
            Thread.sleep(3000);
        }catch(Exception e){

        }
        System.out.println(t1.getState());
        System.out.println(t2.getState());


        try {
            t1.join();
            t2.join();
        }catch (Exception e){

        }

        System.out.println(c.count);
    }

}
class Counter {
     int count = 0;
  synchronized  void increment (){
        for(int i = 0; i < 10000; i++){
            String name = Thread.currentThread().getName();
            System.out.println(name +" Running " +  count);
            try {
                Thread.sleep(2000);
            }catch (Exception e){

            }
            count++;
        }
    }
}
