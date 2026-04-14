public abstract class LayananTransportasi {
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
}

public class MadiunMotor extends LayananTransportasi {
    public MadiunMotor(String namaDriver, double jarak, double saldoUser) {
    super(namaDriver, jarak, saldoUser);
    }

    @Override
    public double hitungTarif() {
    double biayaAdmin = 3000 + (23 * 100);
    double tarifDasar = this.jarak * 5000;
    return tarifDasar + biayaAdmin;
    }
}

public class MadiunMobil extends LayananTransportasi {
    public MadiunMobil(String namaDriver, double jarak, double saldoUser) {
    super(namaDriver, jarak, saldoUser);
    }

    @Override
    public double hitungTarif() {
    double tarifDasar = this.jarak * 5000;
    double biayaAdmin = 3000 + (23 * 100);
return tarifDasar + biayaAdmin;
    }
}