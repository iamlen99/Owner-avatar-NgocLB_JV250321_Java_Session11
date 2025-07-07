import java.util.HashSet;
import java.util.Set;

public class IntegerHashSet {
    public static void main(String[] args) {
        Set<Integer> intList = new HashSet<Integer>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);
        intList.add(50);

        System.out.println("Danh sach cac phan tu trong HashSet:");
        for (Integer integer : intList) {
            System.out.println(integer);
        }
    }
}
