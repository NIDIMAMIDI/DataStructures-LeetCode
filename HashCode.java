public class HashCode {
    public static int customHashFunction(String input){
        int hashCode = 0;
        for(int i = 0; i < input.length(); i++){
            System.out.println(hashCode);
           hashCode += input.charAt(i);
        }
        return hashCode;
    }
    public static void main(String[] args) {
        String name = "sharuk";
        int hashCode = customHashFunction(name);
        System.out.println(hashCode);
    }
}
