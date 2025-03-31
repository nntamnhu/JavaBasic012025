package StaticConcepts;

public class TestCases {

    public void testAddNewProject(){
        System.out.println(DataConstants.url);
    }
    public static void testLoginSuccess() {
        System.out.println("Open browser " + DataConstants.browser);
        System.out.println("Navigate to url " + DataConstants.url);
        System.out.println("Enter email and password...");
        System.out.println("Click Login button");
        System.out.println("Verify...");
    }

    public static void testAddNewCustomer() {
        testLoginSuccess();
        System.out.println("Click menu Customer");
        System.out.println("Click button Add New Customer");
        System.out.println("Input data on form add new customer");
        System.out.println("Click Save button");
        System.out.println("Verify...");
    }

    public static void testAddNewTask(){
        testLoginSuccess();
//        testAddNewProject(); khong the goi bien/ham non-static vao ham static
        DataConstants.clickElement("Menu Task");
        DataConstants.clickElement("Add New Task");
        System.out.println("Input data for task");
        DataConstants.clickElement("Button Save Task");
        System.out.println("Verify...");
    }


    public static void main(String[] args) {

        //neu khong phai ham static ma muon goi vao ham main thi phai khoi tao doi class
//        TestCases testCases = new TestCases();
//        testCases.testLoginSuccess();


        TestCases testCases = new TestCases();
        //goi nhung thanh phan trong class thong qua doi tuong class
        testCases.testAddNewProject();
        System.out.println("-----------");

        testLoginSuccess();
        System.out.println("------------");
        testAddNewCustomer();


        //goi bien static truc tiep
        System.out.println(DataConstants.browser);
        System.out.println("-------------");
        testAddNewTask();
    }

}
