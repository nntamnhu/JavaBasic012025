package CollectionJava;

import java.util.HashMap;
import java.util.Map;

public class DemoCollectionMap {
    public static void main(String[] args) {
        // new TreeMap() sẽ sắp xếp các phần tử dự vào key của chúng
        Map<String, String> listDevices = new HashMap<String, String>();
        listDevices.put("device1","Windows");
        listDevices.put("device2","MacOS");
        listDevices.put("device1","Linux");

        //khong the dung vong lap for de duyet Map
        for (Map.Entry<String,String> entry : listDevices.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

//        for (Map.Entry<String,Integer> entry : score.entrySet()){
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//            System.out.println(key + ": " + value);
//        }

    }
}
