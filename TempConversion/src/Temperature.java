import java.util.Scanner;
public class Temperature {

    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       double temp;
       while (true){
           System.out.println("Choose the conversion type");
           System.out.println("-----------------------------------");
           System.out.println("1.Celsius to Fahrenheit");
           System.out.println("2.Fahrenheit to Celsius ");
           System.out.println("3.Celsius to Kelvin");
           System.out.println("4.Kelvin to Celsius");
           System.out.println("5.Kelvin to Fahrenheit");
           System.out.println("6.Fahrenheit to Kelvin");
           System.out.println("7.Exit");
           int choice = in.nextInt();

           switch (choice) {
               case 1 -> {
                   System.out.println("Enter the celsius temperature");
                   temp = in.nextDouble();
                   double Fh = (temp * 9 / 5) + 32;
                   System.out.println(temp + " converted to " + Fh);
                   System.out.println("-----------------------------------");
                   System.exit(0);
               }
               case 2 -> {
                   System.out.println("Enter the fahrenheit temperature");
                   temp = in.nextDouble();
                   double Cl = (temp - 32) * 5 / 9;
                   System.out.println(temp + " converted to " + Cl);
                   System.out.println("-----------------------------------");
                   System.exit(0);
               }
               case 3 -> {
                   System.out.println("Enter the celsius temperature");
                   temp = in.nextDouble();
                   double Ck = temp + 273.15;
                   System.out.println(temp + " converted to " + Ck);
                   System.out.println("-----------------------------------");
                   System.exit(0);
               }
               case 4 -> {
                   System.out.println("Enter the kelvin temperature");
                   temp = in.nextDouble();
                   double Kc = temp - 273.15;
                   System.out.println(temp + " converted to " + Kc);
                   System.out.println("-----------------------------------");
                   System.exit(0);
               }
               case 5 -> {
                   System.out.println("Enter the kelvin temperature");
                   temp = in.nextDouble();
                   double Kf = (temp - 273.15) * 9/5 + 32;
                   System.out.println(temp + " converted to " + Kf);
                   System.out.println("-----------------------------------");
                   System.exit(0);
               }
               case 6 ->{
                   System.out.println("Enter the Fahrenheit temperature");
                   temp = in.nextDouble();
                   double Fk = (temp -32) *5/9 +273.15;
                   System.out.println(temp + " converted to " + Fk);
                   System.out.println("-----------------------------------");
                   System.exit(0);
               }
               case 7 -> System.exit(0);
               default -> System.out.println("Invalid");
           }
        }
    }
}
