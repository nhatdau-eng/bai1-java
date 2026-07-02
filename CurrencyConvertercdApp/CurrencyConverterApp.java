import java.util.Scanner;
public class CurrencyConverterApp {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        long rate = 23000L ; 
        System.out.print("Enter USD:");
        long usd = scanner.nextLong();
        long vnd = usd * rate; 

        System.out.println(usd +  "USD"  + vnd  +  "VND");

        scanner.close();
    }
}
