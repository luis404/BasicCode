import java.util.HashMap;
import java.util.Map;

/**
 * Created by LX on 3/6/15.
 */
public class MajorityElem {
    public int isValid(int[] num) {
        if(num.length == 1) return num[0];
        HashMap<Integer,Integer> maps = new HashMap<Integer, Integer>() ;
        for(int i=0;i<num.length;i++){
            Integer n = maps.get(num[i]);
            if(n == null){
                System.out.println("here");
                maps.put(num[i],1);
            } else {
                System.out.println("x");
                maps.put(num[i],n+1);
                if(n+1 >= num.length/2) return num[i];
            };
        }
        return 0;
    }

    public static void main(String args[]){
        MajorityElem me = new MajorityElem();
        int[] n = {2,2};
        me.isValid(n);
    }
}
