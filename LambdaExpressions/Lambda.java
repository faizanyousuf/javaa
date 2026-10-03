////package LambdaExpressions;
//interface Book{ ;
//     void show();
//     int add(int a , int b);
//}
//
//public class Lambda {
//    public static void main(String[] args) {
//        Book b = new Book(){
//            public void show(){
//                System.out.println("in show");
//            }
//            public int add(int a , int b){
//                return a+b;
//            }
////            public int multiple(int a ,int b){
////                return a*b;
////            }
//        };
//        b.show();
//        int result = b.add(24,5);
//        System.out.println(result);
//    }
//}



interface Calculator{
    int calculate(int a , int b);
}

public class Lambda {
    public static void main(String[] args) {
//        Book b = new Book(){
//          public void show(){
//                System.out.println("in show");
//            }
//        };


        Calculator add = (a, b) -> a+b;
        System.out.println(add.calculate(2,5));
    }
}