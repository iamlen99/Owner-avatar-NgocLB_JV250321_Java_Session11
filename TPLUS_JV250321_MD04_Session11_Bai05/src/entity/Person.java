package entity;

import java.util.Scanner;

public class Person {
    private String name;
    private String email;
    private String phone;

    public Person() {}
    public Person(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void display() {
        System.out.printf("Ten: %s, Email: %s, So dien thoai: %s\n", this.name, this.email, this.phone);
    }

    public void inputData (Scanner scanner) {
        this.name = inputPersonData(scanner, "Nhap ten nguoi dung:");
        this.email = inputPersonData(scanner, "Nhap email nguoi dung:");
        this.phone = inputPersonData(scanner, "Nhap so dien thoai nguoi dung:");
    }

    public String inputPersonData (Scanner scanner, String message) {
        System.out.println(message);
        do {
            String personData = scanner.nextLine();
            if (isNotEmpty(personData)) {
                return personData;
            }
            System.out.println("Vui long khong de trong");
        } while (true);
    }

    public boolean isNotEmpty(String data) {
        return data != null && !data.trim().isEmpty();
    }
}
