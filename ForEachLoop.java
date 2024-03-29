public class ForEachLoop{
    public static void main(String[]args){
        // int nums[] = {5,4,7,8};

        // for (int n: nums){
        //     System.out.println(n);
        // }
        int nums[][] = {
                        {5,6,2,3},
                        {7,4,1,8},
                        {8,9,5,6}
                       };
    
    for (int a[]: nums)
    {
        for(int b: a)
        {
            System.out.print(b + " ");
        }
        System.out.println();
    }


              


    }
}