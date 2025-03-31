package Loop;

public class DemoFor {
    public static void main(String[] args) {
        for (int i = 1; i<= 10; i++){
            System.out.println("Selenium Java");
        }

        //su dung break va continue trong vong lap
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Dừng vòng lặp khi i = 5 (i<5)
            }
            if (i % 2 == 0) {
                continue; // Bỏ qua số chẵn
            }
            System.out.println("Số lẻ: " + i);
        }

        for (int i = 5; i<= 100; i+=5){
            System.out.println(i);
        }


    }
}
