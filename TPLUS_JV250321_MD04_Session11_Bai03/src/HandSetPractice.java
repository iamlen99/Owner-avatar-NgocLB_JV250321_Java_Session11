import java.util.HashSet;
import java.util.Scanner;

public class HandSetPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> programmingLanguages = new HashSet<String>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("C++");
        programmingLanguages.add("JavaScript");

        System.out.println("Nhap ngon ngu lap trinh can tim:");
        String searchValue = scanner.nextLine();
        if (programmingLanguages.contains(searchValue)) {
            System.out.println("Chuoi ban nhap co ton tai");
        } else {
            System.out.println("Chuoi ban nhap khong ton tai");
        }
    }
}
