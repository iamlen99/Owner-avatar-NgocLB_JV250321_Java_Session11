import entity.Student;
import presentation.AttendanceManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AttendanceManager manager = new AttendanceManager();
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("""
                    ***********************MENU QUAN LY DIEM DANH************************
                    1. Them sinh vien
                    2. Sua sinh vien
                    3. Xoa sinh vien
                    4. Hien thi danh sach sinh vien
                    5. Thoat
                    Lua chon cua ban:""");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    student.inputData(scanner);
                    manager.add(student);
                    break;

                case 2:
                    manager.display();
                    System.out.println("Nhap id sinh vien can sua:");
                    int updateId = Integer.parseInt(scanner.nextLine());
                    int updateIndex = manager.findIndexById(updateId);
                    if (updateIndex == -1) {
                        System.out.println("Id khong ton tai");
                    } else {
                        String newName = student.inputStudentName(scanner, "Nhap ten moi cua sinh vien:");
                        manager.update(updateIndex, new Student(updateId, newName));
                    }
                    break;

                case 3:
                    manager.display();
                    System.out.println("Nhap id sinh vien can xoa:");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    int deleteIndex = manager.findIndexById(deleteId);
                    if (deleteIndex == -1) {
                        System.out.println("Id khong ton tai");
                    } else {
                        manager.delete(deleteIndex);
                    }
                    break;

                case 4:
                    manager.display();
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Vui long chon tu 1-5");
            }
        } while (true);
    }
}
