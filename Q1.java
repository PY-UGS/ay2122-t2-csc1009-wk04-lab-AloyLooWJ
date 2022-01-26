import java.util.Scanner;

public class Q1 {
    public static void main(String[] args)
    {
        BMI UserA = new BMI();
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.println("Enter height in inches: ");
        double height = input2.nextDouble();
        input.close();
        input2.close();

        UserA.setWeight(weight);
        UserA.setHeight(height);
        double userBMI = UserA.getBMI();
        String userCat = UserA.getCat();

        System.out.println("BMI is " + userBMI);
        System.out.println(userCat);
    }
}
