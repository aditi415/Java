public class arrays
{
    public static void main(String[] args)
    {
        int nums[]={1,2,3,4,5,6};
        //int nums1[] = new int[7];

        for(int i=0;i<6;i++)
        {
            System.out.println(nums[i]);
        }
        
        //multidimensional array
        int nums1[][] = new int[3][4];
        
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                nums1[i][j] = (int)(Math.random()*10);    //random will give float values & multiplying by 100 give integers
                System.out.println(nums1[i][j]);
            }
        }


        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(nums1[i][j] + " ");
            }
            System.out.println();
        }

        for(int n[] :nums1){
            for (int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

        //array of objects
       

        Student s1 = new Student();
        s1.rollno=1;
        s1.name="Avi";
        s1.marks=233;

        Student s2 = new Student();
        s2.rollno=7;
        s2.name="cvi";
        s2.marks=833;
    
        Student s3 = new Student();
        s3.rollno=9;
        s3.name="bvi";
        s3.marks=333;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        
        for(int i=0;i<students.length;i++){
            System.out.println(s1.name + ":"+s1.marks);
        }
        for(Student stud :students){
            System.out.println(stud.name + ":" + stud.rollno );
        }
    }
} 