package HandleString;

public class DemoHandleString {
    public static void main(String[] args) {
        String str1 = "Java for Tester";
        String str2 = "Selenium";
        String str3 = " TestNG ";

        //Cắt chuỗi
        System.out.println("Cat chuoi:" + str1.substring(9));
        System.out.println("Cat chuoi:" + str1.substring(0, 4));

        //Độ dài chuỗi
        System.out.println("Độ dài chuỗi: " + str1.length());

        //Vị trí của ký tự 'a' xuất hiện đầu tiên
        System.out.println("Vị trí ký tự trong chuỗi: " + str1.indexOf("a"));
        //Vị trí của ký tự 'a'  xuất hiện từ vị trí 2
        System.out.println("Vị trí ký tự trong chuỗi: " + str1.indexOf("a", 2));

        System.out.println("------");

        //Tách chuỗi (trả về mảng)
        String tachChuoi[] = str1.split(" ");
        for (String item : tachChuoi) {
            System.out.println(item);
        }

        System.out.println("Chữ hoa: " + str2.toUpperCase());
        System.out.println("Chữ thường: " + str2.toLowerCase());

        System.out.println("-------");
        String temp = str1.replace(" ", "-");
        System.out.println(temp);

        System.out.println("-------");


        System.out.println("-------");
        //Chuyển chuỗi thành mảng ký tự
        char mangChar[] = str2.toCharArray();
        for (char item : mangChar){
            System.out.println(item);
        }

        System.out.println("-------");
        System.out.println(str3);
        System.out.println(str3.trim());

        System.out.println("-------");
        //Chuyển kiểu dữ liệu khác sang dạng chuỗi
        //Đã chuyển về dạng chuỗi nên in ra 123455 (ghep chuoi)
        System.out.println(String.valueOf(12345) + 5);

        //Chuyển kiểu dữ liệu chuỗi về dạng số
        System.out.println(Integer.parseInt("12345") + 5);

        System.out.println("-------");
        //Tách số từ trong chuỗi
        String strTasks = "Tasks assigned to me: 78";
        System.out.println(strTasks.substring(strTasks.length() - 2));

        int itemTotal = strTasks.split(" ").length;
        System.out.println(itemTotal);

        String listItem[] = strTasks.split(" ");
        System.out.println(listItem[itemTotal - 1]);//should

        System.out.println("------");

        String strShowPage = "Showing 1 to 50 of 549 entires";
        String number[] = strShowPage.split(" ");
        for (String item : number){
            System.out.println(item);
        }
        System.out.println(number[3]);
        System.out.println(number[5]);

//        String strShowPage = "Showing 1 to 50 of 549 entries";
//
//      // Tách chuỗi thành từng từ
//        String[] words = strShowPage.split(" ");
//
//        int index = 0; // Biến đếm vị trí của từ trong mảng
//        for (String word : words) {
//            // Kiểm tra xem từ có phải là số không
//            if (word.matches("\\d+")) {
//                System.out.println("Số: " + word + " nằm ở vị trí: " + index);
//            }
//            index++; // Tăng vị trí
//        }
//
//        // Truy xuất số
//        System.out.println(words[3]);
//        System.out.println(words[5]);
        //System.out.println(listItem[4]);//neu chan chac vi tri
        //System.out.println(listItem[0]);//neu o dau
    }
}
