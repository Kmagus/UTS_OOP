package apikasibarang;
/**
 *
 * @author I GUSTI KOMANG AGUS PRAMANA
 * NIM: 2201010190
 * KELAS: L
 * TANGGAL: 7/5/2024
 */
public class CatatanBarang {
    private String[] dataBarang;
    private int jumlahBarang;

    public CatatanBarang() {
        dataBarang = new String[10]; 
        jumlahBarang = 0; 
    }

    public void inputData(String namaBarang) {
        if (jumlahBarang < dataBarang.length) {
            dataBarang[jumlahBarang] = namaBarang;
            jumlahBarang++;
            System.out.println("Data berhasil disimpan.");
        } else {
            System.out.println("Maaf, ruang penyimpanan sudah penuh.");
        }
    }

    public void tampilkanData() {
        System.out.println("Daftar Barang:");
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println(dataBarang[i]);
        }
    }

    public void ubahData(String namaBarang, String namaBaru) {
        boolean found = false;
        for (int i = 0; i < jumlahBarang; i++) {
            if (dataBarang[i].equals(namaBarang)) {
                dataBarang[i] = namaBaru;
                System.out.println("Data berhasil diubah.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Barang tidak ditemukan.");
        }
    }

    public void hapusData(String namaBarang) {
        boolean found = false;
        for (int i = 0; i < jumlahBarang; i++) {
            if (dataBarang[i].equals(namaBarang)) {
                for (int j = i; j < jumlahBarang - 1; j++) {
                    dataBarang[j] = dataBarang[j + 1];
                }
                dataBarang[jumlahBarang - 1] = null;
                jumlahBarang--;
                System.out.println("Data berhasil dihapus.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Barang tidak ditemukan.");
        }
    }
}
