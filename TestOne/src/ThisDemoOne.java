/**
 * Created by likaili on 2017/1/22.
 */
public class ThisDemoOne {
    int x = 5;
    int y = 7;

    public void  sum(){
        int z = this.x + this.y;
        System.out.println("x + y = " + z);
    }

    public static void main(String[] args){
        ThisDemoOne demo1 = new ThisDemoOne();
        demo1.sum();
    }
}
