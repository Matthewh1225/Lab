import java.util.Scanner;

public class Problem4 {
    public static void sum(String number){
        int sum = 0;
        for(int i =0;i<number.length();i++){
            char c = number.charAt(i);
            if (!Character.isDigit(c)){
                continue;
            }
            System.out.print(c+" ");
            sum += Character.getNumericValue(c);
        }
        System.out.printf("\nSum = %d \n",sum);
    }
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner s = new Scanner(System.in);
        sum(s.nextLine());
        s.close();
    }
}