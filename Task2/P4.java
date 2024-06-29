package Task2;

import java.util.Scanner;

public class P4 {
    public void p4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the coefficient a: ");
        double a = sc.nextDouble();

        System.out.print("Enter the coefficient b: ");
        double b = sc.nextDouble();

        System.out.print("Enter the coefficient c: ");
        double c = sc.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant) / 2 * a);
            double root2 = (-b - Math.sqrt(discriminant) / 2 * a);
            System.out.println("Two Roots are:" + root1 + "and:" + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println(root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println(
                    "Two Roots are:" + realPart + "+i" + imaginaryPart + "and" + realPart + "-i" + imaginaryPart);
        }

    }
}
