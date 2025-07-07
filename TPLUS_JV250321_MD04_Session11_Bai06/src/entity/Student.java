package entity;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void inputData (Scanner scanner) {
        this.id = inputStudentId(scanner, "Nhap id sinh vien:");
        this.name = inputStudentName(scanner, "Nhap ten sinh vien:");
    }

    public int inputStudentId (Scanner scanner, String message) {
        System.out.println(message);
        return Integer.parseInt(scanner.nextLine());
    }

    public String inputStudentName (Scanner scanner, String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    @Override
    public String toString() {
        return String.format("Id: %d, Ten sinh vien: %s", this.id, this.name);
    }
}
