package ArrayListJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class DemoArrayList {

    public static void main(String[] args) {
        ArrayList<String> listMenu = new ArrayList<>();

        listMenu.add("Dashboard");
        listMenu.add("Customers");
        listMenu.add("Sales");
        listMenu.add("Subscriptions");
        listMenu.add("Contracts");
        listMenu.add("Expenses");
        listMenu.add("Contracts");

        listMenu.remove(2);
        listMenu.add(2, "Projects");

        // Cập nhật phần tử ở vị trí 1 (Customers) thành "Tasks"
        listMenu.set(1, "Tasks");

        //kiem tra "expenses co ton tai trong list khong (tra ve true, false)
        System.out.println("Check value: " +listMenu.contains("Expenses"));
        System.out.println("Check value: " +listMenu.contains("Contract"));


        //se tra ve cung mot vi tri neu khong co gia tri trung
        System.out.println(listMenu.indexOf("Contracts")); //tim vi tri tai ket qua dau tien
        System.out.println(listMenu.lastIndexOf("Contracts")); //tim vi tri tai ket qua sau cung

        System.out.println("------");

        for (int i = 0; i< listMenu.size(); i++){
            System.out.println(listMenu.get(i));
        }

        System.out.println("------");

        //Convert ArrayList to Array
        Object mangMenu[] = listMenu.toArray();
        for (Object item : mangMenu){
            System.out.println(item);
        }


        System.out.println("------");
        //Convert Array to ArrayList
        List<Object> listConverted = new ArrayList<>();
        listConverted = Arrays.asList(mangMenu);
        for (Object item : listConverted){
            System.out.println(item);
        }
    }
}
