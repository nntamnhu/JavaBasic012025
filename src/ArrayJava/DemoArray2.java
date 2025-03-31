package ArrayJava;

public class DemoArray2 {

    static void min(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (min > arr[i]) {
                min = arr[i];
            }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int mang[] = {3, 34, 24, 8, 18, 2};
        min(mang);

        System.out.println("-----");

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Các số chẵn trong mảng là: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " ");
            }
        }
    }
}
