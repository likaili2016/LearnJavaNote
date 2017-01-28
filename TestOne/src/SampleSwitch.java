/**
 * Created by likaili on 2017/1/28.
 */
public class SampleSwitch {
    public static void main(String[] args){
        for(int i=0; i<6; i++) //给出i的值为 0,1,2,3,4,5,6 或者 可以直接给i赋一个值 int i = 3；
            switch (i){
                case 0:
                    System.out.println("i is zero .");
                    break;
                case 1:
                    System.out.println("i is one . ");
                    break;
                case 2:
                    System.out.println("i is two . ");
                    break;
                case 3:
                    System.out.println("i is three . ");
                    break;
                case 4:
                    System.out.println("i is four . ");
                    break;
                default:
                    System.out.println("i is greater than 4 . ");
            }
    }
}
