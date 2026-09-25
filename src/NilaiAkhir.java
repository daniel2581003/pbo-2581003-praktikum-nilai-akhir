import java.util.Scanner;

public class NilaiAkhir {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double BOBOT_PRAKTIKUM = 0.30;
            double BOBOT_TUGAS = 0.20;
            double BOBOT_MID = 0.20;
            double BOBOT_FINAL = 0.30;

            System.out.print("Nilai Praktikum : ");
            int nilaiPraktikum = input.nextInt();

            System.out.print("Nilai Tugas : ");
            int nilaiTugas = input.nextInt();

            System.out.print("Nilai MID : ");
            int nilaiMid = input.nextInt();

            System.out.print("Nilai Final : ");
            int nilaiFinal = input.nextInt();

            int nilaiAkhir = nilaiPraktikum * 30 / 100 + nilaiTugas * 20 / 100
                    + nilaiMid * 20 / 100 + nilaiFinal * 30 / 100;
            //Ketika menggunakan int maka hasilnya akan menjadi bilangan bulat,hasilnya 91

            System.out.print("Nilai Akhir : " + nilaiAkhir);

    }

}
