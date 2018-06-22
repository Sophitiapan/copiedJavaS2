package java_season2_Copy.java_season2; /**
 * Information
 * Author: ZhangLifan
 * Time: 2018/5/22 18:24
 * Description: 8-1
 */
import java.util.Arrays;

public class Prac {


        //完成 main 方法
        public static void main(String[] args) {

            int[] scores = {89,-23,64,91,119,52,73};
            Prac hello = new Prac();

            System.out.println("考试成绩的前三名为: ");
            hello.getRank(scores);

        }

        //定义方法完成成绩排序并输出前三名的功能
        public void getRank(int[] scores){
            Arrays.sort(scores);
            int count = 0;
            for(int i = scores.length-1; i>=0; i--){
                if(scores[i] < 0 || scores[i] > 100){
                    continue;
                }
                count++;
                if(count>3){
                    break;
                }
                System.out.println(scores[i]);
            }

            }
}
