/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan_5;

/**
 *
 * @author lenovo
 */
public class Koki extends Pegawai{

   
    @Override
    public  void menampilkan(){
        System.out.println("Nama : "+ nama);
        System.out.println("Id Pegawai : "+ id_pegawai);
        System.out.println("Gaji : "+ gaji);
    }
    public void Tugas(){
        System.out.println("Tugas : Memasak Makanan dan Membuat Minuman");
    }
    
}
