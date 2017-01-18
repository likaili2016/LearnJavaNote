/**
 * Created by likaili on 2017/1/18.
 */


    public class ClassDemo2{
        String name;
        int age;

    ClassDemo2(String name1,int age1){
            name = name1;
            age = age1;
            System.out.println("感谢主人领养了我");
        }

        void bark(){
            System.out.println("汪汪，不要过来");
        }

        void hungry(){
            System.out.println("主人，我饿了");
        }
    public static void main(String[] args){
        ClassDemo2 dog1 = new ClassDemo2("huahua", 3);
        dog1.bark();
        dog1.hungry();

        }
    }

