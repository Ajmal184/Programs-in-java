import java.util.Scanner;
public class Multiplication{

    public void multi() {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the multiplication Table");
        int mul = num.nextInt();
        System.out.println("Enter the limit");
        int n = num.nextInt();

        for (int i = 1; i <=n; i++) {
            int result = i * mul;
            System.out.println(i + " * " + mul + " = " + result);
        }

    }

    public static void main(String[] args){

        Multiplication res = new Multiplication();
        res.multi();
    }
}
