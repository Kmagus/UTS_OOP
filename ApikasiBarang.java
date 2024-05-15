package apikasibarang;
/**
 *
 * @author I GUSTI KOMANG AGUS PRAMANA
 * NIM: 2201010190
 * KELAS: L
 * TANGGAL: 7/5/2024
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class ApikasiBarang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CatatanBarang catatanBarang = new CatatanBarang(); 

        int pilihan;
        do {
            System.out.println("========== Aplikasi Catatan Barang ==========");
            System.out.println("1. Tambah Data Barang");
            System.out.println("2. Tampilkan Data Barang");
            System.out.println("3. Ubah Data Barang");
            System.out.println("4. Hapus Data Barang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            try {
                pilihan = scanner.nextInt();
                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan nama barang: ");
                        String namaBarang = scanner.next();
                        catatanBarang.inputData(namaBarang);
                        break;
                    case 2:
                        catatanBarang.tampilkanData();
                        break;
                    case 3:
                        System.out.print("Masukkan nama barang yang ingin diubah: ");
                        String namaUbah = scanner.next();
                        System.out.print("Masukkan nama barang baru: ");
                        String namaBaru = scanner.next();
                        catatanBarang.ubahData(namaUbah, namaBaru);
                        break;
                    case 4:
                        System.out.print("Masukkan nama barang yang ingin dihapus: ");
                        String namaHapus = scanner.next();
                        catatanBarang.hapusData(namaHapus);
                        break;
                    case 0:
                        System.out.println("Terima kasih!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Masukkan angka sebagai pilihan.");
                scanner.next(); 
                pilihan = -1; 
            }
        } while (pilihan != 0);
    }
}
