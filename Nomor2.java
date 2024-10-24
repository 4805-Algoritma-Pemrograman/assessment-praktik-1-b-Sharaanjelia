

public class Nomor2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        // Tarif dan biaya pelayanan
        int[] tarif = {50000, 40000, 30000}; 
        double[] biayaPelayananPersentase = {0.30, 0.20, 0.10}; 
        
        System.out.print("Masukkan jumlah pelanggan: ");
        int jumlahPelanggan = scanner.nextInt();
        
        double totalPendapatan = 0;

        for (int i = 0; i < jumlahPelanggan; i++) {
            System.out.print("Masukkan jenis bungalow (1, 2, atau 3) untuk pelanggan " + (i + 1) + " : ");
            int jenisBungalow = scanner.nextInt() - 1; 
            
            System.out.print("Masukkan lama menginap (dalam malam): ");
            int lamaMenginap = scanner.nextInt();
            
            // Hitung biaya menginap
            double biayaMenginap = lamaMenginap * tarif[jenisBungalow];
            // Hitung biaya pelayanan
            double biayaPelayanan = biayaMenginap * biayaPelayananPersentase[jenisBungalow];
            // Hitung total biaya
            double totalBiaya = biayaMenginap + biayaPelayanan;
            
            // Tampilkan total biaya untuk pelanggan
            System.out.printf("Total biaya untuk pelanggan %d: Rp %.2f%n", (i + 1), totalBiaya);
            
            // Tambahkan ke total pendapatan
            totalPendapatan += totalBiaya;
        }
        
        // Tampilkan total pendapatan
        System.out.printf("Total pendapatan dari semua pelanggan: Rp %.2f%n", totalPendapatan);
        
        scanner.close();
    }
}
