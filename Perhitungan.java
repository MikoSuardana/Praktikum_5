public class Perhitungan {

    //Static method untuk penjumlahan 2 angka
    public static double tambah(double a, double b) {
        return a + b;
    }

    //Static method untuk pengurangan 2 angka
    public static double kurang(double a, double b) {
        return a - b;
    }

    //Non static method untuk perkalian 2 angak
    public double kali(double a, double b) {
        return a * b;
    }

    //Non static method untuk pembagian 2 angka
    public String bagi(double a, double b) {
        if (b == 0) { //Jika pembagianya 0 maka hasilnya tidak terdefinisi
            return "Pembagian dengan nol tidak terdefinisi.";
        }
        //Jika tida, kembalikan hasil pembagian dalam bentuk string
        return String.valueOf(a / b);
    }

    //Non static method untuk meneyederhanakan pecahan
    public String sederhana(int pembilang, int penyebut) {
        if (penyebut == 0) { //Penyebut tidak boleh 0
            return "Penyederhanaan tidak valid (penyebut nol).";
        }
        //Mencari faktor persekutuan terbesar
        int fpb = cariFPB(pembilang, penyebut);
        return (pembilang / fpb) + "/" + (penyebut / fpb);
    }

    //Method private untuk mencari FPB dengan algoritma Euclidean
    private int cariFPB(int a, int b) {
        //Perulangan terus berjalan sapai b bernilai 0
        while (b != 0) {
            int temp = b; //temp untuk menyimpan nilai b sementara
            b = a % b; //b menjadi sisa bagi antara a dan b
            a = temp; //a mengambil nilai b
        }
        //Mengembalikan nilai FPB dalam bentuk positif
        return Math.abs(a);
    }
}
