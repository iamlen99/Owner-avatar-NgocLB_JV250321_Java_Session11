package manage;

import entity.Invoice;
import entity.Manage;

import java.util.ArrayList;
import java.util.List;

public class InvoiceManager implements Manage<Invoice> {
    public static final List<Invoice> listInvoices = new ArrayList<>();

    @Override
    public void add(Invoice item) {
        listInvoices.add(item);
        System.out.println("Hoa don da duoc them thanh cong.");
    }

    @Override
    public void update(int index, Invoice item) {
        listInvoices.set(index, item);
        System.out.println("Hoa don da duoc sua thanh cong.");
    }

    @Override
    public void delete(int index) {
        listInvoices.remove(index);
        System.out.println("Hoa don da duoc xoa thanh cong.");
    }

    @Override
    public void display() {
        for (int i = 0; i < listInvoices.size(); i++) {
            System.out.println(i + 1 + ". " + listInvoices.get(i));
        }
    }

    public int findIndexById(int id) {
        for (int i = 0; i < listInvoices.size(); i++) {
            if (listInvoices.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
