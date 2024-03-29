public class Arrays2{

    public static void main(String[] args) {

        // int nums[][] = new int[3][2];  // total aray size is 6

        // assigniing values
        // nums[0][0] = 5;
        // nums[0][1] = 6;
        // nums[1][0] = 7;       // this is done when ...values are known
        // nums[1][1] = 4;
        // nums[2][0] = 8;
        // nums[2][1] = 9;


        int nums[][] = {

                        {5,6},
                        {7,4},
                        {8,9}
                       };


         for(int i=0;i<=2;i++)    // for rows
         {
            for(int j=0;j<=1;j++)    // for cols
            {
                System.out.print(nums[i][j] +" ");   // for proper spacing
            }
            System.out.println();       // for new line after 1 row
         }
    }
}