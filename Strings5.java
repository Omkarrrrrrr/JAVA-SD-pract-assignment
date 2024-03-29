public class Strings5{
    public static void main(String[]args){

        // Concatenation using concat method:

        // String s1 = new String("Pw");
        // s1.concat("skill");    // will not do any changes ....it will print original text only 
        // System.out.println(s1);  // because String is immutable
    
        // s1 = s1.concat("skill");     // now we are giving reference only...original string is still not changed
        // System.out.println(s1);

        // String s1 = "Pwjava";
        // String s2 = s1.concat("skill");
        // String s3 = new String("Pwjava");
        // s3= s3.concat("skill");
        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);
        
        
        // Concatenation using + sign:

        String s1 = "Pw";
        String s2 = "pw"+"java";
        String s3 = "pw"+"java"+"skill";
        String s4 = s1+s2;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        

      // note1: using concat() we can concat only 1 object with the string
      // but using + operator we can concat more objects with the string

      //note2: By using + operator we can add any number to the string 
      // ex .:
      String str = "pw" + 99 + 100;
      System.out.println(str);
      
        
    }
}