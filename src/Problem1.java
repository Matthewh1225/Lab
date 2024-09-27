public class Problem1 {
    public void printOut(){
        for (int i = 0; i <7; i++){
            for (int stars = 6; stars > i ; stars-- ){
                System.out.print("*");
            }
            for (int space = 0; space<i ;space++){
                System.out.print(" ");
            }
            System.out.print(" ");
            for (int fSlash = 6; fSlash > i ; fSlash-- ){
                System.out.print("//");
            }
            for (int bSlash = 0; bSlash<i ;bSlash++){
                System.out.print("\\\\");
            }
            System.out.print(" ");
            for (int space = 0; space<i ;space++){
                System.out.print(" ");
            }
            for (int stars = 6; stars > i ; stars-- ){
                System.out.print("*");
            }
        System.out.println();
        }
    }
    public static void main(String[] args){
        Problem1 a = new Problem1();
        a.printOut();  
    }
}
