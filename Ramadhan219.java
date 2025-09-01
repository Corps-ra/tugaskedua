// soal nomor 2.19
// Muhammad Ramadhan Althauri 
// 09021382530163

package tugas2;
import java.util.Scanner;
public class Ramadhan219 {
 public static void main(String[] args) {
   Scanner inp = new Scanner(System.in);
   System.out.println("nilai yang harus di masukan 1.5 dan -3.4");
   System.out.print("masukan nilai x1 dan y1: ");
   double x1 = inp.nextDouble();
   double y1 = inp.nextDouble();
   System.out.println("nilai yang harus di masukan 4 dan 5");
   System.out.print("masukan nilai x2 dan y2: ");
   double x2 = inp.nextDouble(); 
   double y2 = inp.nextDouble();
    double rumus = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);
    System.out.println("The distance between the two points is " + rumus);
 }   
}
