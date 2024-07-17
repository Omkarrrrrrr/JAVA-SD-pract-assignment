import javax.lang.model.util.ElementScanner6;

public class Array1DPractice {
    public static void main(String[] args) {

        // // Palindrom array
        // int arr[] = {2,3,5,3,2};
        // int n = arr.length;

        // int flag = 0;

        // for(int i=0;i<arr.length/2; i++)
        // {
        // if(arr[i] != arr[n-i-1])
        // {
        // flag = 1;
        // System.out.println("Not a palindromic array");
        // }

        // }

        // if(flag == 0){
        // System.out.println("Its a palindromic array");

        // }

        // Reversal of array

        // int arr1[] = {4,8,12,16,20,24};
        // int n = arr1.length;

        // for(int i = 0; i<arr1.length/2 ; i++){

        // // Swapping
        // int temp = arr1[i];
        // arr1[i] = arr1[n-i-1];
        // arr1[n-i-1] = temp;

        // }

        // System.out.println("The reversed array is : ");

        // for(int i=0;i<arr1.length; i++)
        // {
        // System.out.print(arr1[i]); //Prints each element without mooving to new line
        // System.out.print(" ");
        // }

        // Missing No in array

        // int arr2[] = {1,4,3,5,6,8,9,2};
        // int n = arr2.length;

        // int sum_of_natural_numbers = (n+1)*(n+2)/2;
        // int sum = 0;

        // for(int i=0;i<n;i++)
        // {
        // sum = sum+= arr2[i];
        // }

        // int missing_elem = 0;
        // missing_elem = sum_of_natural_numbers -sum;

        // System.out.println("The Missing element is : " + missing_elem);

        // Duplicate no in array

        int arr3[] = { 4, 5, 6, 6, 7, 8, 8 };
        int n = arr3.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr3[i] == arr3[j]) /// here == is necessaryy otherwise it shows error related type converting...we
                                        /// are comparing here
                {
                    System.out.println("The duplicate elements  are : " + arr3[i]);
                }
            }
        }

    }

}
