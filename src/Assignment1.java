import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Assignment1 {
    public static void main(String[] args) {
        String input = "Hey how are you?";
        input = input.toLowerCase();
        HashMap<Character,Integer> characterOccurence = new HashMap<>();


        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(ch>='a' && ch <='z'){
                if(characterOccurence.containsKey(ch)) {
                    characterOccurence.put(ch,characterOccurence.get(ch)+1);
                }
                else {
                    characterOccurence.put(ch, 1);
                }
            }
        }
        for(Map.Entry<Character,Integer> entry: characterOccurence.entrySet()){
            System.out.print(entry.getKey()+"\t");
            for(int i=0;i<entry.getValue();i++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}