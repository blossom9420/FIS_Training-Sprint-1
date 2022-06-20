package com.example;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LopHoc {
    private String ten;
    private String giaoVien;
    private List<SinhVien> dsLop = new ArrayList<SinhVien>();

    public LopHoc(String ten, String giaoVien) {
        this.ten = ten;
        this.giaoVien = giaoVien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(String giaoVien) {
        this.giaoVien = giaoVien;
    }

    public List<SinhVien> getDsLop() {
        return dsLop;
    }

    public void setDsLop(List<SinhVien> dsLop) {
        this.dsLop = dsLop;
    }

    public boolean them(SinhVien svMoi) {
        return dsLop.add(svMoi);
    }

    //TODO Cau 4
    public String inDiem() {
    /*
    Danh Sach Diem Lop : ten
    Giao Vien Chu Nhiem : giaoVien
    STT      MSSV        Ten              Diem TB   XepLoai
    1        123456      Nguyen Van A     8.4       GIOI
    2        678919      Nguyen Van B     6         TB-KHA
    3        112456      Nguyen Van C     7         KHA
    */
        StringBuilder strlop =  new StringBuilder("");
        strlop.append("Danh Sach Diem Lop : " + this.ten +"\n");
        strlop.append("Giao Vien Chu Nhiem : " + this.giaoVien +"\n");
        strlop.append("STT  MSSV \t Ten \t  Diem TB  Xep Loai\n");
        int i = 1;
        for (SinhVien sinhVien: dsLop ) {
            strlop.append(i+"\t "+ sinhVien.getMssv() +"\t " +sinhVien.getTen() +"\t   " +sinhVien.tinhDiemTrungBinh() );
            strlop.append("\t\t " +sinhVien.xepLoai() +"\n");
            i++;
        }
        return strlop.toString();
    }

    //TODO Cau 5
    public List<SinhVien> top10() {
        //Tra ve danh sach 10 sinh vien co diem trung binh lon nhat lop
        List<SinhVien> list1ASC = dsLop.stream()
                .sorted( new ComparatorCustom() )
                .collect(Collectors.toList());
        List<SinhVien> list1DESC = dsLop.stream()
                .sorted((o1, o2) -> (int) (o1.tinhDiemTrungBinh()- o2.tinhDiemTrungBinh()))
                .collect(Collectors.toList());
        List<SinhVien> list2ASC= dsLop.stream().sorted(Comparator.comparingDouble(SinhVien::tinhDiemTrungBinh))
                .collect(Collectors.toList());
        List<SinhVien> list2DESC= dsLop.stream().sorted(Comparator.comparingDouble(SinhVien::tinhDiemTrungBinh).reversed())
                .collect(Collectors.toList());
        return list1ASC;
    }

    //TODO Cau 6
    public List<SinhVien> sinhVienYeu() {
        //Tra ve danh sach vien vien xep loai YEU
        //...

        List<SinhVien> list= dsLop.stream().filter(sinhVien -> "YEU".equals(sinhVien.xepLoai()))
                .collect(Collectors.toList());
        if(list.isEmpty()){
            return new ArrayList<>();
        }
        return list;
    }


}

class ComparatorCustom implements Comparator<SinhVien> {
    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        long roundDESC = Math.round(o2.tinhDiemTrungBinh() - o1.tinhDiemTrungBinh());
        long roundASC = Math.round(o1.tinhDiemTrungBinh() - o2.tinhDiemTrungBinh());
        return (int) roundDESC;
    }
}