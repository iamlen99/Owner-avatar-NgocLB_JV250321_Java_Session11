package entity;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Order {
    private String orderId;
    private String userName;

    public Order(String orderId, String userName) {
        this.orderId = orderId;
        this.userName = userName;
    }

    public Order() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void inputData(Scanner scanner) {
        this.orderId = inputOrderId(scanner, "Nhap ma don hang:");
        this.userName = inputUserName(scanner, "Nhap ten khach hang:");
    }

    public String inputOrderId(Scanner scanner, String message) {
        System.out.println(message);
        String orderIdRegex = "OD\\d{4}";

        do {
            String orderId = scanner.nextLine();
            if (isNotEmpty(orderId)) {
                if (Pattern.matches(orderIdRegex, orderId)) {
                    return orderId;
                } else {
                    System.out.println("Ma don hang phai bat dau bang OD, 4 ki tu sau la so, vui long nhap lai:");
                }
            } else {
                System.out.println("Vui long khong de trong !");
            }

        } while (true);
    }

    public String inputUserName(Scanner scanner, String message) {
        System.out.println(message);

        do {
            String userName = scanner.nextLine();
            if (isNotEmpty(userName)) {
                return userName;
            }
            System.out.println("Vui long khong de trong !");
        } while (true);
    }

    public boolean isNotEmpty(String data) {
        return data != null && !data.trim().isEmpty();
    }

    @Override
    public String toString() {
        return String.format("Ma don hang: %s, Ten khach hang: %s", orderId, userName);
    }
}
