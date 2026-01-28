class statement{
    public static void main(String[] args){

        int n=6;

        switch(n){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;                                        //if we don't put break then the expected output will show and the further continued case will also executes
            case 7:
                System.out.println("sunday");
                break;                                 
            default:
                System.out.println("Enter valid number");
        }
    }
}
