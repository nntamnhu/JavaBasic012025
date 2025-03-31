package StaticConcepts;

public class DemoStaticMethods {
    int nonStaticVar = 10; // Biến không static
    static int staticVar = 20; // Biến static

    void nonStaticMethod() {
        System.out.println("Phương thức không static");
    }

    static void staticMethod() {
        System.out.println("Phương thức static");

        // Không thể gọi trực tiếp nonStaticVar hoặc nonStaticMethod()
        // System.out.println(nonStaticVar); // ❌ Lỗi
        // nonStaticMethod(); // ❌ Lỗi

        // Cách đúng: Tạo đối tượng để gọi
        DemoStaticMethods demoStaticMethod = new DemoStaticMethods();
        System.out.println("Biến non-static: " + demoStaticMethod.nonStaticVar);
        demoStaticMethod.nonStaticMethod();
    }


    public static void main(String[] args) {
        DemoStaticMethods.staticMethod();

        System.out.println("-----------");

        //gọi khối static từ class khác
        DemoStaticBlock.getInfo();
    }
}
