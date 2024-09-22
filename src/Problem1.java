public class Problem1 {
    public void printOut(){
        for (int i = 1; i <=6; i++){
            for (int k = 6; k >= i ; k-- )
            System.out.print("*");
            System.out.print(" ");
            for (int j = 0; j<12 ;j++)
                
                System.out.print("/");
            
            System.out.print(" ");
            for (int k = 6; k >= i ; k-- )
            System.out.print("*");
        System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        Problem1 a = new Problem1();
        a.printOut();  
    }
}
