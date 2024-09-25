public class ForFun {
    
    public int searchInsert(int[] nums,int target){
        int length = nums.length;
        for(int i = 0; i<length; i++){
            if (nums[i] == target)
                return i;

            if (nums[i]>target)
                return i;        
        }
        return length;
    }
    public static void lastWord(String sentence){
        String[] splitSentence = sentence.split(" ");
        String word = splitSentence[splitSentence.length-1];
        int wordLength = word.length();
      
      

        System.out.printf("Word: %s\nlength: %d",splitSentence.length-1,wordLength);

    }
    public static void main(String[] args) {
        // ForFun f = new ForFun();
        // int [] numbers = {1,2,3,4,5,6,7,8,9,10,11,13};
        // System.out.println(f.searchInsert(numbers, 5));
        lastWord("hello world i   have  to g0o cat");



    }
}
