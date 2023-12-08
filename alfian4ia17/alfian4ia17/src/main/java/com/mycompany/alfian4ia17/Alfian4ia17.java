package com.mycompany.alfian4ia17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alfian4ia17 {

    public static void main(String[] args) {
        List<PegawaiBaru> daftarPegawai = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Tambah Data Pegawai Baru (y/n): ");
            String jawaban = input.nextLine();

            if (jawaban.equalsIgnoreCase("n")) {
                break;
            }

            System.out.print("Nama: ");
            String nama = input.nextLine();

            System.out.print("NIP: ");
            int nip = input.nextInt();
            input.nextLine();

            System.out.print("Umur: ");
            int umur = input.nextInt();
            input.nextLine();

            PegawaiBaru pegawai = new PegawaiBaru(nama, nip, umur);
            daftarPegawai.add(pegawai);
        }

        System.out.println("Daftar Pegawai:");
        for (PegawaiBaru pegawai : daftarPegawai) {
            System.out.println(pegawai);
        }
    }
}
