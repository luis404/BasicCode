import java.util.LinkedList;

/**
 * Created by LX on 3/6/15.
 */
public class ValidParenthese {
    public boolean isValid(String s) {
        int len = s.length();
        if(len%2 == 1) return false;

        LinkedList<Character> stack = new LinkedList<Character>();

        for(int i = 0; i < s.length(); i++){
	        Character x = s.charAt(i);
            if(stack.size() == 0){
                //System.out.println("insert "+x.charValue());
                stack.addFirst(x);
                continue;
            }

            if(lxpair(x.charValue(), stack.getFirst())){
                //System.out.println("peek ");
                stack.pop();
            } else {
               // System.out.println("insert "+x.charValue());
                stack.addFirst(x);
            }
        }

        if(stack.size() > 0) return false;

        return true;
    }

    private boolean lxpair(char a, char b){
        //System.out.println("a,b"+a+"/"+b);
        return ((a=='(' && b==')')
                || (a=='[' && b==']')
                || (a==')' && b=='(')
                || (a==']' && b=='[')
                || (a=='}' && b=='{')
                || (a=='{' && b=='}'));
    }

    public static void main(String args[]){
        ValidParenthese test = new ValidParenthese();
        System.out.println(test.isValid("()[]]{}{}{}{}"));
    }
}
