public class Strings4{
    public static void main(String[]args){

        String s1 = "pwskills";
        String s2 = new String("PWskills");
        String s3 = new String("pwskills");

        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3)); 
        
        

      
        
    }
}