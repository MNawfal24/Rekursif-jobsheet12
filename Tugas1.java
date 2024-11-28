import java.util.Scanner;

public class Tugas1 {

    
    static void Rekursif(int n) {
        if (n < 0) {
            return; 
        }
        System.out.print(n + " "); 
        Rekursif(n - 1); 
    }

    
    static void Iteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan n: ");
        int n = sc.nextInt();

        System.out.print("Menggunakan fungsi rekursif:");
        Rekursif(n);

        System.out.print("Menggunakan fungsi iteratif:");
        Iteratif(n);
    }
}
