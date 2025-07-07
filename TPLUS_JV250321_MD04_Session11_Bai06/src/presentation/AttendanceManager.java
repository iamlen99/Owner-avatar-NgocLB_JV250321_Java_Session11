package presentation;

import entity.Manage;
import entity.Student;

import java.util.ArrayList;
import java.util.List;

public class AttendanceManager implements Manage<Student> {
    private final List<Student> studentList = new ArrayList<>();

    @Override
    public void add(Student student) {
        studentList.add(student);
        System.out.println("Sinh vien da duoc them thanh cong.");
    }

    @Override
    public void update(int index, Student student) {
        studentList.set(index, student);
        System.out.println("Sinh vien da duoc sua thanh cong.");
    }

    @Override
    public void delete(int index) {
        studentList.remove(index);
        System.out.println("Da xoa thanh cong sinh vien");
    }

    @Override
    public void display() {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(i+1 + ". " + studentList.get(i));
        }
    }

    public int findIndexById(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
