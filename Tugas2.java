import java.util.Scanner;

public class Tugas2 {
    static int hitungPenjumlahan(int i) {
        if (i == 0) {
            return 0; 
        } else {
            return i + hitungPenjumlahan(i - 1); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan f: ");
        int f = sc.nextInt();

        int hasil = hitungPenjumlahan(f);

        System.out.println("Penjumlahan bilangan dari 1 sampai " + f + " adalah: " + hasil);
    }
}
