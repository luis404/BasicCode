import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by LX on 1/24/15.
 */
public class LargeNumber {
    int[] num = {3, 30, 34, 5, 9};

    public String largeNumber() {
        String result = "";
        LinkedList<String> numStrings = new LinkedList<String>();

        for (int i = 0; i < num.length; i++) {
            numStrings.add(String.valueOf(num[i]));
        }

        int sz = numStrings.size();
        while(sz>0){
            String found = null;
            for(String i:)
        }
        return result;
    }

    public static void main() {

    }
}
