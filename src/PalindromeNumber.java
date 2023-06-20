public class PalindromeNumber {
    public static void main(String[] args) {
        int num=908;
        int temp=num;
        int sum=0;
        while (num>0){
            int a=num%10;
            sum=(sum*10)+a;
            num=num/10;
        }
        System.out.println(temp==sum?"it is paindrome number":"it is not a palindrome");
    }
}
