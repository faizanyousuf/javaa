public class PowerOfTwo{
    public static void main(String[] args){
          
        // if a number is a power of 2 or not 

          int[] arr = {1,2,4,8,9,32,-64};

          for(int i = 0; i < arr.length; i++){
            if((arr[i] & (arr[i]-1)) == 0){
                System.out.printf("Yes the number %d : is a power of 2\n",arr[i]);
            }else{
                System.out.printf("the number %d is not power of 2.\n",arr[i]);
            }

          }



          // count number of set bits (1's)

        //   int n = 7;
          int n = -7;
          int count = 0;
          for(int i = 0; i < 32; i++){
              if((n & 1) == 1){
                  count++;
              }
              n = n >> 1;
          }
          System.out.println(count);
    }
}