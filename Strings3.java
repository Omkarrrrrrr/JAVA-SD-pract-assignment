// Ways to compare Strings
// - == operator
// - equals()


public class Strings3{
    public static void main(String[]args){
        
        // String s1 = "Pwskills";
        // String s2 = new String("Pwskills");
        // String s3 = "PwSKILLS";
        // System.out.println(s1 == s2);  // false , cuz checking references
        // System.out.println(s1.equals(s2)); // true , cuz checking values
        // System.out.println(s1==s3);
        // System.out.println(s1.equals(s3));
        

        String s1 = "pwskills";
        String s2 = new String("PWskills");
        String s3 = new String("pwskills");

        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        
    }
}