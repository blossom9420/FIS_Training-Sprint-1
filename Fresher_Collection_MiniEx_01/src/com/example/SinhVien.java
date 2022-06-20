package com.example;

import java.util.*;

public class SinhVien {
    private String mssv;
    private String ten;

    private Set<Diem> monDaHoc = new HashSet<Diem>();

    public SinhVien(String mssv, String ten) {
        this.mssv = mssv;
        this.ten = ten;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Set<Diem> getMonDaHoc() {
        return monDaHoc;
    }

    public void setMonDaHoc(Set<Diem> monDaHoc) {
        this.monDaHoc = monDaHoc;
    }

    public boolean themDiem(Diem diemMoi) {
        return this.monDaHoc.add(diemMoi);
    }

    //TODO Cau 1
    public double tinhDiemTrungBinh() {
        //Giong nhu cach tinh hien tai cua truong
        Integer sum = monDaHoc.stream().mapToInt(Diem::getDiemMonHoc).sum();
        Integer count = monDaHoc.stream().mapToInt(Diem::getSoTinChi).sum();
        //...
        return (double)sum/count;
    }



    //TODO Cau 2
    public String bangDiem() {
    /*
     MSSV : 0203044
     Ten  : Nguyen Van A
     Danh Sach Diem
     STT  Ten Mon             Diem       So Tin Chi
     1    Cau Truc Du Lieu 1  8          3
     2    Cau Truc Du Lieu 2  8          3
     Diem Trung Binh   8.0
    */
        //...
        //StringBuilder
        StringBuilder str =  new StringBuilder("");
        str.append("MSSV : " + this.mssv +"\n");
        str.append("Ten : " + this.ten +"\n");
        str.append("Danh Sach Diem\n");
        str.append("STT  Ten Mon \t \t \t Diem \t So Tin Chi\n");
        int i = 1;
        for (Diem diem: monDaHoc) {
            str.append(i+"\t "+ diem.getMon().getTen() +"\t  " +diem.getDiem() +"\t \t " +diem.getSoTinChi() +"\n");
            i++;
        }
        return str.toString();
    }


    //TODO Cau 3
    public String xepLoai() {
    /*
    Quy tac xep loai nhu sau
        DiemTB < 5 -> YEU
        DiemTB >= 5 va DiemTB < 6 -> TB
        DiemTB >= 6 va DiemTB < 7 -> TB-KHA
        DiemTB >= 7 va DiemTB < 8 -> KHA
        DiemTB >= 8 -> GIOI
    */
        if(tinhDiemTrungBinh()<5){
            return "YEU";
        }if(tinhDiemTrungBinh()<6){
            return "TB";
        }if(tinhDiemTrungBinh()<7){
            return "TB-KHA";
        }if(tinhDiemTrungBinh()<8){
            return "KHA";
        }if(tinhDiemTrungBinh()>=8){
            return "GIOI";
        }
        return null;
    }
}
