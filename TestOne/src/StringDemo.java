/**
 * Created by likaili on 2017/2/15.
 */
public class StringDemo {
    public static void main(String[] args){
        char [] HelloString = {'h', 'e', 'l', 'l','o'};
        String hello = new String(HelloString);
        System.out.println(hello);
        int length = hello.length();
        System.out.println("字符串hello的长度是： " + length);
    }
}
