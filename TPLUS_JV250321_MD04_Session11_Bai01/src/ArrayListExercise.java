import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args) {
        List<String> listStudentName = new ArrayList<>();
        listStudentName.add("Alex");
        listStudentName.add("Bob");
        listStudentName.add("Carl");
        listStudentName.add("Daniel");
        listStudentName.add("John");

        System.out.println("Danh sach sinh vien khi dung vong lap for:");
        for (int i = 0; i < listStudentName.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, listStudentName.get(i));
        }

        System.out.println("Danh sach sinh vien khi dung vong lap for-each");
        for (String studentName : listStudentName) {
            System.out.println(studentName);
        }

        System.out.println("Danh sach sinh vien khi dung Iterator:");
        Iterator<String> iterator = listStudentName.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
