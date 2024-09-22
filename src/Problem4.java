import java.util.Scanner;

public class Problem4 {
    
    Scanner s = new Scanner(System.in);
    
    public void sum(){
        System.out.println("enter a number: ");
        int input = s.nextInt();
        input = Math.abs(input);

        String newInput = Integer.toString(input);
        int length = newInput.length();
        int[] numList = new int[length];

        for (int i = 0 ;i < length; i++){
            numList[i] = Character.getNumericValue(newInput.charAt(i));
        
        }
        int total = 0;
        for (int number : numList){
             
            System.out.println(number);
            total+=number;  
        }
        System.out.printf("Sum = "+total); 
    }
    public static void main(String[] args) {
        Problem4 p = new Problem4();
        p.sum(); 
    }
}
