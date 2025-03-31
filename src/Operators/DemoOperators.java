package Operators;

public class DemoOperators {

    public static void main(String[] args) {

        //so hoc
        int a = 10;
        int b = 20;
        System.out.println("a % b = " + (a % b));

        //System.out.println(a++);
        //a++

        int c = a;
        System.out.println(c);

        b++; //chi nen ++ va -- cho 1 bien, khong mang ket hop vao phep toan
        c = a + b;
        System.out.println(c);

//        c = a + (++b); // Sử dụng tiền tố để tránh lỗi logic
//        System.out.println("Giá trị c sau khi dùng ++b: " + c);

        int d = c;
        System.out.println(d);

        //so sanh
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        //toan tu logic - ket hop nhieu dieu kien/phep toan
        System.out.println("Logic &&: " + ((a < b) && (b > c)));
        System.out.println("Logic ||: " + ((a < b) || (b > c)));

        //toan tu dieu kien
        int m = 20;
        int n = 2;

        String t = (m % n == 0) ? "m chia het cho n" : "m khong chia het cho n";
        System.out.println(t);

        //toan tu gan
        int var = 20;
        int p,q,r,s;
        p=q=r=s=var;
        System.out.println(r);
        System.out.println(s);

        //nen dung toan tu gan nhu nay
//        int var = 20;
//        int p = var, q = var, r = var, s = var;
//        System.out.println("r = " + r);
//        System.out.println("s = " + s);

        String actualHeader = ""; //dung Selenium get Header ra dang text
        String expectedHeader = "Login";

        boolean check = actualHeader.equals((expectedHeader));
        System.out.println("Chuoi giong nhau: " +check);

        //so sanh chuoi
        System.out.println("So sanh equals: " +actualHeader.equals(expectedHeader));
        System.out.println("Kiem tra contains: " +actualHeader.contains(expectedHeader));
    }
}
