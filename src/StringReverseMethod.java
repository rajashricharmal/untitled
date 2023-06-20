public class StringReverseMethod {
    public static void main(String[] args) {
        String str="yash";
        char[] array=str.toCharArray();
        for (int left=0,right=array.length-1;left<right;left++,right--){
            char temp=array[left];
            array[left]=array[right];
            array[right]=temp;
        }
        for (int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
