import java.util.Scanner;

public class Tugas314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();
        while (jumlahToko < 1) {
            System.out.print("Minimal 1, ulangi: ");
            jumlahToko = sc.nextInt();
        }

        int totalSemua = 0;
        int barangTerbanyak = -1;
        int tokoTerbanyak = 0;

        for (int toko = 1; toko <= jumlahToko; toko++) {
            System.out.print("Toko " + toko + " - jumlah pelanggan: ");
            int pelanggan = sc.nextInt();
            while (pelanggan < 0) {
                System.out.print("Tidak boleh negatif, ulangi: ");
                pelanggan = sc.nextInt();
            }

            int totalBarangToko = 0;

            for (int p = 1; p <= pelanggan; p++) {
                System.out.print("  Pelanggan " + p + " - jumlah barang: ");
                int barang = sc.nextInt();
                while (barang < 0) {
                    System.out.print("  Tidak boleh negatif, ulangi: ");
                    barang = sc.nextInt();
                }
                totalBarangToko = totalBarangToko + barang;
            }

            totalSemua = totalSemua + totalBarangToko;

            System.out.println("Toko " + toko + " - pelanggan: " + pelanggan
                    + ", total barang: " + totalBarangToko);

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = toko;
            }
        }

        System.out.println("Total barang seluruh toko: " + totalSemua);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        sc.close();
    }
}