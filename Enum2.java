enum Result{
    PASS,FAIL,NR;
    //public static final Result PASS=new Result();

    //public static final Result FAIL=new Result();          //Thats why constructr is invoking by 3 times

    //public static final Result NR=new Result();

    int marks;
    Result()
    {
        System.out.println("Constructor  in enum");
    }

    void setMarks(int marks){
        this.marks = marks;
    }
    int getMarks(){
        return marks;
    }
}
public class Enum2 {
    public static void main(String[] args) {

        Result.PASS.setMarks(50);
        int m1 = Result.PASS.getMarks();
        System.out.println(m1);

        int m2=Result.FAIL.getMarks();  //m2 variable prints 0 because the marks field for the FAIL instance was never explicitly set, so it retains its default value of 0
        System.out.println(m2);//0


        Result.NR.setMarks(45);
        int m3=Result.NR.getMarks();
        System.out.println(m3);//


        
    }
    
}
