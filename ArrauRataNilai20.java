import java.util.Scanner;

public class ArrauRataNilai20 {

    public static void main(String[] args) {
        Scanner scan20 = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scan20.nextInt();
        
        int[] nilaiMhs = new int[jumlahSiswa]; 
        double total = 0;
        double rata2;
        int hitungLulus = 0;
        int jumlahTidakLulus = 0; 

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilaiMhs[i] = scan20.nextInt();

            
            if (nilaiMhs[i] > 70) {
                hitungLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        rata2 = total / nilaiMhs.length;
        System.out.println("Rata-Rata nilai = " + rata2);
        System.out.println("Jumlah mahasiswa yang lulus = " + hitungLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus = " + jumlahTidakLulus);
    }
}
