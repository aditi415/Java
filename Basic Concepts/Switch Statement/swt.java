public class swt{
    public static void main(String[] args) {
        String day = "Monday";
        switch (day)  
        {
            //switch can be expression 
             case "staurday" , "sunday":
                System.out.println("6am");
                break;
            case "Monday":
                System.out.println("7am");
                break;    
            default:
                System.out.println("7am");   


                //in this switch we don't need to use break just put -> instead of : if we want : instead of sout put yeild
            
            case "tuesday" , "wednesday" -> System.out.println("6am");
            case "thursday" -> System.out.println("7am");
            default -> System.out.println("7am");        

        }
    }
}
