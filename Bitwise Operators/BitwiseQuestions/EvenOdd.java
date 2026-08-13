// package BitwiseQuestions;

public class EvenOdd {
    public static void main(String[] args){

        int n = 25;

        if((n & 1) == 0){
             System.out.println("Even");
        }else
           System.out.println("Odd");

           // why this works ?
           //for 5 bit for example 4 & 1 is 
        //    00100
        //    00001
        // when we do and if numbers lsb is 1 it will give 1 else 0;
    }
}
