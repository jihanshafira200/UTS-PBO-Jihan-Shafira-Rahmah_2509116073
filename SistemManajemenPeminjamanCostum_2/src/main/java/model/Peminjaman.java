/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class Peminjaman {
    
    private String idPeminjaman;
    private String idPelanggan;
    private String idKostum;
    private String tanggalPinjam;
    private String tanggalPengembalian;
    private String statusPeminjaman;
    
    public Peminjaman(
            String idPeminjaman,
            String idPelanggan,
            String idKostum,
            String tanggalPinjam,
            String tanggalPengembalian,
            String statusPeminjaman
    ){
        
        this.idPeminjaman = idPeminjaman;
        this.idPelanggan = idPelanggan;
        this.idKostum = idKostum;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalPengembalian = tanggalPengembalian;
        this.statusPeminjaman = statusPeminjaman;
    }
    
    public String getIdPeminjaman(){
        return idPeminjaman;
    }
    
    public void setIdPeminjaman(String idPeminjaman){
        this.idPeminjaman = idPeminjaman;
    }
    
    public String getIdPelanggan(){
        return idPelanggan;
    }
    
    public void setIdPelanggan(String idPelanggan){
        this.idPelanggan = idPelanggan;
    }
    
    public String getIdKostum(){
        return idKostum;
    }
    
    public void setIdKostum(String idKostum){
        this.idKostum = idKostum;
    }
    
    public String getTanggalPinjam(){
        return tanggalPinjam;
    }
    
    public void setTanggalPinjam(String tanggalPinjam){
        this.tanggalPinjam = tanggalPinjam;
    }
    
    public String getTanggalPengembalian(){
        return tanggalPengembalian;
    }
    
    public void setTanggalPengembalian(String tanggalPengembalian){
        this.tanggalPengembalian = tanggalPengembalian;
    }
    
    public String getStatusPeminjaman(){
        return statusPeminjaman;
    }
        
    public void setStatusPeminjaman(String statusPeminjaman){
        this.statusPeminjaman = statusPeminjaman;
    }
    
    public void tampilData(){

        System.out.println("ID Peminjaman : " + idPeminjaman);
        System.out.println("ID Pelanggan : " + idPelanggan);
        System.out.println("ID Kostum : " + idKostum);
        System.out.println("Tanggal Pinjam : " + tanggalPinjam);
        System.out.println("Tanggal Pengembalian : " + tanggalPengembalian);
        System.out.println("Status Peminjaman : " + statusPeminjaman);
        
    }
  
}
