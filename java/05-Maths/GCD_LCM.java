import java.util.Scanner;

// public class GCD_LCM {
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             System.out.print("Enter num1: ");
//             int num1 = sc.nextInt();

//             System.out.print("Enter num2: ");
//             int num2 = sc.nextInt();

//             int min = Math.min(num1, num2);
//             int hcf = 1;
//             for (int i = min; i >= 1; i--) {
//                 if (num1 % i == 0 && num2 % i == 0) {
//                     hcf = i;
//                     break;
//                 }
//             }
//             System.out.println("GCD (HCF): " + hcf);

//             int lcm = (num1 * num2) / hcf;
//             System.out.println("LCM: " + lcm);

//         } catch (Exception e) {
//             System.out.println("An error occurred: " + e.getMessage());
//         }
//     }
// }

public class GCD_LCM {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the First number: ");
            int n1 = sc.nextInt();

            System.out.print("Enter the Second number: ");
            int n2 = sc.nextInt();

            int o1 = n1;
            int o2 = n2;
            while (n1 % n2 != 0) {
                int rem = n1 % n2;
                n1 = n2;
                n2 = rem;
            }

            int gcd = n2;
            int lcm = (o1 * o2) / gcd;

            System.out.println("GCD: " + gcd);
            System.out.println("LCM: " + lcm);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}