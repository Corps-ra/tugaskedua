// tugas nomor 2.21
// Muhammad Ramadhan Althauri 
// 09021382530163

package tugas2;
import java.util.Scanner;

public class Ramadhan221 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Angka yang harus di masukan: 1000 4.25 1");
        System.out.print("masukan jumlah investtasi: ");
        double investamt = inp.nextDouble();
        System.out.print("masukan persenan: ");
        double persenan = inp.nextDouble();
        System.out.print("masukan tahun: ");
        int tahun = inp.nextInt();
        double rumus = persenan / 1200;
        double rumus2 = investamt * Math.pow(1 + rumus, tahun * 12);
        System.out.println("Acumulated value is $" + rumus2);
    }
    
}
