package Uts;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah mata kuliah: ");
        int jumlahMK = input.nextInt();
        input.nextLine();

        MataKuliah[] mk = new MataKuliah[jumlahMK];
        int totalSKS = 0;
        double totalMutu = 0;

        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("\nMata Kuliah Ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            String nama = input.nextLine();

            System.out.print("Jumlah SKS: ");
            int sks = input.nextInt();
            input.nextLine();

            System.out.print("Nilai Huruf (A, B+, B, dll): ");
            String nilai = input.nextLine();

            mk[i] = new MataKuliah(nama, sks, nilai);
            totalSKS += sks;
            totalMutu += mk[i].daftarNilai();
        }

        double ips = (totalSKS == 0) ? 0 : totalMutu / totalSKS;

        System.out.println("\n***** HASIL PERHITUNGAN IPS *****");
        System.out.println("Total SKS        : " + totalSKS);
        System.out.println("Total Nilai Mutu : " + totalMutu);
        System.out.println("IPS Semester     : " + ips);

        input.close();
    }
}
