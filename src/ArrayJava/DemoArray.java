package ArrayJava;

public class DemoArray {

    public static void main(String[] args) {

        //khai bao mang
        int mangSoNguyen[];

        //Khoi tao mang gom 10 phan tu
        mangSoNguyen = new int[10];

        //Khai bao va khoi tao
        int mangSoNguyen2[] = new int[5];

        //Khai bao va khoi tao mang dang chuoi
        String listMenu[] = new String[10];

        //Gan gia tri vao trong mang
        listMenu[0] = "Dashboard"; //Gan gia tri vao vi tri thu nhat (bat dau la 0)
        listMenu[1] = "Customers"; //Gan gia tri vao vi tri thu 2
        listMenu[7] = "Tasks"; //Gan gia tri vao vi tri thu 7

        //listMenu[10] = "Selenium"; //ERROR: Index 10 out of bounds for length 10

        //Truy xuat gia tri thu cong tung vi tri
        System.out.println(listMenu[0]);
        System.out.println(listMenu[1]);
        System.out.println("---------");

        //Duyệt mảng de lay all gia tri ra đồng loạt - dùng vòng lặp FOR
        for (int i = 0; i < listMenu.length; i++) {
            System.out.println(listMenu[i]);
            //auto test: Compare data with Excel file
        }

        System.out.println("---------");

        //khai báo + khởi tạo + gán trực tiếp giá trị cho mảng
        int a[] = {33, 3, 4, 87};

        System.out.println(a[2]);

        //a[4] = 100; //Index 4 out of bounds for length 4

        //in mang a ra man hinh
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "");
        }

    }
}
