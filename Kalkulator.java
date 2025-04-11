import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Mmebuat objek dari class Perhitungan agar bisa menggunakn method non static
        Perhitungan hitung = new Perhitungan();
        //variabel ulang dengan nilai awal true maka selama loop masih bernilai true
        //maka program akan terus mengulang
        boolean ulang = true;

        while (ulang) {
            //Tampilan output
            System.out.println("=== Kalkulator ===");
            System.out.println("1. Hitung Penjumlahan");
            System.out.println("2. Hitung Pengurangan");
            System.out.println("3. Hitung Perkalian");
            System.out.println("4. Hitung Pembagian");
            System.out.println("5. Hitung Penyederhanaan pecahan");
            System.out.println("6. Keluar");
            System.out.print("Pilihan Anda: ");
            String pilihan = input.nextLine();

            //Jika menginput angka 6 maka akan keluar, keluar dari while loop
            if (pilihan.equals("6")) {
                break;
            }

            //Meminta input
            System.out.print("Masukkan angka pertama: ");
            double angka1 = input.nextDouble();
            System.out.print("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();
            input.nextLine();

            switch (pilihan) {
                //Memanggil method tambah dari objek hitung (objek dari class Perhitungan)
                case "1":
                    System.out.println("Hasil penjumlahan: " + hitung.tambah(angka1, angka2));
                    break;
                 //Memanggil method pengurangan dari objek hitung (objek dari class Perhitungan)
                case "2":
                    System.out.println("Hasil pengurangan: " + hitung.kurang(angka1, angka2));
                    break;
                 //Memanggil method perkalian dari objek hitung (objek dari class Perhitungan)
                case "3":
                    System.out.println("Hasil perkalian: " + hitung.kali(angka1, angka2));
                    break;
                 //Memanggil method pembagian dari objek hitung (objek dari class Perhitungan)
                case "4":
                    System.out.println("Hasil pembagian: " + hitung.bagi(angka1, angka2));
                    break;
                 //Memanggil method sederhana dari objek hitung (objek dari class Perhitungan)
                 //Angka doubah ke integer karena pecahan menggunakan bilangan bulat
                case "5":
                    System.out.println("Hasil penyederhanaan pecahan: " + hitung.sederhana((int) angka1, (int) angka2));
                    break;
                default:
                //Ketika user menginputkan pilihan yang tidak ada
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

            System.out.print("Apakah Anda ingin mengulangi? (ya/tidak): ");
            String jawaban = input.nextLine();

            //Mengecek jawaban user
            //Penggunaan equalsIgnoreCase adalah semua dianggap sama tidak memperhatikan huruf besar atau kecil
            if (jawaban.equalsIgnoreCase("tidak")) {
                ulang = false;
                System.out.println("Keluar dari program");
            //Menambah tada seru berarti bukan iya dan bukan tidak maka akan dianggap tidak valid 
            } else if (!jawaban.equalsIgnoreCase("ya")) {
                System.out.println("Jawaban tidak valid. Keluar dari program.");
                ulang = false;
            }
        }
    }
}
