public class Strings1{
    public static void main(String[]args){
        String brand = "Pwskills";
        System.out.println(brand);
        // brand.concat("Bengaluru");   // here any changes will not be made beacause string is immuatable
        // System.out.println(brand);

        StringBuilder brand1 = new StringBuilder("Pwskills");
        System.out.println(brand1);
        brand1.append("Bengaluru");   // here changes are visible
        System.out.println(brand1);
    }
}