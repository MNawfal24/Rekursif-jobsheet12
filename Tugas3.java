public class Tugas3{

   
    static int hitungPasangan(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1; 
        } else {
            return hitungPasangan(bulan - 1) + hitungPasangan(bulan - 2);
        }
    }

    public static void main(String[] args) {
        int bulan = 12; 
        System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulan + " adalah: " + hitungPasangan(bulan));
    }
}
