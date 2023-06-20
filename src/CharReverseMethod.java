public class CharReverseMethod {
    public static void main(String[] args) {
        char[] array={'r','a','j'};
        for (int left=0,right=array.length-1;left<right;left++,right--){
            char temp=array[left];
            array[left]=array[right];
            array[right]=temp;
        }
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
