/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class Costum extends Data {
    
    private String idKostum;
    private String kategori;
    private int ukuran;
    private double hargaSewa;
    
    public Costum(
        String idKostum,
        String nama,
        String kategori,
        int ukuran,
        double hargaSewa
     
    ){
        
        super(nama);
        
        this.idKostum = idKostum;
        this.kategori = kategori;
        this.ukuran = ukuran;
        this.hargaSewa = hargaSewa;
        
    }
    
    public String getIdKostum(){
        return idKostum;
    }
    
    public void setIdKostum(String idKostum){
        this.idKostum = idKostum;
    }
    
    public String getKategori(){
        return kategori;
    }
    
    public void setKategori(String kategori){
        this.kategori = kategori;
    }
    
    public int getUkuran(){
        return ukuran;
    }
    
    public void setUkuran(int ukuran){
        this.ukuran = ukuran; 
    }
    
    public double getHargaSewa(){
        return hargaSewa;
    }
    
    public void setHargaSewa(double hargaSewa){
        if(hargaSewa > 0){
            this.hargaSewa = hargaSewa;
        }
        
        else{
            System.out.println("Harga sewa tidak valid");
        }
    }
    
    @Override
    public void tampilData(){
        System.out.println("ID Kostum : " + idKostum);
        System.out.println("Nama kostum : " + nama);
        System.out.println("Kategori : " + kategori);
        System.out.println("Ukuran : " + ukuran);
        System.out.println("Harga Sewa : " + hargaSewa);
    }

    
}
