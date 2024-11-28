import java.util.Scanner;
public class Percobaan2 {
    
    static String deret = "";

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            deret += "1"; 
            return 1;
        } else {
            if (deret.isEmpty()) {
                deret += x; // Menambahkan bilangan pertama ke deret
            } else {
                deret += "x" + x; // Menambahkan pengali berikutnya
            }
            return x * hitungPangkat(x, y - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = sc.nextInt();

        deret = " "; 
        int hasil = hitungPangkat(bilangan, pangkat);

        
        System.out.println(deret + " = " + hasil);
    }
}
