import Manager.OrderManager;
import entity.Order;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        OrderManager orderManager = new OrderManager();

        do {
            System.out.println("*************MENU QUAN LY DON HANG***************");
            System.out.println("1. Them don hang");
            System.out.println("2. Sua don hang");
            System.out.println("3. Xoa don hang");
            System.out.println("4. Hien thi danh sach don hang");
            System.out.println("5. Thoat");
            System.out.print("Lua chon cua ban: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Order newOrder = new Order();
                    newOrder.inputData(scanner);
                    orderManager.add(newOrder);
                    break;

                case 2:
                    orderManager.display();
                    System.out.println("Nhap ma don hang can sua:");
                    String orderIdInput = scanner.nextLine();
                    int updateIndex = orderManager.findIndexById(orderIdInput);
                    if (updateIndex != -1) {
                        String newUserName = order.inputUserName(scanner, "Nhap ten khach hang moi:");
                        orderManager.update(updateIndex, new Order(orderIdInput, newUserName));
                    } else {
                        System.out.println("Ma don hang khong ton tai!");
                    }
                    break;

                case 3:
                    orderManager.display();
                    System.out.println("Nhap ma don hang can xoa:");
                    String deleteOrderId = scanner.nextLine();
                    int deleteIndex = orderManager.findIndexById(deleteOrderId);
                    if (deleteIndex != -1) {
                        orderManager.delete(deleteIndex);
                    } else {
                        System.out.println("Ma don hang khong ton tai!");
                    }
                    break;

                case 4:
                    orderManager.display();
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
