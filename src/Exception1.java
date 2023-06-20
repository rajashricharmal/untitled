
public class Exception1 {
    public static int m1(){
        try {
            return 3;
        }
        catch (ArithmeticException e){
            return  2;
        }
        finally
        {
            return  1;
        }
    }
    public static void main(String[] args) {
        System.out.println(m1());

    }

}
