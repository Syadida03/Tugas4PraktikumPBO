package TugasPraktikumPBO4;
import java.util.Scanner;

public class No1_GanjillGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Bilangan: ");
        int bilangan = input.nextInt();
        
        if (bilangan % 2 == 0) {
            System.out.println("Bilangan Genap");
        } else {
            System.out.println("Bilangan Ganjil");
        }
    }
}
