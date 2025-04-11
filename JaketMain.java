import java.util.Scanner;

public class JaketMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Tampilan output
        System.out.println("===Jaket Jaket===");
        System.out.println("Jaket apa yang ingin Anda beli?");
        System.out.println("1. Jaket A");
        System.out.println("2. Jaket B");
        System.out.println("3. Jaket C");

        //Meminta memilih jaket
        System.out.print("Pilih jaket yang ingin dibeli: ");
        int pilihan = input.nextInt();

        //Meminta jumlah jaket yang ingin dibeli
        System.out.print("Berapa jaket yang ingin dibeli? ");
        int jumlah = input.nextInt();

        //Variabel untuk menyimpan jenis jaket yang dipilih
        String jenisJaket = "";

        switch (pilihan) {
            //Jika user memilih no 1, maka jenis jaket dikenali sebagai a pada class Jaket untuk menentukan harga
            //begitu juga dengan no 2 dan 3
            case 1:
                jenisJaket = "a";
                System.out.println("Anda membeli Jaket A sebanyak " + jumlah + " buah.");
                break;
            case 2:
                jenisJaket = "b";
                System.out.println("Anda membeli Jaket B sebanyak " + jumlah + " buah.");
                break;
            case 3:
                jenisJaket = "c";
                System.out.println("Anda membeli Jaket C sebanyak " + jumlah + " buah.");
                break;
            default:
            //Jika pilihan tidak sesuai maka ditampilkan pesan pilihan tidak valid
                System.out.println("Pilihan tidak valid.");
                return;
        }

        //Membuat objek dari class Jaket, dengan parameter jenis jaket dan jumlah jaket
        //Jadi nanti objek pembelian berisikan jenis dan jumlah jaket
        Jaket pembelian = new Jaket(jenisJaket, jumlah);
        // Memanggil method hitungTotalHarga() untuk menghitung harga keseluruhan
        int totalHarga = pembelian.hitungTotalHarga();

        //Menampilkan total harga
        System.out.println("Total harga pembelian jaket Anda adalah: Rp. " + totalHarga);
    }
}
