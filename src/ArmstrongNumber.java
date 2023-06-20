public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=80;
        int oldNumber=num;
        int sum=0;
        while (num>0){
            int digit=num%10;
            num=num/10;
            sum=sum+(digit*digit*digit);
        }
        System.out.println(oldNumber==sum?"it is armstrong number":"it is not a armstrong number");
    }
}
