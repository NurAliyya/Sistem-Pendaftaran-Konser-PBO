/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Pendaftarankonser;

import java.util.ArrayList;
import java.util.Scanner;

public class Konser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> daftarPeserta = new ArrayList<>();
        int pilihan;

        do {
            System.out.println("\n=== Sistem Pendaftaran Konser ===");
            System.out.println("1. Daftar Peserta");
            System.out.println("2. Lihat Daftar Peserta");
            System.out.println("3. Hapus Peserta");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // ✅ bersihin enter

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama peserta: ");
                    String nama = scanner.nextLine(); // ✅ ini bener ambil nama
                    daftarPeserta.add(nama);
                    System.out.println("Yay! Peserta " + nama + " sudah resmi jadi peserta!");
                    break;

                case 2:
                    System.out.println("\n--- Daftar Peserta Konser ---");
                    if (daftarPeserta.isEmpty()) {
                        System.out.println("Huhu belum ada peserta yang terdaftar nih.");
                    } else {
                        for (int i = 0; i < daftarPeserta.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarPeserta.get(i));
                        }
                    }
                    break;

                case 3:
                    if (daftarPeserta.isEmpty()) {
                        System.out.println("Belum ada peserta yang bisa dihapus.");
                    } else {
                        System.out.println("\n--- Daftar Peserta ---");
                        for (int i = 0; i < daftarPeserta.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarPeserta.get(i));
                        }
                        System.out.print("Mau hapus yang nomor berapa?: ");
                        int nomor = scanner.nextInt();
                        scanner.nextLine(); // ✅ biar input berikutnya ga lompat
                        
                        if (nomor > 0 && nomor <= daftarPeserta.size()) {
                            String removed = daftarPeserta.remove(nomor - 1);
                            System.out.println("Peserta " + removed + " berhasil dihapus!");
                        } else {
                            System.out.println("Nomor peserta tidak valid.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih banyak! Sampai jumpa.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi yaa.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}
