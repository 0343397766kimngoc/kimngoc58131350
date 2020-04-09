/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanVien {
    //khai báo các thuộc tính
    private String ten;
    private String tuoi;
    private String diachi;
    private double luong;
    private int tongsogiolam;
    NhanVien(){
        ten="Nguyễn Thị Kim Ngọc";
        tuoi="22";
        diachi="Ninh Hòa";
        luong=120000000;
        tongsogiolam=1120;
        
        
    }
    public NhanVien(String ten, String tuoi, String diachi, double luonng, int tonngsogiolam){
        this.ten=ten;
        this.tuoi=tuoi;
        this.diachi=diachi;
        this.luong=luong;
        this.tongsogiolam=tongsogiolam;
        
    }
    String getTen(){
         return ten;
    }
    void setTen(String ten){
         this.ten=ten;
    }
    String getTuoi(){
         return tuoi;
    }
    void setTuoi(String tuoi){
         this.tuoi=tuoi;
    }
    String getDiaChi(){
         return diachi;
    }
    void setDiaChi(String diachi){
         this.diachi=diachi;
    }
    double getLuong(){
         return luong;
    }
    void setLuong(double luong){
         this.luong=luong;
    }
    int getTongSoGioLam(){
         return tongsogiolam;
    }
    void setTongSoGioLam(int tongsogiolam){
         this.tongsogiolam=tongsogiolam;
    }
   void InputInfo() {
       Scanner sc=new Scanner(System.in);
       System.out.print("tên nhân viên:");
       ten=sc.nextLine();
        System.out.print("tuổi nhân viên:");
       tuoi=sc.nextLine();
        System.out.print("địa chỉ nhân viên:");
       diachi=sc.nextLine();
        System.out.print("lương nhân viên:");
       luong=sc.nextDouble();
        System.out.print("tổng số giờ làm nhân viên:");
       tongsogiolam=sc.nextInt();
   }
  void printInfo(){
  System.out.println("thông tin chi tiết nhân viên:");
   System.out.println("tên nhân viên:"+ten);
    System.out.println("tuổi nhân viên:"+tuoi);
     System.out.println("địa chỉ nhân viên:"+diachi);
      System.out.println("thông tin chi tiết nhân viên:"+luong);
      System.out.println("tổng số giờ làm nhân viên:"+tongsogiolam); 
       System.out.println("tiền thưởng nhân viên:"+tinhThuong());
        System.out.println("tổng lương nhân viên:"+(luong+tinhThuong()));
  }  
        double tinhThuong(){
            double thuong;
            if(tongsogiolam>=200)
                thuong=luong*0.2;
            else if(tongsogiolam>=100 && tongsogiolam<200)
                thuong=luong*0.1;
            else thuong=0;
            return thuong;
        }
}
    

