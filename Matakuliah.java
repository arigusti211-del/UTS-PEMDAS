public class MataKuliah{

    String MK;
    int sks;
    String nilaiHuruf;


    MataKuliah(String MK, int sks, String nilaiHuruf) {
        this.MK = MK;
        this.sks = sks;
        this.nilaiHuruf = nilaiHuruf.toUpperCase();
    }
    double daftarNilai() {
        if (nilaiHuruf.equals("A")) return 4.0;
        else if (nilaiHuruf.equals("A-")) return 3.7;
        else if (nilaiHuruf.equals("B+")) return 3.3;
        else if (nilaiHuruf.equals("B")) return 3.0;
        else if (nilaiHuruf.equals("B-")) return 2.7;
        else if (nilaiHuruf.equals("C+")) return 2.3;
        else if (nilaiHuruf.equals("C")) return 2.0;
        else if (nilaiHuruf.equals("D")) return 1.0;
        else return 0.0;
    }

    // Method hitung mutu
    double hitungSks() {
        return daftarNilai() * sks;
    }
}
