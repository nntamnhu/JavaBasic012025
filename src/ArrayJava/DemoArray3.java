package ArrayJava;

public class DemoArray3 {
    public static void main(String[] args) {

        String listMenu[] = {"Dashboard", "Customers", "Projects", "Tasks"};

        for (int i=0; i< listMenu.length; i++){
            if (listMenu[i].equals("Projects")){
                System.out.println("Có chứa giá trị menu Projects"); //Pass/Fail
                break;
            }
        }

        System.out.println("-----");

        //dung for each khong the lay vi tri cu the de so sanh
        //nhung co the lay gia tri de so sanh
        for (String menu : listMenu){
            if (menu.equals("Projects")){
                System.out.println("Có chứa giá trị menu Projects");
                break;
            }
        }
    }
}
