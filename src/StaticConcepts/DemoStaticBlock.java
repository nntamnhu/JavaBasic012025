package StaticConcepts;

public class DemoStaticBlock {

    //khối static dùng để chạy trước hàm main
    //hoặc trước nhất trong class này/ class này được gọi sang class khác

    //Tự động chạy, không gọi lại sử dụng được
    static {
        System.out.println("Setup moi truong ");
    }

    public static void getInfo(){
        System.out.println("Name: Tam Nhu");
    }
    public static void main(String[] args) {

        System.out.println("Login Test");
    }
}
