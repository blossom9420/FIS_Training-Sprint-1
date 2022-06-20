package com.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MonHocTest {

    @Test
    void testEquals() {
        MonHoc monHoc1 = new MonHoc("CTDL",3,1);
        MonHoc monHoc2 = new MonHoc("CTDL",3,1);
        assertTrue(monHoc1.equals(monHoc2));
    }

    @Test
    void getTen() {
        MonHoc monHoc = new MonHoc("CTDL",3,1);
        assertEquals("CTDL",monHoc.getTen());
        assertNotEquals("ctdl",monHoc.getTen());

        monHoc = new MonHoc(null,3,1);
        assertNull(monHoc.getTen());
    }

    @Test
    void getTcLT() {
    }

    @Test
    void getTcTH() {
    }

    @Test
    void testEquals1() {
    }

    @Test
    void testLamdaCollectionWithStream() {
        MonHoc monHoc1= new MonHoc("CTDL",3,1);
        MonHoc monHoc2 = new MonHoc("CTDL3",3,1);
        List<MonHoc> list = new ArrayList<MonHoc>();
        list.add(monHoc1);
        list.add(monHoc2);

//       list.forEach(mh->{
//           System.out.println(mh.getTen());
//       });
        Stream<MonHoc> monHocStream =   list.stream().filter(mh->{
            if(mh.getTcLT()>= 3) return true;
            else return false;
        }).filter(mh->{
            if(mh.getTcTH()>=1) return true;
            else return false;
        });

        System.out.println(monHocStream.count());
        System.out.println(monHocStream.toList()); // báo lỗi luôn, vì khi sử dụng stream.count là stream đã dùng => hết
        System.out.println(monHocStream.count());
    }

    @Test
    void testLamdaCollectionWithList() {
        MonHoc monHoc1= new MonHoc("CTDL",3,1);
        MonHoc monHoc2 = new MonHoc("CTDL3",3,1);
        List<MonHoc> list = new ArrayList<MonHoc>();
        list.add(monHoc1);
        list.add(monHoc2);

        // viết vòng lặp
        List<MonHoc> listAfterStream  =   list.stream().filter(mh->{
            if(mh.getTcLT()>= 3) return true;
            else return false;
        }).filter(mh->{
            if(mh.getTcTH()>=1) return true;
            else return false;
        }).toList();
        // end vòng lặp

        System.out.println(listAfterStream.size());
        System.out.println(listAfterStream); // ko báo lỗi như stream vì nó là list
        System.out.println(listAfterStream.size());
    }

    @Test
    void testLamdaCollectionWithMap() {
        MonHoc monHoc1= new MonHoc("CTDL",3,1);
        MonHoc monHoc2 = new MonHoc("CTDL3",3,1);
        List<MonHoc> list = new ArrayList<MonHoc>();
        list.add(monHoc1);
        list.add(monHoc2);

        // có thể biến MOnHoc thanh sinh vien cung dc
//        list.stream().map(new Function<MonHoc, Object>() {
//            @Override
//            public Object apply(MonHoc monHoc){
//                MonHoc newMonHoc = new MonHoc(monHoc.getTen(),monHoc.getTcLT(),monHoc.getTcTH());
//                return newMonHoc;
//            }
//        }).forEach(MonHoc::printMonHoc());


    }
}