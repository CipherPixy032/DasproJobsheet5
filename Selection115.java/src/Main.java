import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        System.out.println("Input the number: ");
        int number = input05.nextInt();
        if (number % 2 == 0) {
        System.out.println(number + " is an even number!");
    }else{
            System.out.println(number + " is an odd number!");
        }
    }
}