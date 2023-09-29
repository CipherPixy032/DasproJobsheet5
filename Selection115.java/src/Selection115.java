import java.util.Scanner;

public class Selection115 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        System.out.println("Input the number: ");
        int number = input05.nextInt();
        String result = (number % 2 == 0) ? number + " is an even number!" : number + " is an odd number!";
        System.out.println(result);
    }
}
