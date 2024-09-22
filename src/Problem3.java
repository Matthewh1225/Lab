public class Problem3 {
    public static double getGrade(int score){
        if (score<60){
            return  0.0;
        }
        else if (score<62){
            return 0.7;
        }
        else if(score>94){
            return 4.0;
        }
        else{
            return (score-55.0)/10;
        }
    } 
    public static void main(String[] args) {
        System.out.print(getGrade(92));
    }
}