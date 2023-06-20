public class PerfectNumber {
    public static void main(String[] args) {
        int num=90;
        int SumOfFactor=0;
        for (int i=1;i<=num/2;i++){
            if (num%i==0){
                SumOfFactor +=i;
            }
        }
        System.out.println(SumOfFactor==num?num+"it is perfect number":num+"it is a not a perfect number");
    }
}
