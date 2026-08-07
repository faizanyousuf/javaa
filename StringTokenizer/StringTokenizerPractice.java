import java.util.StringTokenizer;

// nextElement() return token as object rather than string;
//nextToken() return token
// third argument is boolean , whether to print demiter as token or not.

public class StringTokenizerPractice{
    public static void main(String[] args){
        String str = "hello ,this i,s new l,apt,op";
        StringTokenizer st = new StringTokenizer(str,"o",true);

        int tokens = st.countTokens();
        System.out.println(tokens);
           System.out.println(st.nextToken());
                   int tokens2 = st.countTokens();
          System.out.println(tokens2);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}