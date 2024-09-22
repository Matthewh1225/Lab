import java.util.TreeMap;
import java.util.Arrays;

public class Problem5 {
    public static void getCount(Iterable<Integer> numbers){
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int num:numbers){
            if(num == -999){
                break;
            }
            if(map.containsKey(num)){
                int value = map.get(num)+1;
                map.put(num, value);
            }
            else map.put(num, 1);
        }
        System.out.println("Number\tCount");
        for(int key : map.keySet()){
            
            System.out.printf("%d\t%d\n",key,map.get(key));
        }
    }
    public static void main(String[] args) {
        getCount(Arrays.asList(35,67,88,88,45,34,34,-999,1,35,1,35,1,89));
    }
}