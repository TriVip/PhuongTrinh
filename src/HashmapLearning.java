import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapLearning {
    public static void main(String[] args) {
        //Declaration
        Map<Integer, String> emergencyList = new HashMap<>();

        //Add element into Hashmap
        emergencyList.put(113, "Police");
        emergencyList.put(114, "Fire Dept");
        emergencyList.put(115, "Hospital");
        //Add duplicated key
        emergencyList.put(115, "Hospital !!!");
        emergencyList.put(116, "Others");

        //Get values
//        System.out.println("113: " + emergencyList.get(113));
//        System.out.println("114: " + emergencyList.get(114));
//        System.out.println("115: " + emergencyList.get(115));

        //Replace
        emergencyList.replace(115, "Hospital");

        //Remove
        emergencyList.remove(116, "abc");

        //Get all key
        Set<Integer> allKeys = emergencyList.keySet();

        //Loop all key
        for (Integer key : allKeys) {
            System.out.println(key + " " +emergencyList.get(key));
        }

        //Iterator and Exception
        Iterator<Map.Entry<Integer, String>> emergencyIteratorList = emergencyList.entrySet().iterator();
        while (emergencyIteratorList.hasNext()){
            Map.Entry<Integer, String> entry = emergencyIteratorList.next();
            String entryValue = entry.getValue();
            if (entryValue.equals("Others"))
                emergencyIteratorList.remove();
        }
        System.out.println("+++++++++++");

        for (Integer key : allKeys) {
            System.out.println(emergencyList.get(key));
        }

        System.out.println("============");
        
        //Check existing
        boolean isPoliceexisting = emergencyList.containsValue("Police");
        System.out.printf("Is Police existing: %b\n", isPoliceexisting);
    }
}
