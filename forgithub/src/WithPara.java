/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/6/22 14:30
 * Description:
 */
public class WithPara {

        public static void main(String[] args) {

            WithPara hello = new WithPara();
            String welcome = hello.show("爱慕课");
            System.out.println(welcome);
        }
        private String show(String name){
            return "欢迎您, "+name+"!";
        }
    }

