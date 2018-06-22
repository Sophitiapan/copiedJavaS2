package java_season2_Copy.java_season2; /**
 * Information
 * Author: ZhangLifan
 * Time: 2018/5/18 11:55
 * Description: 7-6
 */
import java.util.Arrays;

public class WithPnR {
    public static void main(String[] args ){
        WithPnR hello = new WithPnR();
        int[] scores ={79,52,98,81};
        int count =hello.sort(scores);
        System.out.println("共有"+count+"个成绩信息!");
    }

    public int sort(int[] scores){
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        return scores.length;
    }
}
