improt.java.util.scanner;

public class Nomor1{
    public static void main(String[] args){
     Scanner scnaner = new Scanner(system.int)

        // Input nilai penjualan
        System.out.print("Masukkan jumlah total  penjualan salesman: ");
        double totalPenjualan = scanner.nextDouble();

        // Variabel untuk menyimpan komisi
        double komisi; double total pembelian;

        // Hitung komisi berdasarkan ketentuan
        if (totalPenjualan <= 500000) {
            komisi = totalPenjualan * 0.10; // 10% untuk penjualan <= 500.000
        } else {
            double komisiPertama = 500000 * 0.10; // 10% untuk 500.000 pertama
            double sisaPenjualansales = totalPenjualan - 500000;
            double komisiSisa = sisaPenjualan * 0.15; // 15% untuk sisa penjualan
            komisi = komisiPertama + komisiSisa; // Total komisi
        }

        // Output hasil
        System.out.printf("Total penjualan salesman: %.0f\n", totalPenjualan);
        System.out.printf("Komisi yang didapatkan = %.1f\n", komisi);

        scanner.close();
    }
}

