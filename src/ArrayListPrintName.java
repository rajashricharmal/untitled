import java.util.ArrayList;
import java.util.List;

public class ArrayListPrintName {
    public static void main(String[] args) {
        List name= new ArrayList<>();
        name.add("yash");
        name.add("Harish");
        name.add("urmi");
        for (Object li:name){
            System.out.println(li);
        }
    }
}
