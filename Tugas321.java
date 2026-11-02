import java.util.Scanner;

public class Tugas321 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        int nomorToko = 1, totalBarangSeluruhToko = 0, tokoTerbanyak = 0, barangTerbanyak = -1;

        while (nomorToko <= jumlahToko) {
            System.out.println("Toko " + nomorToko);
            System.out.print("Masukkan jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();

            int totalBarangToko = 0;
            int i = 1;

            while (i <= jumlahPelanggan) {
                System.out.print("Jumlah barang pelanggan " + i + ": ");
                int jumlahBarang = sc.nextInt();
                totalBarangToko += jumlahBarang;
                i++;
            }

            System.out.println("Toko " + nomorToko + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);
            totalBarangSeluruhToko += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = nomorToko;
            }

            nomorToko++;
        }

        System.out.println();
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        sc.close();
    }
}
