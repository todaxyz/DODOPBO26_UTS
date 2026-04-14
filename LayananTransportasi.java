// File: LayananTransportasi.java

// 1. Kelas Induk Abstrak [cite: 414]
abstract class LayananTransportasi {
    protected String namaDriver;
    protected double jarak;
    protected double saldoUser;

    public LayananTransportasi(String namaDriver, double jarak, double saldoUser) {
        this.namaDriver = namaDriver;
        this.saldoUser = saldoUser;

        if (jarak <= 0) {
            this.jarak = 1.0;
            System.out.println("Warning: Input jarak tidak valid (<= 0). Disetel ke default 1.0 km.");
        } else {
            this.jarak = jarak;
        }
    }

    public abstract double hitungTarif();
    public abstract void prosesTransaksi(); 
}
class MadiunMotor extends LayananTransportasi {

    public MadiunMotor(String namaDriver, double jarak, double saldoUser) {
        super(namaDriver, jarak, saldoUser);
    }

    @Override
    public double hitungTarif() {
        double tarifDasar = this.jarak * 2500;
        double biayaAdmin = 3000 + (23 * 100);
        return tarifDasar + biayaAdmin;
    }

    @Override
    public void prosesTransaksi() {

        System.out.println("=== Transaksi oleh [DODO FANSYURI ANDRIAN] - [254311023] ===");
        
        double totalTarif = hitungTarif();
        
        if (this.saldoUser >= totalTarif) {
            this.saldoUser -= totalTarif;
            System.out.println("Nama Driver: " + this.namaDriver);
            System.out.println("Jarak: " + this.jarak + " km");
            System.out.println("Total Bayar: Rp " + totalTarif);
            System.out.println("Sisa Saldo: Rp " + this.saldoUser);
        } else {
            System.out.println("Gagal: Saldo tidak mencukupi untuk perjalanan ini!");
        }
    }
}

// 3. Kelas Turunan: MadiunMobil [cite: 420]
class MadiunMobil extends LayananTransportasi {

    public MadiunMobil(String namaDriver, double jarak, double saldoUser) {
        super(namaDriver, jarak, saldoUser);
    }

    @Override
    public double hitungTarif() {
        double tarifDasar = this.jarak * 5000;
        double biayaAdmin = 3000 + (23 * 100);
        return tarifDasar + biayaAdmin;
    }

    @Override
    public void prosesTransaksi() {
        System.out.println("=== Transaksi oleh [DODO FANSYURI ANDRIAN] - [254311023] ===");
        
        double totalTarif = hitungTarif();
        
        if (this.saldoUser >= totalTarif) {
            this.saldoUser -= totalTarif;
            System.out.println("Nama Driver: " + this.namaDriver);
            System.out.println("Jarak: " + this.jarak + " km");
            System.out.println("Total Bayar: Rp " + totalTarif);
            System.out.println("Sisa Saldo: Rp " + this.saldoUser);
        } else {
            System.out.println("Gagal: Saldo tidak mencukupi untuk perjalanan ini!");
        }
    }
}