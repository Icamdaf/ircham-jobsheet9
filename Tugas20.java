import java.util.Scanner;

public class Tugas20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah elemen array
        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = scanner.nextInt();

        // Membuat array dengan panjang sesuai jumlah elemen
        int[] array = new int[jumlahElemen];

        // Input nilai untuk setiap elemen
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan nilai untuk elemen ke-" + i + ": ");
            array[i] = scanner.nextInt();
        }

        // Inisialisasi nilai tertinggi, nilai terendah, dan total
        int nilaiTertinggi = array[0];
        int nilaiTerendah = array[0];
        int total = array[0];

        // Menghitung nilai tertinggi, nilai terendah, dan total
        for (int i = 1; i < jumlahElemen; i++) {
            if (array[i] > nilaiTertinggi) {
                nilaiTertinggi = array[i];
            }
            if (array[i] < nilaiTerendah) {
                nilaiTerendah = array[i];
            }
            total += array[i];
        }

        // Menghitung rata-rata
        double rataRata = (double) total / jumlahElemen;

        // Menampilkan hasil
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        System.out.println("Rata-rata: " + rataRata);
    }
}
