public class Duitku {
    String nama;
    String nomorHp;
    double saldo;

    public Duitku(String nama, String nomorHp) {
        this.nama = nama;
        this.nomorHp = nomorHp;
        this.saldo = 0.0;
        System.out.println("Akun dibuat, Pelanggan: " + this.nama + " | Saldo: Rp " + this.saldo);
    }

    public void isiDana(double setoran) {
        if (setoran < 10000) {
            System.out.println("Setoran ditolak! Minimum setoran adalah Rp 10.000.");
        } else {
            this.saldo += setoran;
            System.out.println("Resi DuitKu: Setoran Rp " + setoran + " berhasil, saldo Anda sekarang: Rp " + this.saldo);
        }
    }

    public void lunasiTagihan(double tagihan) {
        if (this.saldo >= tagihan) {
            this.saldo -= tagihan;
            System.out.println("BERHASIL: Tagihan Rp " + tagihan + " lunas. Sisa saldo: Rp " + this.saldo);
        } else {
            System.out.println("GAGAL: Saldo tidak cukup untuk tagihan Rp " + tagihan + ". Saldo saat ini: Rp " + this.saldo);
        }
    }
    public void tampilkanSisaUang() {
        System.out.println("Sisa uang " + this.nama + " di sistem: Rp " + this.saldo);
    }
}