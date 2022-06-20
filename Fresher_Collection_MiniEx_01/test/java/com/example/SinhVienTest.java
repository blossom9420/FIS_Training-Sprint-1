package com.example;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienTest {

    public static int add(Diem a, Diem b) {
        return 1;
    }

    @Test
    void getDiemMonHoc(){
        MonHoc mh1 = new MonHoc("CTDL", 3 ,1);
        Diem d1 = new Diem(mh1, 9);
        int total = d1.getDiemMonHoc();
        System.out.println(total);
    }

    @Test
    void getSoTinChi(){
        MonHoc mh1 = new MonHoc("CTDL", 3 ,1);
        Diem d1 = new Diem(mh1, 9);
        int total = d1.getSoTinChi();
        System.out.println(total);
    }

    @Test
    void tinhDiemTrungBinhTest() {
        MonHoc mh1 = new MonHoc("CTDL", 3 ,1);
        MonHoc mh2 = new MonHoc("OOP", 3 ,1);
        Diem d1 = new Diem(mh1, 5);
        Diem d2 = new Diem(mh2, 5);

        List<Diem> listDiem = new ArrayList<>();
        listDiem.add(d1);
        listDiem.add(d2);

        Integer sum = listDiem.stream().mapToInt(Diem::getDiemMonHoc).sum();
        Integer count = listDiem.stream().mapToInt(Diem::getSoTinChi).sum();
        System.out.println( (float)sum/count);
    }

    @Test
    void tinhDiemTrungBinh() {

        // Arrangement
        SinhVien sv = new SinhVien("SV01", "LONG");

        MonHoc mh1 = new MonHoc("CTDL", 3 ,1);
        MonHoc mh2 = new MonHoc("OOP", 3 ,1);
        Diem d1 = new Diem(mh1, 5);
        Diem d2 = new Diem(mh2, 5);

        Set<Diem> listDiem = new HashSet<>();
        listDiem.add(d1);
        listDiem.add(d2);

        sv.setMonDaHoc(listDiem);

        // Action
        double avg = sv.tinhDiemTrungBinh();

        // Assert
        assertEquals(5.0, avg , 0.0001);
    }

    @Test
    void bangDiem(){
        // Arrangement
        SinhVien sv = new SinhVien("SV01", "LONG");

        MonHoc mh1 = new MonHoc("Cau Truc Du Lieu 1", 3 ,1);
        MonHoc mh2 = new MonHoc("Cau Truc Du Lieu 2", 3 ,1);
        Diem d1 = new Diem(mh1, 5);
        Diem d2 = new Diem(mh2, 7);

        Set<Diem> listDiem = new HashSet<>();
        listDiem.add(d1);
        listDiem.add(d2);

        sv.setMonDaHoc(listDiem);

        System.out.println( sv.bangDiem());
    }

    @Test
    void xepLoai(){
        SinhVien sv = new SinhVien("SV01", "LONG");

        MonHoc mh1 = new MonHoc("Cau Truc Du Lieu 1", 3 ,1);
        MonHoc mh2 = new MonHoc("Cau Truc Du Lieu 2", 3 ,1);
        Diem d1 = new Diem(mh1, 5);
        Diem d2 = new Diem(mh2, 7);

        Set<Diem> listDiem = new HashSet<>();
        listDiem.add(d1);
        listDiem.add(d2);

        sv.setMonDaHoc(listDiem);

        System.out.println( sv.xepLoai());
    }
}