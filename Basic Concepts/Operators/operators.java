class operators
{
    public static void main(String[] args) {
        int n1=56;
        int n2=45;
        int result0=n1+n2;
        int result1=n1-n2;
        int result2=n1*n2;
        int result3=n1/n2;
        System.out.println(result0);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);


        int num1=8;
        num1 +=6;        //adding 6 to num1
        num1 -=3;         //num1=num1-3
        num1 *=2;
        num1++;     //post increment 
        ++num1;      //pre increment
        num1--;      //decrement
        System.out.println(num1);

        int num2=3;
        int result = num2++;    //fetch the value and then increment
        int result4 = ++num2;    //increment and then fetch the value 
        
        System.out.println(result);
        System.out.println(result4);



     //realtional or assignment operator

            int c=6;
            int d=7;
            boolean result9= c>d;

            System.out.println(result9);


            //logical operators

            int x=7;
            int y=5;
            int a=5;
            int b=9;

            boolean result8= x> y && a > b;
            boolean result6 = x < y|| a<b||a>1;       //comparision operator
             
            System.out.println(result6);
            System.out.println(result8);

            boolean result7= a> b;
            System.out.println(!result7);

            //conditional statement 

            int n=4;
            if(n%2==0)
                System.out.println("number is even");
            else 
                System.out.println("number is odd");

            //ternary operator   condition ?(if) state : state

         int result10=0;

          result10 = n%2==0 ? even : odd ;
    }
}
