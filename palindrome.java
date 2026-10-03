public class palindrome{
    public static void main(String[] args) {
        
        String s = "madam";
      String sub=   s.substring(1);
               System.out.println(sub);
        System.out.println(ispalindrome("maam"));
    }
     static boolean ispalindrome (String s){
        String st = s;
        String rvst = "";
        for(int i = s.length() -1;i>=0;i--){
            rvst =  rvst + s.charAt(i);
        }
        return st.equals(rvst);
    }
}