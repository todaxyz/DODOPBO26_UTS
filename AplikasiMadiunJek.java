public class AplikasiMadiunJek {
    public static void main(String[] args) {
        LayananTransportasi[] daftarLayanan = new LayananTransportasi[2];
        daftarLayanan[0] = new MadiunMotor("Jiraiya", 6.5, 50000.0); 
        daftarLayanan[1] = new MadiunMobil("Kakashi", 15.0, 30000.0); 
      
        System.out.println("=== Tes Polymorphism ===\n");
        for (LayananTransportasi layanan : daftarLayanan) {
            layanan.prosesTransaksi();
            System.out.println("--------------------------------------------------");
        }
        
        System.out.println("=== 🏁 Pengujian Selesai 🏁 ===");
    }
}