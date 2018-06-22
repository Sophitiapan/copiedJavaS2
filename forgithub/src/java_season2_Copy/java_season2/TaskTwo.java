package java_season2_Copy.java_season2;

import java.util.Scanner;

/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/5/9 17:10
 * Description: task 2
 */
public class TaskTwo {
    public static void main(String[] args){
        int classNum = 3;
        int stuNum = 4;
        double sum = 0;
        double avg = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= classNum; i++){
            sum = 0;
            System.out.println("***请输入第"+i+"个班的成绩***");
            for (int j = 1; j <= stuNum; j++){
                System.out.println("***请输入第"+j+"个学生的成绩***");
                int score = input.nextInt();
                sum = sum + score;
            }
            avg = sum / stuNum;
            System.out.println("***第"+i+"个班学生的平均分为***"+avg);
        }
    }
}
