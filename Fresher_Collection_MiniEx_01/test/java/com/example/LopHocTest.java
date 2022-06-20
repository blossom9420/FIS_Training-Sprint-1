package com.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class LopHocTest {
    @Test
    void inDiem() {
        MonHoc mh1 = new MonHoc("Cau Truc Du Lieu ", 3, 1);
        MonHoc mh2 = new MonHoc("Lập trình hướng đối tượng", 3, 1);
        SinhVien sv1 = new SinhVien("SV01", "one");
        SinhVien sv2 = new SinhVien("SV02", "two");
        SinhVien sv3 = new SinhVien("SV03", "three");

        List<SinhVien> dsSinhVien = new ArrayList<>();
        dsSinhVien.add(sv1);
        dsSinhVien.add(sv2);
        dsSinhVien.add(sv3);


        for (int i = 0; i < dsSinhVien.size(); i++) {
            Set<Diem> listDiemSv = new HashSet<>();
            listDiemSv.add(new Diem(mh1, (int) (Math.random() * 10)));
            listDiemSv.add(new Diem(mh2, (int) (Math.random() * 10)));
            dsSinhVien.get(i).setMonDaHoc(listDiemSv);
        }

        LopHoc lopHoc = new LopHoc("LOP E1", "GV A");
        lopHoc.setDsLop(dsSinhVien);
        System.out.println(lopHoc.inDiem());

    }


    @Test
    void top10(){
        MonHoc mh1 = new MonHoc("Cau Truc Du Lieu ", 3, 1);
        MonHoc mh2 = new MonHoc("Lập trình hướng đối tượng", 3, 1);
        SinhVien sv1 = new SinhVien("SV01", "one");
        SinhVien sv2 = new SinhVien("SV02", "two");
        SinhVien sv3 = new SinhVien("SV03", "three");
        SinhVien sv4 = new SinhVien("SV04", "four");
        SinhVien sv5 = new SinhVien("SV05", "fine");
        SinhVien sv6 = new SinhVien("SV06", "six");
        SinhVien sv7 = new SinhVien("SV07", "seven");
        SinhVien sv8 = new SinhVien("SV08", "eight");
        SinhVien sv9 = new SinhVien("SV09", "nine");
        SinhVien sv10 = new SinhVien("SV10", "ten");
        SinhVien sv11 = new SinhVien("SV11", "eleven");
        SinhVien sv12 = new SinhVien("SV12", "twelve");

        List<SinhVien> dsSinhVien = new ArrayList<>();
        dsSinhVien.add(sv1);
        dsSinhVien.add(sv2);
        dsSinhVien.add(sv3);
        dsSinhVien.add(sv4);
        dsSinhVien.add(sv5);
        dsSinhVien.add(sv6);
        dsSinhVien.add(sv7);
        dsSinhVien.add(sv8);
        dsSinhVien.add(sv9);
        dsSinhVien.add(sv10);
        dsSinhVien.add(sv11);
        dsSinhVien.add(sv12);

        for (int i = 0; i < dsSinhVien.size(); i++) {
            Set<Diem> listDiemSv = new HashSet<>();
            listDiemSv.add(new Diem(mh1, (int) (Math.random() * 10)));
            listDiemSv.add(new Diem(mh2, (int) (Math.random() * 10)));
            dsSinhVien.get(i).setMonDaHoc(listDiemSv);
        }

        LopHoc lopHoc = new LopHoc("LOP E1", "GV A");
        lopHoc.setDsLop(dsSinhVien);

        List<SinhVien> listtop10 = new ArrayList<>();
        listtop10 = lopHoc.top10();
        lopHoc.setDsLop(listtop10);
        System.out.println(lopHoc.inDiem());

    }

    @Test
    void sinhVienYeu(){
        MonHoc mh1 = new MonHoc("Cau Truc Du Lieu ", 3, 1);
        MonHoc mh2 = new MonHoc("Lập trình hướng đối tượng", 3, 1);
        SinhVien sv1 = new SinhVien("SV01", "one");
        SinhVien sv2 = new SinhVien("SV02", "two");
        SinhVien sv3 = new SinhVien("SV03", "three");
        SinhVien sv4 = new SinhVien("SV04", "four");
        SinhVien sv5 = new SinhVien("SV05", "fine");
        SinhVien sv6 = new SinhVien("SV06", "six");
        SinhVien sv7 = new SinhVien("SV07", "seven");
        SinhVien sv8 = new SinhVien("SV08", "eight");
        SinhVien sv9 = new SinhVien("SV09", "nine");
        SinhVien sv10 = new SinhVien("SV10", "ten");
        SinhVien sv11 = new SinhVien("SV11", "eleven");
        SinhVien sv12 = new SinhVien("SV12", "twelve");

        List<SinhVien> dsSinhVien = new ArrayList<>();
        dsSinhVien.add(sv1);
        dsSinhVien.add(sv2);
        dsSinhVien.add(sv3);
        dsSinhVien.add(sv4);
        dsSinhVien.add(sv5);
        dsSinhVien.add(sv6);
        dsSinhVien.add(sv7);
        dsSinhVien.add(sv8);
        dsSinhVien.add(sv9);
        dsSinhVien.add(sv10);
        dsSinhVien.add(sv11);
        dsSinhVien.add(sv12);

        for (int i = 0; i < dsSinhVien.size(); i++) {
            Set<Diem> listDiemSv = new HashSet<>();
            listDiemSv.add(new Diem(mh1, (int) (Math.random() * 10)));
            listDiemSv.add(new Diem(mh2, (int) (Math.random() * 10)));
            dsSinhVien.get(i).setMonDaHoc(listDiemSv);
        }

        LopHoc lopHoc = new LopHoc("LOP E1", "GV A");
        lopHoc.setDsLop(dsSinhVien);

        List<SinhVien> listSvYeu = new ArrayList<>();
        listSvYeu = lopHoc.sinhVienYeu();
        lopHoc.setDsLop(listSvYeu);
        System.out.println(lopHoc.inDiem());
    }
}