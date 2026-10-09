//package MultiThreading.ThreadMethods;

public class Methods {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
//        MyThread run = new MyThread();
//          Runnable run = new Runnable() {
//              @Override
//              public void run() {
//                        for(int i = 0; i < 100; i++){
//                            System.out.println(Thread.currentThread().getName()+" running"+i);
//                        }
//              }
//          };
//          Runnable runn = ()->{
//              for(int i = 0; i < 100; i++){
//                  System.out.println(Thread.currentThread().getName()+ " Running");
//              }
//          };
        Thread t1 = new Thread(()->{
//            t2.join();
            for(int i = 0; i < 100; i++){
                System.out.println(Thread.currentThread().getName()+" running "+ i);
            }
        });

        Thread t2 = new Thread(()-> {
            try {
                t1.join();
            }catch (Exception e){

            }
            for(int i = 0; i < 100; i++){
                if((i & 1) == 1){
                    System.out.println(Thread.currentThread().getName()+" Running "+ i);
                }
            }
        });


        t1.start();
        t2.start();
        try {
            t1.join();
        }catch(Exception e){

        }
        System.out.println("Main Thread Ends");
    }
}

//class MyThread implements Runnable{
//
//    @Override
//    public void run(){
//        for(int i = 0; i < 1000; i++){
//            System.out.println(Thread.currentThread().getName()+" running "+i);
//        }
//    }
//}
