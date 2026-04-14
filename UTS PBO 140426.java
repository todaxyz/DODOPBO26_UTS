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
