package StaticConcepts;

public class DemoStaticVariables {
    static int count = 0; // Biến static

    DemoStaticVariables() {
        count++;
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        {
            DemoStaticVariables e1 = new DemoStaticVariables();
            DemoStaticVariables e2 = new DemoStaticVariables();
            DemoStaticVariables e3 = new DemoStaticVariables();

        }
    }


}

