import java.util.*;

public class Ex2_ex {
    public static void main(String[] args) {

        Map<String, Integer> myMap = new HashMap<>();

        createMap(myMap);
        displayMap(myMap);
    }

    public static void createMap(Map<String, Integer> map){

        Scanner scanner = new Scanner(System.in);
        System.out.println("String- ");
        String input = scanner.nextLine();

        String[] tokens = input.split(""); // " " --> para ""

        for(String token : tokens){
            String word = token.toLowerCase();
            // por string replace do " " para ""

            if(map.containsKey(word)) {
                int cont = map.get(word);
                map.put(word, cont + 1);
                //}else if(word != ' ') {
            }else
                map.put(word, 1);
            }
            }
        }
        private static void displayMap(Map<String,Integer>map){

        Set<String> keys =map.keySet();

        TreeSet<String> sortedkeys = new TreeSet<>(keys);

            System.out.printf("%n Map contains:%nKey \t\tValue%n");

            for(String key : sortedkeys) {
                System.out.printf("%-10s%10s%n", key, map.get(key));
            }
            System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(),map.isEmpty());
    }
}
