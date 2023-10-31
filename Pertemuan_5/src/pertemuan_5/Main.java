/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan_5;

/**
 *
 * @author lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pegawai P = new Pegawai();
        P.menampilkan();
        
        manager m = new manager();
        m.nama = "Nuria";
        m.id_pegawai = 1;
        m.gaji = " 7 Juta";
        m.menampilkan();
        m.tugas();
        
        Koki K = new Koki();
        K.nama = "Wakhid";
        K.id_pegawai = 2;
        K.gaji = " 6 Juta";
        K.menampilkan();
        K.Tugas();
        
        pelayan pl = new pelayan();
        pl.nama = "Rahma";
        pl.id_pegawai = 3;
        pl.gaji = "5 Juta";
        pl.menampilkan();
        pl.tugas();
    }
    
}
