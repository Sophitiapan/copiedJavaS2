package java_season2_Copy.java_season2;
/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/5/15 15:23
 * Description: 7-4
 */

import java.util.Arrays;

public class PracticeSeven {

    public static void main(String[] args) {

        PracticeSeven hello = new PracticeSeven();
        int maxScore = hello.getMaxAge();
        System.out.println("最大年龄为:" + maxScore);
    }
    public int getMaxAge(){
        int[] ages ={18,23,21,19,25,29,17};
        Arrays.sort(ages);
        int i = ages.length;
        return ages[i-1];
        }


}



/*public class PracticeSeven {
    public static void main(String[] args){
        PracticeSeven hello = new PracticeSeven();
        int maxScore = hello.getMaxAge();
        System.out.println("最大年龄为:"+ maxScore );
    }

    public int getMaxAge(){
        int[] ages = {18,23,21,19,25,29,17};
        int maxScore = 18;
        for(int i = 0; i < ages.length; i++){
            if(ages[i] > maxScore){
                maxScore = ages[i];
            }
        }
        return maxScore;
    }
}*/