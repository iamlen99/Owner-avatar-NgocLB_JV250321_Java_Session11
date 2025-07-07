package presentation;

import entity.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PersonManager {
    public static List<Person> personList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Them nguoi dung");
            System.out.println("2. Xoa nguoi dung");
            System.out.println("3. Hien thi danh sach nguoi dung");
            System.out.println("4. Thoat");
            System.out.print("Lua chon cua ban: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addPerson(scanner);
                    break;

                case 2:
                    deletePerson(scanner);
                    break;

                case 3:
                    displayListPersons();
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Vui long nhap gia tri tu 1-4");
            }
        } while (true);
    }

    public static void addPerson(Scanner scanner) {
        Person newPerson = new Person();
        newPerson.inputData(scanner);
        personList.add(newPerson);
    }

    public static void deletePerson(Scanner scanner) {
        System.out.println("Nhap email nguoi dung can xoa:");
        String inputEmail = scanner.nextLine();
        boolean isValidEmail = false;
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEmail().equals(inputEmail)) {
                isValidEmail = true;
                iterator.remove();
                break;
            }
        }

        if (isValidEmail) {
            System.out.println("Nguoi dung da duoc xoa thanh cong");
        } else {
            System.out.println("Email ban nhap khong ton tai");
        }
    }

    public static void displayListPersons() {
        for (Person person : personList) {
            person.display();
        }
    }
}
