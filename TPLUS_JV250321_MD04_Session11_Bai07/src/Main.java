import entity.Invoice;
import manage.InvoiceManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InvoiceManager invoiceManager = new InvoiceManager();
        Invoice invoice = new Invoice();

        do {
            System.out.println("*********************** MENU QUAN LY HOA DON *********************");
            System.out.println("1. Them hoa don");
            System.out.println("2. Sua hoa don");
            System.out.println("3. Xoa hoa don");
            System.out.println("4. Hien thi danh sach hoa don");
            System.out.println("5. Thoat");
            System.out.print("Lua chon cua ban: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Invoice newInvoice = new Invoice();
                    newInvoice.inputData(scanner);
                    invoiceManager.add(newInvoice);
                    break;

                case 2:
                    invoiceManager.display();
                    System.out.println("Nhap id hoa don can sua:");
                    int updateId = Integer.parseInt(scanner.nextLine());
                    int updateIndex = invoiceManager.findIndexById(updateId);
                    if (updateIndex != -1) {
                        String newInvoiceId = invoice.inputInvoiceId(scanner, "Nhap ma hoa don moi:");
                        float newPrice = invoice.inputPrice(scanner, "Nhap so tien moi:");
                        invoiceManager.update(updateIndex, new Invoice(updateId, newInvoiceId, newPrice));
                    } else {
                        System.out.println("Khong tim thay hoa don nao co id = " + updateId);
                    }
                    break;

                case 3:
                    invoiceManager.display();
                    System.out.println("Nhap id hoa don can xoa:");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    int deleteIndex = invoiceManager.findIndexById(deleteId);
                    if (deleteIndex != -1) {
                        invoiceManager.delete(deleteIndex);
                    } else {
                        System.out.println("Khong tim thay hoa don nao co id = " + deleteId);
                    }
                    break;

                case 4:
                    invoiceManager.display();
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
