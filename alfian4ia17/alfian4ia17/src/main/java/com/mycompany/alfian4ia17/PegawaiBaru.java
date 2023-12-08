package com.mycompany.alfian4ia17;

public class PegawaiBaru {
    private final String nama;
    private final int nip;
    private final int umur;
   
    public PegawaiBaru(String nama, int nip, int umur) {
        this.nama = nama;
        this.nip = nip;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public int getNip() {
        return nip;
    }

    public int getUmur() {
        return umur;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", NIP: " + nip + ", Umur: " + umur;
    }
}
