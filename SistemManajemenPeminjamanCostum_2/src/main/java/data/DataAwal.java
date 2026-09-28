/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.ArrayList;
import model.Costum;
import model.pelanggan;
import model.Peminjaman;

/**
 *
 * @author LENOVO
 */
public class DataAwal {
    
    public static ArrayList<Costum> daftarCostum = new ArrayList<>();
    public static ArrayList<pelanggan> daftarPelanggan = new ArrayList<>();
    public static ArrayList<Peminjaman> daftarPeminjaman = new ArrayList<>();
    
    public static void isiDataAwal(){
        Costum costum1 = new Costum(
                "K001",
                "Iron Man",
                "Superhero",
                40,
                150000
        );
        
        pelanggan pelanggan1 = new pelanggan(
                "P001",
                "Andi",
                "08123456789",
                "Jakarta"
        );
        
        Peminjaman peminjaman1 = new Peminjaman(
                "PM001",
                "P001",
                "K001",
                "20-09-2026",
                "22-09-2026",
                "Dipinjam"
        );
        
        daftarCostum.add(costum1);
        daftarPelanggan.add(pelanggan1);
        daftarPeminjaman.add(peminjaman1);
    }
}
