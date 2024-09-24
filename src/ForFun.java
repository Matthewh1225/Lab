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
    public static void main(String[] args) {
        ForFun f = new ForFun();
        int [] numbers = {1,2,3,4,5,6,7,8,10,11,13};
        System.out.println(f.searchInsert(numbers, 5));



    }
}
