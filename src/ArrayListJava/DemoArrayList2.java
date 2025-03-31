package ArrayListJava;

import java.util.ArrayList;

public class DemoArrayList2 {
    public static void main(String[] args) {

                ArrayList<String> listMenu = new ArrayList<>();

                listMenu.add("Dashboard");
                listMenu.add("Customers");
                listMenu.add("Sales");
                listMenu.add("Subscriptions");
                listMenu.add("Expenses");
                listMenu.add("Contracts");


                for (int i = 0; i< listMenu.size(); i++){
                    System.out.println(listMenu.get(i));
                }

                System.out.println("------");

                ArrayList<String> list2 = new ArrayList<>();
                list2.addAll(listMenu); // them all listMenu vao list2

                list2.add("Tasks");
                list2.add("Reports");
                list2.removeAll(listMenu);// Xoa nhung thang chi dinh()
                //list2.retainAll(listMenu);//Xoa nguoc, xoa nhung thang khong chi dinh()

                for (int i = 0; i< list2.size(); i++){
                     System.out.println(list2.get(i));
                }

                System.out.println("----");

                //Mở rộng kiểu dữ liệu Object( chứa nhiều kiểu dữ liệu khác)
                ArrayList<Object> list3 = new ArrayList<>();
                list3.add("Selenium");
                list3.add(10);

                for (int i =0; i< list3.size(); i++){
                    System.out.println(list3.get(i));
                    System.out.println(list3.get(i)==("Selenium"));
                    System.out.println("-----");

                    //System.out.println(Integer.parseInt(list3.get(i)));
                }
    }
}
