import java.util.Scanner;

public class Sum_of_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int N = sc.nextInt();
        int sum = 0;

        for (int i = 0; i <= N; i++) {
            sum = sum + (i * i);
        }

        System.out.println("Sum of square Number is : " + sum);
        sc.close();
    }
}