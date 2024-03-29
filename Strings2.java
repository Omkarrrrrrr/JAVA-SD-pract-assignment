// immutable strings
// Heap and String constant pool concepts

public class Strings2{
    public static void main(String[]args){
        // String s1 = new String("Pw");
        // String s2 = new String("Pw");
        // System.out.println(s1==s2);    // will give false because there are 2 diff objects in heap outside SPC where duplicates are allowed.

        String s3 = "Pwskills";
        String s4 = "Pwskills";
        System.out.println(s3 == s4);  // will give true because in SCP duplicates are not allowed...so there is only 1 object referencing 2 strings.
    }
}