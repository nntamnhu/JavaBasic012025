package ControlFlow;

public class DemoSwitchCase {
    public static void main(String[] args) {
        int number = 20;
        switch (number) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");
        }


        //Khi dùng break → Chỉ chạy đúng một case
        //Vì có break, nó dừng ngay sau case "fail":.
        String status = "success"; // Giả lập trạng thái đăng nhập

        switch (status) {
            case "success":
                System.out.println("✅ Đăng nhập thành công!");
                break;
            case "fail":
                System.out.println("❌ Đăng nhập thất bại!");
                break;
            default:
                System.out.println("⚠️ Trạng thái không xác định!");
        }

        //Nếu không có break, các câu lệnh trong switch-case sẽ chạy tiếp cho đến khi gặp break hoặc hết switch.
        // Điều này gọi là fall-through.

        //Vì thiếu break, sau khi gặp case "fail":, nó chạy luôn cả "locked" và "default".
        String fail = "fail";

        switch (fail) {
            case "success":
                System.out.println("✅ Đăng nhập thành công!");
            case "fail":
                System.out.println("❌ Đăng nhập thất bại!");
            case "locked":
                System.out.println("🔒 Tài khoản bị khóa!");
            default:
                System.out.println("⚠️ Trạng thái không xác định!");
        }

        //Khi nào không cần break?
        //Khi muốn fall-through, tức là một case chạy xong rồi tiếp tục chạy case tiếp theo.
        String day = "Sunday";

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("📅 Today is a weekday.");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("🎉 Today is a weekend!");
                break;
            default:
                System.out.println("⚠️ Invalid day.");
        }
    }
}
