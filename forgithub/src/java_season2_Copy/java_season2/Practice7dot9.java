package java_season2_Copy.java_season2; /**
 * Information
 * Author: ZhangLifan
 * Time: 2018/5/18 16:03
 * Description: 7-9
 */
import java.util.Arrays;

public class Practice7dot9 {
    public static void main(String[] args){
        Practice7dot9 hello = new Practice7dot9();
        int[] nums = hello.makeNums(8);
        System.out.println(Arrays.toString(nums));
    }

    public int[] makeNums(int length){
        int[] nums = new int[length];
        for(int i=0; i < nums.length; i++){
            nums[i] =(int) (Math.random()*100);

        }
        return nums;
    }
}
