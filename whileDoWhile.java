package javaCourse;
import java.util.Scanner;

public class whileDoWhile {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int num;
        do { 
            System.out.println("Enter any number between 10 and 100");
            num = scanner.nextInt();

        } while (num <=10 || num >=100);

        System.out.printf("the entered number is %d \n",num);
        scanner.close();
    }
}
