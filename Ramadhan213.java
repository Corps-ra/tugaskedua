// soal no 2.13
// Muhammad Ramadhan Althauri 
// 09021382530163
package tugas2;
import java.util.Scanner;

public class Ramadhan213 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");

        double monthlySaving = inp.nextDouble();
        double monthlyInterest = 0.00417;
        int bulan = 6;
        double accountValue = 0;

        for (int i = 1; i <= bulan; i++) {
           accountValue  = (monthlySaving + accountValue) * (1 + monthlyInterest);
        } 

        System.out.println("After the sixth month, the account value is $" + accountValue);


    }
}
