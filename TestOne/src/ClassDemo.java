/**
 * Created by likaili on 2017/1/9.
 */
public class ClassDemo {
    public static void main(String[] args){
        class person {
            int age;
            String name;

            void hello() {
                System.out.println(name + " is " + age + " years old .");
            }
        }

        person one = new person();
        one.age = 12;
        one.name = "Lily";
        one.hello();

    }
}
