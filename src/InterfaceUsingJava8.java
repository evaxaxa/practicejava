
interface A
{
    static void show()
    {
        System.out.println("Inside A");
    }
}
interface B
{
    static void show()
    {
        System.out.println("Inside B");
    }
}



public class InterfaceUsingJava8 implements A ,B{


    public void show()
    {
        System.out.println("Inside Main");
    }

    public static void main(String args[])
    {
        InterfaceUsingJava8 obj= new InterfaceUsingJava8();
        obj.show();

        A.show();
        B.show();
    }
}
