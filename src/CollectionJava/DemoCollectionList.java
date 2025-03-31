package CollectionJava;

import java.util.ArrayList;
import java.util.List;

public class DemoCollectionList {

    public static void main(String[] args) {

        List<String> listMenu = new ArrayList<>();

        listMenu.add("Dashboard");
        listMenu.add("Customers");
        listMenu.add("Tasks");


        //xoa phan tu theo vi tri
        listMenu.remove(1);

        //in ra so phan tu
        System.out.println(listMenu.size());

        for (int i = 0; i< listMenu.size(); i++){
            System.out.println(listMenu.get(i));
        }
    }
}
