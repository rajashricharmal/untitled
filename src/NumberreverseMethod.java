public class NumberreverseMethod {
    public static void main(String[] args) {
        int [] a={1,2,3};
        for (int left=0,right= a.length-1;left<right;left++,right--){
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
        }
        for (int i=0;i< a.length;i++){
            System.out.println(a[i]);
        }
    }
}
