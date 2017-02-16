/**
 * Created by likaili on 2017/2/15.
 * break 与continue的区别：break 主要用在循环语句或者 switch 语句中，用来跳出整个语句块。
 * break 跳出最里层的循环，并且继续执行该循环下面的语句。continue 适用于任何循环控制结构中。作用是让程序立刻跳转到下一次循环的迭代。
 * 在 for 循环中，continue 语句使程序立即跳转到更新语句。在 while 或者 do…while 循环中，程序立即跳转到布尔表达式的判断语句。
 */
public class BreakAndContinue {
    public static void main(String[] args){
        int [] number1 = {10, 20, 30, 40, 50};
        for(int i :number1){
            if (i == 30)
                break;
            System.out.println("i = " + i);

        }


        int [] number2 = {10, 20, 30, 40, 50};
        for(int j:number2){
            if (j == 30)
                continue;
            System.out.println("j = " + j);

        }
    }
}
