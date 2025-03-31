package ArrayJava;

public class DemoArrayForEach {
    public static void main(String[] args) {
        int mang[] = {3, 34, 24, 8, 18, 2};

        //duyet tu dau den cuoi
        for (int item : mang) {
            System.out.println(item);
        }

        System.out.println("-----");

        for (int i = 2; i<=5; i++){
            System.out.println(mang[i]);
        }
    }
}
