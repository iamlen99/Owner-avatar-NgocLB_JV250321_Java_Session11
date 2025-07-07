package entity;

import manage.InvoiceManager;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Invoice {
    private int id;
    private String invoiceId;
    private float price;

   public Invoice(int id, String invoiceId, float price) {
       this.id = id;
        this.invoiceId = invoiceId;
        this.price = price;
   }

    public Invoice() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void inputData (Scanner scanner) {
        this.id = inputId();
        this.invoiceId = inputInvoiceId(scanner, "Nhap ma hoa don:");
        this.price = inputPrice(scanner, "Nhap so tien:");
    }

    public int inputId() {
        int maxId = 0;
        for (int i = 0; i < InvoiceManager.listInvoices.size(); i++){
            if (InvoiceManager.listInvoices.get(i).getId() > maxId){
                maxId = InvoiceManager.listInvoices.get(i).getId();
            }
        }
        return maxId + 1;
    }

    public String inputInvoiceId (Scanner scanner, String message) {
        System.out.println(message);
        String invoiceIdRegex = "HD\\d{3}";
        do {
            String invoiceId = scanner.nextLine();
            if (isNotEmpty(invoiceId)) {
                if (Pattern.matches(invoiceIdRegex, invoiceId)) {
                    return invoiceId;
                }
                System.out.println("Ma hoa don phai bat dau bang HD va 3 ki tu sau la so, vui long nhap lai:");
            } else {
                System.out.println("Vui long khong de trong");
            }
        } while (true);
    }

    public float inputPrice (Scanner scanner, String message) {
        System.out.println(message);
        do {
            float price = Float.parseFloat(scanner.nextLine());
            if (price >= 0) {
                return price;
            }
            System.out.println("Vui long nhap so thuc >= 0");
        } while (true);
    }

    public boolean isNotEmpty (String data) {
       return data != null && !data.trim().isEmpty();
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Ma hoa don: %s, So tien: %.1f", this.id, this.invoiceId, this.price);
    }
}
