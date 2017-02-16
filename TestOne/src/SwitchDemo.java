/**
 * Created by likaili on 2017/2/15.
 * java支持两种分支语句if 和switch if参照 IfExample和IfElse两个demo
 */
public class SwitchDemo {
    public static void main(String[] args){
        int month = 4;

        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            default:
                    System.out.println("I don't know");
           }
           System.out.println("the month is " + month);

    }
}
