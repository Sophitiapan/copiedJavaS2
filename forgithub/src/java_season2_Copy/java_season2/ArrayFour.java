package java_season2_Copy.java_season2;

/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/5/10 17:08
 * Description: 6-6
 */
public class ArrayFour {
    public static void main(String[] args){
        int[] nums = new int[] {61,23,4,74,13,148,20};

        int max = nums[0];
        int min = nums[0];
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < nums.length;i++){
            if (nums[i] > max){
                max = nums[i];
            }else if(nums[i] < min){
                min = nums [i];
            }sum = sum + nums[i];
        }
        avg = sum / 7 ;

        System.out.println("数组中的最大值: "+max);
        System.out.println("数组中的最小值: "+min);
        System.out.println("数组中的平均值: "+avg);
    }
}
