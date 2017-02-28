import java.util.*;

public class balancedParens {
    
    public static void main(String[] args){
        String[] testStrings = new String[]{"[]","[]]","{","{[]}()","(())","[()]","{[}","foo(bar)","foo(bar[i)"};
        for( int i = 0; i < testStrings.length; i++){
            System.out.println("String: " + testStrings[i]);
            System.out.println("Result: " + isBalanced(testStrings[i]));
        }
    }
    
    public static String isBalanced(String str){
        LinkedList<Character> parenStack = new LinkedList<Character>();
        for(int i = 0; i < str.length(); i++){
            char currentParen = str.charAt(i);
            //System.out.println(currentParen);
            char topOfStack;
            if(currentParen == '[' || currentParen == '(' || currentParen == '{'){
                parenStack.addFirst(currentParen);
            }
            //System.out.println(currentParen);
            else if(currentParen == ']' || currentParen == ')' || currentParen == '}'){
                if(parenStack.isEmpty()){
                    return Integer.toString(i);
                }
                else{
                    topOfStack = parenStack.pop();    
                }
                
                if(currentParen == ']' && topOfStack != '[') {
                    return Integer.toString(i);
                }
                else if(currentParen == ')' && topOfStack != '('){
                    return Integer.toString(i);
                }
                else if(currentParen == '}' && topOfStack != '{'){
                    return Integer.toString(i);
                }
            }
        }
        //System.out.println(Arrays.toString(parenStack.toArray()));
        if( !parenStack.isEmpty()){
            return Integer.toString(str.length());
        }
        return "SUCCESS";
    }
}

