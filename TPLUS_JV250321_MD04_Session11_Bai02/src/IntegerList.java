import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntegerList {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);
        integerList.add(10);

        System.out.print("Danh sach truoc khi xoa: " + integerList);
        System.out.println();

        Iterator<Integer> iterator = integerList.iterator();

        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            if (integer % 3 == 0) {
                iterator.remove();
            }
        }
        System.out.print("Danh sach sau khi xoa: " + integerList);
        System.out.println();
    }
}
