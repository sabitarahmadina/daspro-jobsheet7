import java.util.Scanner;

public class Tugas122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket;
        int totalTiket = 0;

        double totalHarga;
        double diskon;
        double totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid!");
                System.out.println("Silakan masukkan kembali.");
                continue;
            }

            totalHarga = jumlahTiket * hargaTiket;
            diskon = 0;

            if (jumlahTiket > 10) {
                diskon = totalHarga * 0.15;
            } else if (jumlahTiket > 4) {
                diskon = totalHarga * 0.10;
            }

            totalHarga = totalHarga - diskon;

            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;

            System.out.println("Jumlah tiket: " + jumlahTiket);
            System.out.println("Total harga: Rp" 
                    + (jumlahTiket * hargaTiket));
            System.out.println("Diskon: Rp" + diskon);
            System.out.println("Total pembayaran: Rp" + totalHarga);
            System.out.println();
        }

        System.out.println("===== LAPORAN PENJUALAN =====");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp" + totalPenjualan);

        sc.close();
    }   
}
