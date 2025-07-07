package Manager;

import entity.Manage;
import entity.Order;

import java.util.ArrayList;

public class OrderManager implements Manage<Order> {
    public static ArrayList<Order> listOrders = new ArrayList<>();


    @Override
    public void add(Order item) {
        listOrders.add(item);
        System.out.println("Don hang da duoc them thanh cong.");
    }

    @Override
    public void update(int index, Order item) {
        listOrders.set(index, item);
        System.out.println("Don hang da duoc sua thanh cong.");
    }

    @Override
    public void delete(int index) {
        listOrders.remove(index);
        System.out.println("Don hang da duoc xoa thanh cong.");
    }

    @Override
    public void display() {
        for (int i = 0; i<listOrders.size(); i++) {
            System.out.println(i+1 + ". " +listOrders.get(i));
        }
    }

    public int findIndexById(String id) {
        for (int i = 0; i < listOrders.size(); i++) {
            if (listOrders.get(i).getOrderId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
