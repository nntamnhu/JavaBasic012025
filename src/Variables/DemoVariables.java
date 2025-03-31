package Variables;

public class DemoVariables {

    String address = "Ho Chi Minh City"; //Bien toan cuc
    int zip_code = 70000; //Bien toan cuc

    static  String ID = "079812465632"; //Bien static

    public void sayHello() {
        int number = 100; //Bien cuc bo
        int a = 5;
        int b;
        b = a + number;
        System.out.println(b);

        System.out.println(address);
        System.out.println(zip_code);

        System.out.println(DemoVariables.ID); //Bien static duoc goi thong qua ten class
    }

    public void getInfo(){

        //System.out.println(number); //khong the goi bien cuc bo tu ham sayHello()

        System.out.println(address);
        System.out.println(zip_code);

        System.out.println(DemoVariables.ID); //Bien static duoc goi thong qua ten class
    }

    public static void main(String[] args){
        System.out.println("Selenium Java");
        String phone = "0123456789";
        System.out.println(phone);

        //System.out.println(number);

        DemoVariables demoVariable = new DemoVariables(); //Khai bao doi tuong class de co the goi bien toan cuc

        demoVariable.zip_code = demoVariable.zip_code +5; //co the thay doi gia tri bien toan cuc

        System.out.println(demoVariable.address);
        System.out.println(demoVariable.zip_code);
        //System.out.println(address); khong the goi vao ham main vi khong phai static

        System.out.println(ID);

        String address = "Dong Thap";
        System.out.println(address);

        //System.out.println(number); //khong the goi bien cuc bo tu ham sayHello()
    }
}
