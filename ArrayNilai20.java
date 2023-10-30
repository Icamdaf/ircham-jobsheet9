import java.util.Scanner;
//muhammad ircham
public class ArrayNilai20 {

    public static void main(String[] args) {
    Scanner sc20 = new Scanner(System.in);
    int [] nilaiAkhir = new int [10];
    
    for (int i = 0; i < nilaiAkhir.length; i++) {
        System.out.print("Masukkan nilai akhir ke -"+i+" :");
        nilaiAkhir [i] = sc20.nextInt(); 
        if (nilaiAkhir[i] > 70){
            System.out.println("Mahasiswa ke-"+i+" lulus!");}
        else {
            System.out.println("Mahasiswa ke-"+i+" tidak lulus!");
        }
    }
        for (int i = 0; i < 10; i++) {   
        System.out.println("Nilai akhir ke-"+i+" adalah"+nilaiAkhir[i]);
        }
    }
    }
