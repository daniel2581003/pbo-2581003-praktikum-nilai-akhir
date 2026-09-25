import java.util.Scanner;

public class NilaiAkhir {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double BOBOT_PRAKTIKUM = 0.30;
            double BOBOT_TUGAS = 0.20;
            double BOBOT_MID = 0.20;
            double BOBOT_FINAL = 0.30;

            System.out.print("Nilai Praktikum : ");
            double nilaiPraktikum = input.nextDouble();

            System.out.print("Nilai Tugas : ");
            double nilaiTugas = input.nextDouble();

            System.out.print("Nilai MID : ");
            double nilaiMid = input.nextDouble();

            System.out.print("Nilai Final : ");
            double nilaiFinal = input.nextDouble();

            double nilaiAkhir = nilaiPraktikum * BOBOT_PRAKTIKUM + nilaiTugas * BOBOT_TUGAS
                    + nilaiMid * BOBOT_MID + nilaiFinal * BOBOT_FINAL;
            //Ketika menggunakan int maka hasilnya akan menjadi bilangan bulat,hasilnya 79
            // Kenapa kurung tidak diperlukan karena Operator Precedence menentukan mana yang dikerjakan terlebih dahulu
            // Perkalian pasti akan mendahului Penjumlahan jadi dalam kasus ini tanda kurung tidak diperlukan

            System.out.println("");
            System.out.println("==== NILAI AKHIR =====");
            System.out.println("Praktikum : " + nilaiPraktikum + " (30%)");
            System.out.println("Tugas : " + nilaiTugas + " (20%)");
            System.out.println("MID : " + nilaiMid + " (20%)");
            System.out.println("Final : " + nilaiFinal + " (30%)");
            System.out.println("");
            System.out.println("Nilai Akhir : " + nilaiAkhir);


    }

}
