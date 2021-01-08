
public class MethodOverload {
     static void display(int a)
    {
        System.out.println("Argument a is integer:"+a);
    }

    public static void display(String b)
    {
        System.out.println("Argument b is String:"+b);
    }

    public static void main(String[] args) {


        display(1);
        display("hi...");

    }
}