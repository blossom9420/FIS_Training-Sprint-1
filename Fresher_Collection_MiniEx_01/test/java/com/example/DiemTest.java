package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiemTest {

    @Test
    void getMon() {
        MonHoc monHoc = new MonHoc("CTDL",3,1);
        Diem diem = new Diem(monHoc, 10);
        assertEquals(monHoc, diem.getMon());
    }

    @Test
    void getDiem() {
        MonHoc monHoc = new MonHoc("CTDL",3,1);
        Diem diem = new Diem(monHoc, 10);
        assertEquals(10, diem.getDiem());
    }


}