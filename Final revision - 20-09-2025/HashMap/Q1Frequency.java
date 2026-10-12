package HashMap;
import java.util.*;
public class Q1Frequency {
    
    public static void main(String[] args){
         String s = "banana";

         Map<Character, Integer> map = new HashMap<>();

         for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            map.put(ch, map.gerOrDefault(ch,0) +1);
         }
         for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() +)
         }

    }
}
