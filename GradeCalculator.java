import java.util.Scanner;
public class GradeCalculator {

    private static String calculateGrade(double averageScore){
        if(averageScore >= 90)
        {
            return "A";
        }
        else if(averageScore >= 80)
        {
            return "B";
        }
        else if(averageScore >= 70)
        {
            return "C";
        }
        else if(averageScore >=60)
        {
            return "D";
        } 
        else if(averageScore >= 50)
        {
            return "E";
        }
        else{
            return "FAIL";
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //enter the student name
        System.out.println("Enter the Student name");
        String studentName=scanner.nextLine();

        //input the score of the subjects
        System.out.println("Enter the math score:");
        double mathScore=scanner.nextDouble();

        System.out.println("Enter the java score:");
        double javaScore=scanner.nextDouble();

        System.out.println("Enter the HTML Score:");
        double HTMLScore=scanner.nextDouble();

        System.out.println("Enter the CSS Score:");
        double CSSScore=scanner.nextDouble();

        //calculate average Score
        double averageScore=(mathScore + javaScore + HTMLScore +CSSScore)/4;

        //grade calculation
        String grade=calculateGrade(averageScore);

        //output
        System.out.println("Student Name is:"+studentName);
        System.out.println("Math Score:"+mathScore);
        System.out.println("Java Score:"+javaScore);
        System.out.println("HTMLScore :"+HTMLScore);
        System.out.println("CSS Score:"+CSSScore);
        System.out.println("Average Score:"+averageScore);
        System.out.println("Grade:"+grade);
        }
}
