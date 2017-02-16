/**
 * Created by likaili on 2017/1/7.
 * for 循环有两种一种是普通的
 * for(初始化; 布尔表达式; 更新) {
       //代码语句
     }
 * 第二种是增强版
 * for(声明语句 : 表达式)
     {
       //代码句子
     }
 */
public class ForExample {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 9; x = x + 1)
            System.out.println("This is x:" + x);


        int[] numbers = {10, 20, 30, 40, 50};
        for (int y : numbers) {
            System.out.print(y);
            System.out.print(",");
        }
        System.out.print("\n");
        String[] names = {"James", "Larry", "Tom", "Lacy"};
        for (String name : names) {
            System.out.print(name);
            System.out.print(",");
        }
    }
}