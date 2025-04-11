public class Jaket {
    //Menyimpan jenis dan jumlah jaket
    private String jenisJaket;
    private int jumlahJaket;

    //Menetapkan harga standar jaket dengan static final dimana static
    //dan final digunakan agar nilai tidak bisa diubah atau konstanta
    private static final int hargaJaketA = 100000;
    private static final int hargaJaketB = 125000;
    private static final int hargaJaketC = 175000;

    //Konstruktor dijalankan saat objek dibuat, mengisi nilai jenis dan jumlah jaket
    public Jaket(String jenisJaket, int jumlahJaket) {
        this.jenisJaket = jenisJaket;
        this.jumlahJaket = jumlahJaket;
    }

    //Mengambil jenis jaket
    public String getJenisJaket() {
        return jenisJaket;
    }

    //Mengambil jumlah jaekt
    public int getJumlahJaket() {
        return jumlahJaket;
    }

    //Method untuk menentukan harga satuan jaket
    public int getHargaJaket() {
        //Menggunakn Switch case berdasarkan jenis jaket
        switch (jenisJaket.toLowerCase()) {
            //Menggunakna operator ternary
            case "a":
            //Jika jumlah lebih dari 100 gunakan harga 95000, jikda tidak maka harganya normal
                return jumlahJaket > 100 ? 95000 : hargaJaketA;
            case "b":
            //Jika jumlah lebih dari 100 gunakan harga 120000, jika tidak maka harganya normal
                return jumlahJaket > 100 ? 120000 : hargaJaketB;
            case "c":
            //JikA jumlah lebih dari 100 gunakan harga 160000, jikda tidak maka harganya normal
                return jumlahJaket > 100 ? 160000 : hargaJaketC;
            default:
                return 0;
        }
    }

    //Method untuk menghitung total harga berdasarkan jumlah jaket dan harga satuannya
    public int hitungTotalHarga() {
        //total = jumlah * harga per jaket
        return jumlahJaket * getHargaJaket();
    }
}
