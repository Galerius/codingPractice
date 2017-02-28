import java.util.*;

public class balancedParens {
    
    public static void main(String[] args){
        String[] testStrings = new String[]{"[]","[]]"};
        for( int i = 0; i < testStrings.length; i++){
            System.out.println("Result: " + isBalanced(testStrings[i]));
        }
    }
    
    public static String isBalanced(String str){
        LinkedList<Character> parenStack = new LinkedList<Character>();
        for(int i = 0; i < str.length(); i++){
            char currentParen = str.charAt(i);
            if(currentParen == '[' || currentParen == '('){
                parenStack.addFirst(currentParen);
            }
            //System.out.println(currentParen);
            else if(currentParen == ']' || current == ')'){
                if(topOfStack.isEmpty()){
                    return Integer.toString(i);
                }
                char topOfStack = parenStack.pop();
                if(topOfStack != '[') {
                    return Integer.toString(i);
                }
            }
             else if(currentParen == ')'){
                 char topOfStack = parenStack.pop();
                if(topOfStack != '('){
                    return Integer.toString(i);
                } 
             }

        }
        return "SUCCESS";
    }
}

