/**
 * Created by likaili on 2017/1/9.
 */
public class TypeDemo {
    public static void main(String[] args){
        char webName1 = '微';
        char webName2 = '学';
        char webName3 = '苑';
        System.out.println("网站的名字是："+ webName1 + webName2 + webName3);

        short x = 22;
        int y = 022;
        long z = 0x22L; // long 类型 后面不加l也行
        System.out.println("转化成十进制：x = " +x+", y = " + y + ", z = " + z);

        float m = 22.45f; //float 类型后面不加f会报错
        double  n = 10;
        System.out.println("计算乘积： " + m + " * " + n + "=" + m*n);


    }
}
