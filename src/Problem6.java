import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem6 { 
    public static int calculateAverage(String [] scores){
        int sum = 0;
        for(String score:scores){
            sum += Integer.parseInt(score);  
        }
        return sum / scores.length;
    }
    public static char calculateGrade(int score){
        if(score>=90){
            return 'A';
        }
        if (score>=80){
            return 'B';
        }
        if (score>=70){
            return'C';
        }
        if(score>=60){
            return 'D';
        }
        return 'F';

    } 
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("C:\\Users\\matth\\Downloads\\java.txt"));
            while(s.hasNextLine()){
                String line=s.nextLine();
                String[] terms = line.split(" ",2);
                String studentName = terms[0];
                String[] studentScores = terms[1].split(" ");
                System.out.println(calculateAverage(studentScores));
                System.out.printf("%s Grade: %s\n",studentName,calculateGrade(calculateAverage(studentScores))); 
            }
            s.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
