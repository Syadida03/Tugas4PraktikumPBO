package TugasPraktikumPBO4;
import java.util.Scanner;
public class No7_LuasBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Menu Hitung Luas Bangun Datar ===");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-layang");
        System.out.print("Pilih Menu (1-5): ");
        int menu = input.nextInt();
        
        switch (menu) {
            case 1:
                System.out.print("Masukkan Sisi: ");
                double s = input.nextDouble();
                System.out.println("Luas Persegi: " + (s * s));
                break;
            case 2:
                System.out.print("Masukkan Alas: ");
                double a = input.nextDouble();
                System.out.print("Masukkan Tinggi: ");
                double t = input.nextDouble();
                System.out.println("Luas Segitiga: " + (0.5 * a * t));
                break;
            case 3:
                System.out.print("Masukkan Jari-jari: ");
                double r = input.nextDouble();
                System.out.println("Luas Lingkaran: " + (Math.PI * r * r));
                break;
            case 4:
                System.out.print("Masukkan Sisi Sejajar A: ");
                double sa = input.nextDouble();
                System.out.print("Masukkan Sisi Sejajar B: ");
                double sb = input.nextDouble();
                System.out.print("Masukkan Tinggi: ");
                double tt = input.nextDouble();
                System.out.println("Luas Trapesium: " + (0.5 * (sa + sb) * tt));
                break;
            case 5:
                System.out.print("Masukkan Diagonal 1: ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan Diagonal 2: ");
                double d2 = input.nextDouble();
                System.out.println("Luas Layang-layang: " + (0.5 * d1 * d2));
                break;
            default:
                System.out.println("Pilihan menu tidak ada!");
        }
    }
}
