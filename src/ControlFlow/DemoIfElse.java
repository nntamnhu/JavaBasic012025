package ControlFlow;

public class DemoIfElse {

    static int c = 20;

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        String expected = "Customer Summary";


        //menh de if
        if ((a < b) && (expected.equals("Customer Summary"))) {
            System.out.println("a < b");
            System.out.println("TC passed");
        }

        if ((a < b) && (expected.equals("Customer"))) {
            System.out.println("a < b");
            System.out.println("TC passed");
        }

        if (expected.equals("Customer Summary")) {
            System.out.println("Passed");
        }

        if (c > 15) {
            System.out.println("c lon hon 15");
        }


        //menh de if-else
        if (a > b) {
            System.out.println("a lon hon b");
        } else {
            System.out.println("a nho hon b");
        }


        //menh de if-else if
        int marks = 65;

        if (marks < 50) {
            System.out.println("Tạch!");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("Xếp loại D");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Xếp loại C");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Xếp loại B");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Xếp loại A");
        } else if (marks >= 90 && marks < 100) {
            System.out.println("Xếp loại A+");
        } else {
            System.out.println("Giá trị không hợp lệ!");
        }


        //Viết tắt if-else bằng toán tử 3 ngôi (ternary operator)
        //biến = (điều_kiện) ? giá_trị_nếu_đúng : giá_trị_nếu_sai;
        int age = 20;
        String message = (age >= 18) ? "Bạn đủ tuổi lái xe" : "Bạn chưa đủ tuổi";
        System.out.println(message);

    }

}
