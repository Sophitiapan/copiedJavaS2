package java_season2_Copy.java_season2; /**
 * Information
 * Author: ZhangLifan
 * Time: 2018/5/10 22:36
 * Description: 6-8
 */
import java.util.Arrays;

public class ArrayForeach {
    public static void main(String[] args){
        int[] scores = {89,72,64,58,93};
        Arrays.sort(scores);
        for(int score: scores){
            System.out.println(score);
        }
    }
}

