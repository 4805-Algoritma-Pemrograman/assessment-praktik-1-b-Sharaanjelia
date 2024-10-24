
improt.java.util.scanner;

public class Nomor1{
    public static void main(String[] args){
     Scanner scnaner = new Scanner(system.int)

        // Inputkan total penjualan salesman
        double penjualan1 = 4000000;
        double penjualan2 = 700000;

        // Hitung komisi untuk masing-masing penjualan
        double komisi1 = hitungKomisi(penjualan1);
        double komisi2 = hitungKomisi(penjualan2);

        // Tampilkan hasil
        System.out.println("Total penjualan salesman: " + penjualan1);
        System.out.println("Komisi yang didapatkan = " + komisi1);
        System.out.println();
        System.out.println("Total penjualan salesman : " + penjualan2);
        System.out.println("Komisi yang didapatkan = " + komisi2);
    }

    public static double hitungKomisi(double penjualan) {
        double komisi;
        if (penjualan <= 500000) {
            komisi = penjualan * 0.10;
        } else {
            double komisiPertama = 500000 * 0.10;
            double komisiSisa = (penjualan - 500000) * 0.15;
            komisi = komisiPertama + komisiSisa;
        }
        return komisi;
    }
}
