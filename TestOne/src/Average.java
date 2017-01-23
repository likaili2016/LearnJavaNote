/**
 * Created by likaili on 2017/1/23.
 */
public class Average {
    public static void main(String[] args){
        double num[] = {10.6, 8.8, 12.5, 10, 15.76};
        double sum = 0;

        for(int i=0; i<5; i++){
            sum = sum +num[i];
        }
        System.out.println(" The average is " + sum / 5);

    }
}
