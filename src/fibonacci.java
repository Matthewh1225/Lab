public class fibonacci {
    public static long[] cache;
    private static long returnFib(int number){
        long nthFibNumber = (returnFib(number-1)+returnFib(number-2));
        cache = new long [number+1];
        
        
        if (number<=1){
            return number;
        }
        if (cache[number] !=0 ){
            return cache[number];

        }
        cache[number]=nthFibNumber;
        return nthFibNumber;
        
    }
public static void main(String[] args) {
    
    long timeStart = System.nanoTime();
    System.out.println(returnFib(50));
    long timeEnd = System.nanoTime();
    long totalTime = timeEnd-timeStart;
    System.out.printf("\nTotal time: %d\n ",totalTime/1_000_000l);
    
}
}
    

