public class Strings6{
    public static void main(String[]args)
    {
        String str = "PW Skills Java";
        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());   // space also gets included
        System.out.println(str.charAt(1));  // according to index
        //int length = str.length();
        System.out.println(str.substring(3,8));
        System.out.println(str.indexOf("s"));
        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));
    }
}