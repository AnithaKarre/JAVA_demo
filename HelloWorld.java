public class HelloWorld
{
    public static void main(String[] argv)
    {
        FirstClass fs=new FirstClass();
        fs.method();
    }
}
//defining a child class//
class FirstClass
{
    public void method()
    {
        System.out.println("Hello World ");
    }
}
