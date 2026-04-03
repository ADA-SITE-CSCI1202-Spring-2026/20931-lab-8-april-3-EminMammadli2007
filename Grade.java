import java.util.HashMap;
import java.util.Map;

public class Grade{
    public static void main(String[] args){

        HashMap<String, Double> students = new HashMap<>(); // string for names, double for gpas

        students.put("Emin", 3.8);
        students.put("John", 3.5);
        students.put("Tim", 3.9);
        students.put("Lisa", 3.2);
        students.put("Nick", 3.9);

        double maxGpa = Double.MIN_VALUE; // we start with the minimal value then work our way to the maximum value
        for(double gpa : students.values()){
            if(gpa > maxGpa){
                maxGpa = gpa;
            }
        }

        System.out.println("Highest GPA: " + maxGpa);
        System.out.println("Top student(s):");
        for(Map.Entry<String, Double> entry : students.entrySet()){
            if(entry.getValue() == maxGpa){
                System.out.println(entry.getKey()); // returns people with the highest gpa
            }
        }

        double sum = 0;
        for(double gpa : students.values()){
            sum += gpa;
        }
        double avg = sum / students.size();
        System.out.println("Average GPA: " + avg);

        int count = 0;
        for(double gpa : students.values()){
            if(gpa < avg){
                count++;
            }
        }
        System.out.println("Students below average: " + count);
    }
}