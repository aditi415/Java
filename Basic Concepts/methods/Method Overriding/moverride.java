    //method overriding

class P
{
    public void show()
    {
        System.out.println("in P show");
    }
    public void config()
    {
        System.out.println("in P config");
    }
}

class Q extends P
{
    //method overriding
    public void show()
    {
        System.out.println("in Q show");
    }

}


public class moverride
{
    public static void main(String[] args)
    {
        Q obj = new Q();
        obj.show();
        obj.config();
    }
}