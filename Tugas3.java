public class Tugas3{

    // Fungsi rekursif untuk menghitung jumlah pasangan marmut
    static int hitungPasangan(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1; // Base case: bulan 1 dan 2 memiliki 1 pasangan
        } else {
            return hitungPasangan(bulan - 1) + hitungPasangan(bulan - 2);
        }
    }

    public static void main(String[] args) {
        int bulan = 12; // Hitung hingga bulan ke-12
        System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulan + " adalah: " + hitungPasangan(bulan));
    }
}
