import java.util.Scanner;

public class PesanKafe06{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jmlPesanan = sc.nextInt();
        sc.nextLine(); 

        String[] namaPesanan = new String[jmlPesanan];
        double[] hargaPesanan = new double[jmlPesanan];
        double totalBiaya = 0;

        for (int i = 0; i < jmlPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga pesanan ke-" + (i + 1) + ": ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine(); 
            totalBiaya += hargaPesanan[i];
        }

        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println(namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }
        System.out.println("Total Biaya: Rp " + totalBiaya);
    }
}
