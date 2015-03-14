import java.util.LinkedList;

/**
 * Created by LX on 3/6/15.
 */
public class Sheet {
    public int isValid(String s) {
        int sum = 0;

        for(int i =0; i<s.length();i++){
            sum = sum*26+(s.charAt(i)-'A'+1);
        }
        return sum;
    }

    public static void main(String args[]){
        Sheet st = new Sheet();
        System.out.println(st.isValid(""));
    }
}
