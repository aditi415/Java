class Calculator
{
    public int add()
    {
        System.out.println("Add");
        return 0;
    }
    
}

public class clsobj
{
    public static void main(String[] args)
    {
            int num1=667;
            int num2=56;

                //creates object
            Calculator calc=new Calculator();         //classname reference-variale-name= new-keyword   what-variable-to-initialize
            int result= calc.add(num1,num2);

            System.out.println(result);
    }
}
