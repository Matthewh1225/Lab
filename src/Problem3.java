import java.util.HashMap;


public class Problem3 {
    float grade;
    
    public Float getGrade(int score){

        HashMap<Integer,Float> scores = new HashMap<>();

        int key=62;

        if (score < 60){
            System.out.println("0.0");
            return 0.0f;
        }
        else if (score >94){
            System.out.println("4.0");
            return 4.0f;
        }
        for (float j=0.7f ; j < 3.9f ; j+=0.1f){
            scores.put(key, j);
            key++;
        }
        grade = scores.get(score);
        System.out.printf("%.1f",grade);
        return grade;
    }
    public static void main(String[] args) {
        Problem3 p = new Problem3();
        p.getGrade(56);
     
       
    }
}