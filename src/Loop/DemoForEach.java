package Loop;

public class DemoForEach {
    public static void main(String[] args) {
        //khai bao mang so nguyen
        int arr[] = {12, 23, 44, 56, 78};

        //duyet gia tri trong mang tren
        for (int i : arr) {
            System.out.println(i);
        }


        String[] testCases = {"Login", "Signup", "Checkout"};
        //Biến testCase sẽ lần lượt lấy từng giá trị trong mảng testCases.
        for (String tesCase : testCases) {
            System.out.println("Dang kiem thu: " + tesCase);
        }
    }
}



        //Khai báo một mảng String chứa các username cần kiểm thử.
        //Các tài khoản user1, user2, user3 sẽ lần lượt được sử dụng để đăng nhập

        //Sử dụng vòng lặp for-each để lặp qua từng giá trị trong mảng usernames.
        //Mỗi lần lặp, username sẽ lấy một giá trị mới (user1, user2, user3).

        //thao tác nhập username, password và nhấn nút login

//        public class LoginTest {
//            public static void main(String[] args) {
//                // Cấu hình đường dẫn tới ChromeDriver (cần tải driver phù hợp với trình duyệt)
//                System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
//
//                // Khởi tạo WebDriver
//                WebDriver driver = new ChromeDriver();
//
//                // Mở trang đăng nhập
//                driver.get("https://example.com/login");
//
//                // Danh sách username để kiểm thử
//                String[] usernames = {"user1", "user2", "user3"};
//
//                for (String username : usernames) {
//                    driver.findElement(By.id("username")).sendKeys(username);
//                    driver.findElement(By.id("password")).sendKeys("123456");
//                    driver.findElement(By.id("loginBtn")).click();
//
//                    System.out.println("Đã thử đăng nhập với: " + username);
//                }
//
//                // Đóng trình duyệt sau khi kiểm thử xong
//                driver.quit();
//            }
//        }

