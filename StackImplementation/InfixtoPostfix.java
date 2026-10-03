import java.util.Stack;
public class InfixtoPostfix {
    public static void main(String[] args) {
        // String infix = "a+b*(c-d^e)";
        String infix = "12-5*7/(13-8)";
        String postfix = "";

        // System.out.println(isCharacter('*'));

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < infix.length(); i++){
            char c = infix.charAt(i);
           if(isCharacter(c)){
             postfix = postfix + c;
           }else if(c == '('){
              st.push(c);
           }else if(c == ')'){
               while(st.peek() != '('){
                  postfix = postfix + st.pop();
               }
               st.pop();
           }else {
              while(!st.isEmpty() && getPriority(c) < getPriority(st.peek())){
                postfix += st.pop();
              }
              st.push(c);
           }
        }

        while(!st.isEmpty()){
            postfix = postfix + st.pop();
        }

        System.out.println(postfix);
    }

    static int getPriority(char c){
    
        if(c == '^'){
            return 3;
        }else if(c == '*' || c == '/'){
            return 2;
        }else if(c == '+' || c == '-'){
            return 1;
        }else{
            return 0;
        }
}

static boolean isOperator(char c){
    if(c == '*' || c == '+' || c == '/' || c == '^' || c == '-'){
        return true;
    }else{
        return false;
    }
}

static boolean isCharacter(char c){
    if((c >= 48 && c <= 57 ) || (c >= 65 && c <= 90) || (c >= 97 && c <= 122)){
        return true;
    }else {
        return false;
    }
}
}


