 import java.util.Scanner;

public class homework01 {

    public static void main(String args[]) {

        int num1, num2;
        int sum;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();


        if ((num1 + num2) > 200) {
            System.out.println("The sum is " + (num1 + num2) + "*");
        } else {
            System.out.println("The sum is " + (num1 + num2));

        } if ((num1 + num2) < 1000){System.out.println("The sum is " + (num1 +num2) + "~");}
    }

}