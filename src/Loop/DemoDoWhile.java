package Loop;

public class DemoDoWhile {

    public static void main(String[] args) {
        int j = 5;
        do {
            System.out.println("Giá trị i: " + j);
            j++;
        } while (j < 5); //Chạy 1 lần rồi mới kiểm tra điều kiện (j < 5 là false, nên dừng).
    }
}
