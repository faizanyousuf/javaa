public class SwapTwoNumbersUsingXor {
    public static void main(String[] args){

        int a = 5;
        int b = 4;
        
        int temp = a^b;
        a = a^temp;
        b = b^temp;
        System.out.printf("value of a : %d \n Value of b: %d\n",a,b);
    }
}
