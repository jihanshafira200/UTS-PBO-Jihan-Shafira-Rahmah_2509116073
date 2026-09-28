/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class pelanggan extends Data{
    
    private String idPelanggan;
    private String nomorTelepon;
    private String alamat;
    
    public pelanggan(
       String idPelanggan,
       String nama,
       String nomorTelepon,
       String alamat
    ){
        super(nama);

        this.idPelanggan = idPelanggan;
        this.nomorTelepon = nomorTelepon;
        this.alamat = alamat;
    }
    
    public String getIdPelanggan(){
        return idPelanggan;
    }
    
    public void setIdPelanggan(String idPelanggan){
       this.idPelanggan = idPelanggan; 
    }
    
    public String getNomorTelepon(){
        return nomorTelepon;
    }
    
    public void setNomorTelepon(String nomorTelepon){
        this.nomorTelepon = nomorTelepon;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    @Override
    public void tampilData(){
        System.out.println("ID Pelanggan : " + idPelanggan);
        System.out.println("Nama : " + nama);
        System.out.println("Nomor Telepon : " + nomorTelepon);
        System.out.println("Alamat : " + alamat);
    }
    
    
}
