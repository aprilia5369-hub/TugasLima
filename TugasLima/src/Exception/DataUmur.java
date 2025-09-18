/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exception;

/**
 *
 * @author ACER
 */
class PenyesuaianFormat extends Exception {

    public PenyesuaianFormat (String umur) {
        super(umur);
    }
}

public class DataUmur {

    public static void validasi(String umurInput)
            throws PenyesuaianFormat {
        try {
            int umur = Integer.parseInt(umurInput);
            if (umur < 0) {
                throw new PenyesuaianFormat("Umur harus berupa angka positif.");
            }
            System.out.println("Umur Nasabah : " + umur);
            System.out.println("Valid");
        } catch (NumberFormatException e) {
            throw new PenyesuaianFormat("Umur Nasabah : " + umurInput + " Tidak Valid");
        }
    }

    public static void main(String[] args) {
        try {
            validasi("dua puluh");          
        } catch (PenyesuaianFormat e) {
            System.out.println(e.getMessage());
        }
    }
}
