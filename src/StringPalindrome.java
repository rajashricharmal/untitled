public class StringPalindrome {
    public static void main(String[] args) {
        String mystring="yash";
        StringBuffer buffer=new StringBuffer(mystring);
        buffer.reverse();
        String data=buffer.toString();
        if (mystring.equals(data)){
            System.out.println("it is palindrome");
        }else{
            System.out.println("it is not a palindrome");
        }
    }
}
