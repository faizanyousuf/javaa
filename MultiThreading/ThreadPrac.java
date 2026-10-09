import java.sql.SQLOutput;
import java.text.RuleBasedCollator;
import java.time.temporal.ChronoUnit;

public class ThreadPrac {
    public static void main(String[] args) throws Exception{
//        Counter counter = new Counter();
//        counter.increment();
//        MyThread t1 = new MyThread(counter);
//        MyThread t2 = new MyThread(counter);
//        MyThread thread2 = new MyThread(counter);
//        Thread t1 = new Thread(thread);
//        Thread t2 = new Thread(thread);
//       MyRunnable runn = new MyRunnable(counter);

//        Runnable myRunn = new Runnable() {
//
//            @Override
//            public void run() {
//                counter.increment();
//            }
//        };
//        Thread t1 = new Thread(myRunn);
//        Thread t2 = new Thread(myRunn);
////        MyThread t1 = new MyThread("t1");
////        MyThread t2 = new MyThread("t2");
//        t2.start();
//        t1.start();
//          t1.join();
//          t2.join();
//        System.out.println(counter.count);

        Runnable runn = new Runnable(){
            @Override
            public void run(){
                for(int i = 0; i < 1000; i++){
                    if(((i & 1) ==  1)){
                        System.out.println(i+"  Is ODD");
                    }
                }
            }
        };
        Thread t1 = new Thread(runn);
        Thread t2 = new Thread(()->{
            try{
//                t1.join();
            }catch(Exception e){
                System.out.println(e);
            }
            for(int i = 0; i < 1000; i++){
                if((i & 1) == 0){
                    System.out.println(i+" Is EVEN");
                }
            }
        });
        System.out.println(t1.getState());
        t1.start();
//        Thread.State();
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
        t2.start();
    }
}
//class Counter{
//    public int count;
//    public void increment(){
//        for(int i = 0; i < 10000; i++){
//            this.count++;
//        }
//    }
//}
//class MyThread extends Thread{
//    Counter counter;
//    MyThread(Counter counter){
//        this.counter = counter;
//    }
//    @Override
//    public void run(){
//        counter.increment();
//    }
//}

//class MyThread extends Thread{
//    String name;
//    MyThread (String name){
//        this.name = name;
//    }
//    @Override
//    public void run(){
//
//        for(int i = 0; i < 10000; i++){
//            System.out.println(name+" "+ "thread Is running");
//        }
//    }
//}
//
//class MyRunnable implements Runnable{
//    Counter counter;
//    MyRunnable(Counter counter){
//      this.counter = counter;
//    }
//    @Override
//    public void run(){
//     counter.increment();
//    }
//}