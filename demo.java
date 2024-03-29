class calc
{
//    public int add(int n1,int n2){
//     int result = n1 + n2;
//     return result;
//    }

//     public int add(int n1,int n2, int n3){
//     int result = n1+n2+n3;
//     return result;
//    }

//    public double add(double n1, double n2){
//     double result = n1+n2;
//     return result;
//    }

        // public void show(byte n){
        //     System.out.println("byte" + n);
        // }

        public void show(short n){
            System.out.println("short" + n);
        }

        public void show(char n){
            System.out.println("char" + n);
        }

        public void show(int n){
            System.out.println("int" + n);
        }

        public void show(double n){
            System.out.println("double" + n);
        }

        

}


public class demo{

    public static void main(String[] args) {

        calc obj = new calc();

        // int result = obj.add(3,4);      // 2 methods are of same name but representing
        // int res1 = obj.add(4,3,2);      // different values - overloading concept   
        // double res2 = obj.add(4.5,2.1);
        // System.out.println(result);
        // System.out.println(res1);
        // System.out.println(res2);       
        byte b = 2;     // here promotion has done thats why it is giving short 2
        obj.show(b);                                                                                                                                                                      
        

    }
}