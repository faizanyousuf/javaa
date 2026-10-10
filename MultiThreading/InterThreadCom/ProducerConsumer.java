//package MultiThreading.InterThreadCom;

public class ProducerConsumer {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Items item = new Items();

        Runnable prod = new Producer(item);
        Runnable cons = new Consumer(item);

        Thread t1 = new Thread(prod);
        Thread t2 = new Thread(cons);

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch(Exception e){

        }

        System.out.println("main thread Ends");
    }
}

class Items {
     volatile private int  item = 0;
    volatile boolean  produces = false;
     boolean consumes = false;
    int getItem (){
         return  item;
    }
    void setItem(int item){
        this.item = item;
    }
}


class Producer  implements Runnable {
    Items item;

    Producer(Items item) {
        this.item = item;
    }

    @Override
    public void run() {
        synchronized (item) {
            for (int i = 1; i < 100; i++) {
                item.setItem(i);
                System.out.println(Thread.currentThread().getName() + " Producer Produces " + item.getItem());
                item.produces = true;
                item.consumes = false;
                item.notify();
                while (!item.consumes) {
                    try {
                        item.wait();
                    } catch (Exception e) {

                    }
//                System.out.println("Producer Waiting ...");
                }
            }
        }
    }
}

class Consumer implements  Runnable {
    Items item;

    Consumer(Items item) {
        this.item = item;
    }

    @Override
        public void run () {
          synchronized (item) {
              for (int i = 1; i < 100; i++) {
                  while (!item.produces) {
                      try {
                          item.wait();
                      } catch (Exception e) {

                      }
//                System.out.println("Consumer waiting...");
                  }
                  System.out.println(Thread.currentThread().getName() + " Consumer Consumes " + item.getItem());
                  item.consumes = true;
                  item.produces = false;
                  item.notify();
              }
          }
    }
}

