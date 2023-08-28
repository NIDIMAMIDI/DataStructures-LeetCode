import java.util.Hashtable;
import java.util.Map;

public class HashMap00 {
    public static void main(String[] args) {
        Map<Integer, String> studentData = new Hashtable<>();

        studentData.put(1,"Ishu");
        studentData.put(2,"Keerthi");
        studentData.put(3,"Manasa");
        studentData.put(4,"Chandipriya");
        studentData.put(5,"Suma");

        int searchIndex = 2;
        String outputName = studentData.get(searchIndex);
        System.out.println(outputName);
    }
}
