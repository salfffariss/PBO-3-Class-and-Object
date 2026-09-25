package id.ac.polban.pbo.kantin.model;

public class Pesanan {
    private static int nextNumber = 1;
    private int nomor;
    private Mahasiswa pemesan;
    private MenuItem item;
    private int jumlah;

    public Pesanan(Mahasiswa pemesan, MenuItem item, int jumlah) {
        this.nomor = nextNumber++; 
        this.pemesan = pemesan;
        this.item = item;
        this.jumlah = jumlah;
    }

    public boolean dapatDiproses() {
        return jumlah > 0 && item.isTersedia(); 
    }

    public int hitungTotal() {
        return item.getHarga() * jumlah;
    }

    public int getNomor() {
        return nomor;
    }

    public String ringkasan() {
        return "Pesanan #" + nomor + " | Pemesan: " + pemesan.getNama() + " (" + pemesan.getNim() + ") | Menu: " + item.getNama() + " x" + jumlah + " | Total: Rp" + hitungTotal();
    }
}
