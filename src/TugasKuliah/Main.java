// Tugas Algoritma dan Pemrograman 1
// Nama  : Andi Muhammad Fauzan Isra
// NIM   : 105841111222
// Prodi : Informatika
// Kelas : 1-D

package TugasKuliah;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//  Menghitung Nilai Akhir Mahasiswa!!
        String nama, nim, jenjang, fakultas_pStudi, kelas, mKul;
        final double N_Hadir, N_Tugas, N_UTS, N_UAS, N_Akhir, N_RtRt, N_IP;
        double N_Tugas1, N_Tugas2, N_Tugas3;
        int J_Hadir;
        Scanner input = new Scanner(System.in);

        System.out.println("----------Nilai Akhir Mahasiswa----------");
        System.out.println("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.println("Masukkan NIM : ");
        nim = input.nextLine();
        System.out.println("Masukkan Jenjang : ");
        jenjang = input.nextLine();
        System.out.println("Masukkan Fakultas / Program Studi : ");
        fakultas_pStudi = input.nextLine();
        System.out.println("Masukkan Kelas : ");
        kelas = input.nextLine();
        System.out.println("Masukkan Mata Kuliah : ");
        mKul = input.nextLine();

        System.out.println("============================================================");
        System.out.println("Masukkan Jumlah Kehadiran /18 : ");
        J_Hadir = input.nextInt();
        System.out.println(J_Hadir +"/18");
        N_Hadir = (J_Hadir/18) *100;
        System.out.println("Nilai Kehadiran : " + N_Hadir);
        System.out.println("============================================================");

        System.out.println("Masukkan Nilai Tugas Pertama : ");
        N_Tugas1 = input.nextInt();
        System.out.println("Masukkan Nilai Tugas Kedua : ");
        N_Tugas2 = input.nextInt();
        System.out.println("Masukkan Nilai Tugas Ketiga : ");
        N_Tugas3 = input.nextInt();
        N_Tugas = (N_Tugas1 + N_Tugas2 + N_Tugas3) / 3;
        System.out.println("Total Nilai Seluruh Tugas : " + N_Tugas);
        System.out.println("============================================================");

        System.out.println("Masukkan Nilai UTS : ");
        N_UTS = input.nextInt();
        System.out.println("Masukkan Nilai UAS : ");
        N_UAS = input.nextInt();

        N_Akhir = (N_Hadir + N_Tugas + N_UTS + N_UAS);
        N_RtRt = (N_Hadir * 0.2 + N_Tugas * 0.2 + N_UTS * 0.3 + N_UAS * 0.3);
        N_IP = (N_Akhir) /100;

        System.out.println("============================================================");
        System.out.println("Kepada " + nama + " dengan NIM " + nim);
        System.out.println(jenjang + ", " + fakultas_pStudi + ", kelas " + kelas);
        System.out.println("Pada Mata Kuliah " + mKul);
        System.out.println("Memiliki nilai akhir " + N_Akhir + ", dengan IP " + N_IP + "0");
        System.out.println("Dan rata-rata nilai : " + N_RtRt);

        if (N_RtRt >= 85 && N_RtRt <= 100){
            System.out.println("Selamat, Nilai Anda A. Pertahankan!");
        } else if (N_RtRt >= 80 && N_RtRt <= 84){
            System.out.println("Selamat, Nilai Anda A-. Tingkatkan lagi ya!");
        } else if (N_RtRt >= 75 && N_RtRt <= 79) {
            System.out.println("Selamat, Nilai Anda B+. Tingkatkan lagi ya!");
        } else if (N_RtRt >= 70 && N_RtRt <= 74){
            System.out.println("Selamat, Nilai Anda B. Tingkatkan lagi ya!");
        } else if (N_RtRt >= 65 && N_RtRt <= 69) {
            System.out.println("Selamat, Nilai Anda B-. Tingkatkan lagi ya!");
        } else if (N_RtRt >= 60 && N_RtRt <= 64) {
            System.out.println("Mohon Maaf, Nilai Anda C+. Tingkatkan lagi ya!");
        } else if (N_RtRt >= 55 && N_RtRt <= 59){
            System.out.println("Mohon Maaf, Nilai Anda C. Tingkatkan lagi ya!");
        } else if (N_RtRt >= 50 && N_RtRt <= 54) {
            System.out.println("Mohon Maaf, Nilai Anda C-. Tingkatkan lagi ya!");
        } else if (N_RtRt >=0 && N_RtRt <50){
            System.out.println("Mohon Maaf, Nilai Anda E. Lebih di tingkatkan lagi ya!");
        }
        System.out.println("============================================================");
    }
}