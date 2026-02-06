class Calculator
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
     
    //method overloading-same methods with different name or parameter
    public double add(double n3,int n5)
    {
        return n3+n5;
    }

    public double add(int a1,double a3)
    {
        return a1+a3;
    }
}

public class mone {
    public static void main(String[] args)
    {
        Calculator obj=new Calculator();
        int r1=obj.add(23,44);

        double r2=obj.add(23.45,2);
        double r3=obj.add(98,887.998);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
    
}
