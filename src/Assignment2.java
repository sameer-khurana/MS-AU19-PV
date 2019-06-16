import java.util.*;

public class Assignment2 {
    public static void main(String[] args) {
        String[] input = {"abc","xyz","pqr","xyz","pqr","pqr"};
        // Generate another array containing distinct elements
        //sorted in the order of their frequency (max first)

        Map<String,Integer> hashMap = new HashMap<>();
        SortedMap<Integer,String> inputMap = new TreeMap<>(Collections.reverseOrder());

        for(int i=0;i<input.length;i++){
            Integer count = hashMap.get(input[i]);
            hashMap.put(input[i], (count == null)? 1: count +1);
        }
//        System.out.println(hashMap.toString());
        for(Map.Entry<String,Integer> entry:hashMap.entrySet()){
            inputMap.put(entry.getValue(),entry.getKey());
        }
//        System.out.println(inputMap.toString());

        for(SortedMap.Entry<Integer,String> entry:inputMap.entrySet()){
            System.out.print(entry.getValue()+"\t");
        }
    }
}
