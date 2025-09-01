// soal nomor 2.20
// Muhammad Ramadhan Althauri 
// 09021382530163

package tugas2;
import java.util.Scanner;
public class Ramadhan220 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Angka yang harus di masukan: 1000 3.5");
        System.out.print("masukan balance dan intrest rate: ");
        double balance = inp.nextDouble();
        double rate = inp.nextDouble();
        double rumus = balance * (rate / 1200);
        System.out.println("The intrest is " + rumus);
    }
}