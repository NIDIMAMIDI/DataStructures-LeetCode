import java.util.*;

public class HashMap0 {
    public static void main(String[] args) {
        Map<Integer, String> dataMap = new HashMap<>();

        String name = "shauk";
        int hashCode = name.hashCode();
        // System.out.println(hashCode);
        // Key => hashCode
        dataMap.put(hashCode, name);
        String outputName = dataMap.get(hashCode);   
        System.out.println("Name: " + outputName);
    }
    
}