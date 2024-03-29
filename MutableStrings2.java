public class MutableStrings2{
    public static void main(String[]args){
        // StringBuilder sb = new StringBuilder();
        // System.out.println(sb.capacity());
        // sb.append("abcdefghijklmnop");
        // System.out.println(sb.capacity());
        // sb.append("s");
        // System.out.println(sb.capacity());
        // System.out.println(sb.length());

        // StringBuffer sb2 = new StringBuffer("Sachin");
        // System.out.println(sb2);
        // System.out.println(sb2.capacity());
        // System.out.println(sb2.charAt(1));
        // sb2.setCharAt(1,'A');  // SAchin
        // System.out.println(sb2);

        // StringBuilder sb = new StringBuilder(150);
        // System.out.println(sb.capacity());
        // sb.append("java");
        // System.out.println(sb);
        // sb.trimToSize();
        // System.out.println(sb.capacity());

        StringBuilder sb1 = new StringBuilder("123");

        String s1 = "123";

        
        sb1.append("abc"); 
        s1 = s1.concat("abc");


        System.out.println(sb1 + " " + s1);




    }
}