import java.util.TreeMap;

public class Problem5 {
    public static void getCount(int[] numbers){
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
        int[] numbers= {35,67,88,88,45,7,7,7,34,34,1,1,1,1,3,3,3,-999,89};
        getCount(numbers);
    }
}