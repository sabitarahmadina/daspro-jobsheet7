import java.util.Scanner;

public class Tugas222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenisKendaraan;
        int lamaParkir;
        int tarif;
        int pembayaran;
        int totalPembayaran = 0;

        while (true) {
            System.out.println("\n===== PARKIR KENDARAAN =====");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Selesai");
            System.out.print("Pilih jenis kendaraan: ");

            jenisKendaraan = sc.nextInt();

            if (jenisKendaraan == 0) {
                break;
            }

            if (jenisKendaraan == 1) {
                tarif = 3000;
            } else if (jenisKendaraan == 2) {
                tarif = 2000;
            } else {
                System.out.println("Jenis kendaraan tidak valid!");
                continue;
            }

            System.out.print("Masukkan lama parkir (jam): ");
            lamaParkir = sc.nextInt();

            if (lamaParkir < 0) {
                System.out.println("Lama parkir tidak valid!");
                continue;
            }

            pembayaran = tarif * lamaParkir;
            totalPembayaran += pembayaran;

            System.out.println("Tarif per jam: Rp" + tarif);
            System.out.println("Lama parkir: " + lamaParkir + " jam");
            System.out.println("Pembayaran: Rp" + pembayaran);
        }

        System.out.println("\n===== TOTAL PEMBAYARAN PARKIR =====");
        System.out.println("Total pembayaran: Rp" + totalPembayaran);

        sc.close();
    }
}
