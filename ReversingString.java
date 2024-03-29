public class ReversingString
{
 public static void main(String[]args)
 {
   // case 1-
    // String str1 = "pwjava";
    // String str2 = " ";

    // for(int i=str1.length()-1; i>= 0; i--){
    //     str2 = str2+str1.charAt(i);
       
    // }
    //  System.out.println("Before Reversing: " + str1);
    //  System.out.println("After Reversing: " + str2);



     // case 2
    // String str1 = "pwskills java";
    // String str2 = " ";
    // String sarr[] = str1.split(" ");
    // for(int i=sarr.length-1; i>= 0; i--){
    //     str2 = str2+sarr[i]+" ";
       
    // }
    //  System.out.println("Before Reversing: " + str1);
    //  System.out.println("After Reversing: " + str2);

   // case 3-1)
    String str1 = "pwskill java";
    String str2 = " ";
    
    for(int i=str1.length()-1; i>= 0; i--){
        str2 = str2+str1.charAt(i);
       
    }
     System.out.println("Before Reversing: " + str1);
     System.out.println("After Reversing: " + str2);

     // case3-2)
    String str3 = "pwskills java";
    String str4 = " ";

    String arr[]= str3.split(" ");

    for (String element:arr)
    {
       for(int i=element.length()-1; i>= 0; i--)
       {
        str4 = str4+element.charAt(i);
       
       }
       str4=str4+" ";
    }
    
   
     System.out.println("Before Reversing: " + str3);
     System.out.println("After Reversing: " + str4);
 }
}