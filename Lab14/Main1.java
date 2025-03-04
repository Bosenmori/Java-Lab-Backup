import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.printf("Input Number : ");
            int number = Integer.parseInt(input.nextLine());
            input.close();
            System.out.println("Summation = " + Sum(number));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int Sum(int num) {
        if (num <= 9) {
            return num;
        } else
            return Sum(num / 10) + num % 10;
    }
}
