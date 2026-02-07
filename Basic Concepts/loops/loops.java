public class loops {
    public static void main(String[] args){
        //while
        int i=1;
        while (i<=4)
        {
            System.out.println("Hi" + i );
            i++;

            int j=1;
            while(j<=3){
                System.out.println("Hello");

                j++;
            }
        }
        System.out.println("Bye" + i);

        //do while

       // int i =5;
        do{
            System.out.println("Hi" + i);
            i++;

        }while(i<=4);
 
        //for loop
        for(int k=1;k<=7;k++)
         {
            System.out.println("DAY" +  k);

            for(int l=1;l<=9;l++)
            {
                System.out.println(" " +(l+8)+ "-" +(l+9));
            }
         }

         //enhanced for loop i.e for each loop

         int nums[]={1,2,3,44,23};
         for(int n:nums)
         {
            System.out.println(n);
         }
    }
    
}
