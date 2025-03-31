package CollectionJava;

import java.util.HashSet;
import java.util.Set;

public class DemoCollectionSet {

    public static void main(String[] args) {

        Set<String> listSession = new HashSet<>();

        listSession.add("89782436512");
        listSession.add("89782436513");
        listSession.add("89782436514");

        //chi co the xoa theo object
        //khong the xoa theo vi tri
        listSession.remove("89782436514");

        //kiem tra xem co chua gia tri
        System.out.println(listSession.contains("89782436512"));
        System.out.println(listSession.contains("823264"));


        for (String sesion : listSession){
            System.out.println(sesion);
        }
    }
}
