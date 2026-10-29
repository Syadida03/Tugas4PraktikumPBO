package TugasPraktikumPBO4;
import java.util.Scanner;
public class No3_GajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Kode Golongan (1-4): ");
        int golongan = input.nextInt();
        System.out.print("Masukkan Jumlah Anak: ");
        int jumlahAnak = input.nextInt();
        
        double gajiPokok = 0;
        
        if (golongan == 1) {
            gajiPokok = 1200000;
        } else if (golongan == 2) {
            gajiPokok = 1500000;
        } else if (golongan == 3) {
            gajiPokok = 1750000;
        } else if (golongan == 4) {
            gajiPokok = 2000000;
        }
        
        double tunjanganPasangan = 0.10 * gajiPokok;
        double tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;
        double totalTunjangan = tunjanganPasangan + tunjanganAnak;
        double gajiBersih = gajiPokok + totalTunjangan;
        
        System.out.println("\n--- Rincian Gaji ---");
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
        System.out.println("Tunjangan Pasangan: Rp " + tunjanganPasangan);
        System.out.println("Tunjangan Anak: Rp " + tunjanganAnak);
        System.out.println("Gaji Bersih: Rp " + gajiBersih);
    }
}
