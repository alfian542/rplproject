package com.mycompany.alfian4ia17;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControllerPegawai {
    ArrayList<PegawaiBaru> ArrayData;
    DefaultTableModel tablelist;

    public ControllerPegawai() {
        ArrayData = new ArrayList<PegawaiBaru>();
    }

    public void InsertData(String namapg, int nip, int umurpg) {
        PegawaiBaru pegawai = new PegawaiBaru(namapg, nip, umurpg);
        ArrayData.add(pegawai);
    }

    public DefaultTableModel showData() {
    String[] kolom = {"Nama Pegawai", "NIP", "Umur"};
    Object[][] objData = new Object[ArrayData.size()][3];
    int i = 0;

        for (PegawaiBaru n : ArrayData) {
        String[] arrData = {n.getNama(), String.valueOf(n.getNip()), String.valueOf(n.getUmur())};
        objData[i] = arrData;
        i++;
        }

        tablelist = new DefaultTableModel(objData, kolom) {
        @Override
        public boolean isCellEditable(int rowIndex, int colIndex) {
            return false;
            }
        };
        return tablelist;
    }
}
