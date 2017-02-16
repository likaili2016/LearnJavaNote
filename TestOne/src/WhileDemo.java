/**
 * Created by likaili on 2017/2/15.
 * 本段代码 包括 while，do-while 两个循环的demo 主要介绍二者的区别
 */
public class WhileDemo {
    public static void main(String[] args){
        int a = 5;
        while(a<=6){
            System.out.println("a= " + a );
            a++;
        }

        int b = 5;
        do {
            System.out.println("b= " + b );
            b++;
        } while (b<5); //b的初始值为5 虽然不满足while条件 但是会先执行do语句，所以还是会执行一次。
    }
}
