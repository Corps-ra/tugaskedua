// tugas 2.14
// Muhammad Ramadhan Althauri 
// 09021382530163

package tugas2;
import java.util.Scanner;

public class Ramadhan214 {
 public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.println("Angka yang harus di masukan: 95.5 50");
    System.out.print("Masukan berat dan tinggi: ");
    double weight = inp.nextDouble();
    double height = inp.nextDouble();
    double rumus1 = weight * 0.45359237;
    double rumus2 = height * 0.0254;
     double bmi = rumus1 / (rumus2 * rumus2);
     System.out.println("BMI is: "+ bmi);
 }   
}
