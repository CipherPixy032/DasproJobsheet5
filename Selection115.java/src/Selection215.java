import java.util.Scanner;

public class Selection215 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        System.out.println("Nilai uas       : ");
        float finalExam = input05.nextFloat();
        System.out.println("Nilai uts       : ");
        float midExam = input05.nextFloat();
        System.out.println("Nilai kuis      : ");
        float quiz = input05.nextFloat();
        System.out.println("Nilai tugas     : ");
        float assignment = input05.nextFloat();

        float total = (finalExam * 0.4F) + (midExam * 0.3F) + (quiz * 0.1F) + (assignment * 0.2F);
        String letterGrade;

        if (total > 80) {
            letterGrade = "A";
        } else if (total > 73) {
            letterGrade = "B+";
        } else if (total > 65) {
            letterGrade = "B";
        } else if (total > 60) {
            letterGrade = "C+";
        } else if (total > 50) {
            letterGrade = "C";
        } else if (total > 39) {
            letterGrade = "D";
        } else {
            letterGrade = "E";
        }

        String message = total < 65 ? "Retake" : "Pass";
        System.out.println("Final Grade = " + letterGrade + " and the decision is " + message);
    }
}
