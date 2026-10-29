package TugasPraktikumPBO4;
import java.util.Scanner;
public class No6_Kasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Apakah memiliki kartu member? (y/t): ");
        char member = input.next().charAt(0);
        
        System.out.print("Masukkan Total Belanja: Rp ");
        double totalBelanja = input.nextDouble();
        
        double diskon = 0;
        
        if (member == 'y' || member == 'Y') {
            if (totalBelanja > 500000) {
                diskon = 50000;
            } else if (totalBelanja > 100000) {
                diskon = 15000;
            }
        } else {
            if (totalBelanja > 100000) {
                diskon = 10000;
            }
        }
        
        double totalBayar = totalBelanja - diskon;
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Total yang Harus Dibayar: Rp " + totalBayar);
        
        System.out.print("Masukkan Uang Pembayaran: Rp ");
        double uangBayar = input.nextDouble();
        
        double kembalian = uangBayar - totalBayar;
        if (kembalian >= 0) {
            System.out.println("Kembalian: Rp " + kembalian);
        } else {
            System.out.println("Uang pembayaran kurang!");
        }
    }
}
