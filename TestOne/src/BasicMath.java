/**
 * Created by likaili on 2017/1/23.
 */
public class BasicMath {
    public static void main(String[] args){
        int a = 1 + 1 ;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        System.out.println("Integer Arithmetic");
        System.out.println("a = " + a);
        System.out.println("b = " + b + "\nc = " + c + "\nd = " + d + "\ne = " + e); // \n表示换行

        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - a;
        double de = -dd;
        System.out.println("\nFloating Point Arithmeitc");
        System.out.println("da = " + da);
        System.out.println("db = " + db);
        System.out.println("dc = " + dc);
        System.out.println("dd = " + dd);
        System.out.println("de = " + de);

        //求模运算
        int x = 42;
        double y = 42.25;
        System.out.println("\nx mod 10 = " + x % 10);
        System.out.println("y mod 10 = " + y % 10);

    }
}
