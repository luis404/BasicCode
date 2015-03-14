import java.util.Arrays;

/**
 * Created by LX on 3/7/15.
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int[] temp = new int[k];
        System.arraycopy(nums, nums.length - k, temp, 0, k);
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(nums));
        System.arraycopy(nums, 0, nums, k, nums.length - k );
        System.arraycopy(temp, 0, nums, 0, k);

        System.out.println(Arrays.toString(nums));

    }

    public static void main(String args[]){
        int[] x = {1, 2, 3, 4, 5, 6 ,7};
        RotateArray ra = new RotateArray();
        ra.rotate(x,1);
    }
}
