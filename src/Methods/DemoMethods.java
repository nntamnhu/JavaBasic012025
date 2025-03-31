package Methods;

public class DemoMethods {

    //Ham khong tra ve ket qua
    public void login() {
        //Set email
        //Set password
        //Click Login button
        System.out.println("Set email");
        System.out.println("Set password");
        System.out.println("Click Login button");
    }

    //Ham co tra ve ket qua
    public static String getHeaderPage() {
        System.out.println("Dùng Selenium để lấy Header page");
        String header = "Cusomers Summary";

        return header;
    }

    //Ham khong tra ve ket qua + co tham so (Tinh da hinh, trung ten nhung khac tham so)
    public static void login(String email, String password) {
        //Set email
        //Set password
        //Click Login button
        System.out.println("Set email: " + email);
        System.out.println("Set password: " + password);
        System.out.println("Click Login button");
        //Phan quyen su ly cho 15 roles
    }

    public static int sum(int a, int b) {
        //phuong thuc ket thuc khi gap return
        return a + b;
    }

    public static int getCustomerTotal() {
        //Dung Selenium de get Customer Total
        int customerTotal = 350;
        return customerTotal;
    }

    public static int getCustomerDeActive() {
        //Dung Selenium de get Customer Total
        int customerDeActive = 150;
        return customerDeActive;
    }

    public static void main(String[] args) {
        //cach goi ham khong co static vao ham main
        DemoMethods demoMethod = new DemoMethods();
        demoMethod.login();

        //login();
        String value = getHeaderPage();
        System.out.println(value);

        //ham co tham so, goi va truyen vao gia tri
        login("admin@example.com", "123456");
        login("user@example.com", "456789");

        //tao bien trung gian luu tru gia tri va lay gia tri do di xu ly
        int valueSum = sum(123, 456);
        System.out.println(valueSum);
        //System.out.println(sum(123, 456));

        System.out.println(getCustomerTotal() + getCustomerDeActive());
    }
}
