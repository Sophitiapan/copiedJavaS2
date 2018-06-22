package java_season2_Copy.java_season2; /**
 * Information
 * Author: ZhangLifan
 * Time: 2018/5/22 15:54
 * Description: 7-9
 */
import java.util.Arrays;

public class RdmNumb {
    public static void main(String[] args){
        RdmNumb hello = new RdmNumb();
        int[] nums = hello.getArray(8);
        System.out.println(Arrays.toString(nums));
    }

    public int[] getArray(int length){
        int[] nums = new int[length];
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int) (Math.random()*100);
        }
    return nums;
    }

}
