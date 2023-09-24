import java.util.Scanner;

public class project_task_04 {
    // Calculater
    public static void main(String[] args) {
        Calculater();
    }

    public static void Calculater() {
        Scanner sc = new Scanner(System.in);
        double ans = 0;
        while (true) {
            System.out.println("Enter any number afer put a operator(+,-,*,/,%) then put the other number.\n eg.for sum --> 7+3 .");
            double a = sc.nextDouble();
            String str = sc.next();
            double b = sc.nextDouble();

            switch (str) {
                case "+":
                    ans = a + b;
                    System.out.println(ans);
                    break;
                case "-":
                    ans = a - b;
                    ;
                    System.out.println(ans);
                    break;
                case "*":
                    ans = a * b;
                    System.out.println(ans);
                    break;
                case "/":
                    ans = a / b;
                    System.out.println(ans);
                    break;
                case "%":
                    ans = a % b;
                    System.out.println(ans);
                    break;

                default:
                    System.out.println("Error");
                    break;
            }
            System.out.println("for exit enter = otherwise for continue enter any key and it for new values.");
            char st = sc.next().charAt(0);
            if (st == '=') {
                return ;
            }
        }
    }
}