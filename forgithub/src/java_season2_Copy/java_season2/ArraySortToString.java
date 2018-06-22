package java_season2_Copy.java_season2;/*import java.util.Arrays;*/
import java.util.Arrays;

/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/5/10 21:12
 * Description: 6-7
 */
public class ArraySortToString {
    /*public static void main(String[] args){
        int[] scores = {78,93,97,84,63};
        Arrays.sort(scores);
        System.out.println("排序后数组中元素的值: ");
        for(int i = 0; i < scores.length;i++){
            System.out.println(scores[i]);
        }
    }

    public static void main(String[] args){
        int[] nums = new int[]{25,7,126,53,14,86};
        System.out.println("输出数组nums中的元素: " + Arrays.toString(nums));
    }*/

    public static void main(String[] args){
        String[] hobbies = {"sports","game","movie"};
        Arrays.sort(hobbies);
        System.out.println(Arrays.toString(hobbies));
    }
}
