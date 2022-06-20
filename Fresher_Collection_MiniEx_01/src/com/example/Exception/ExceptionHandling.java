package com.example.Exception;

public class ExceptionHandling {


    public static void main(String[] args) {
        /** TASK 1
        try{
            Thread.sleep(1000);
            Integer i  = Integer.valueOf("abc");
        } catch (InterruptedException e){        // if ( e instanceof InterruptedException )
            System.out.println("Lỗi thread");
        }catch (NumberFormatException e){
            System.out.println("Lỗi integer");
        }catch ( NullPointerException e){
            System.out.println("Có giá trị bị null");
        }finally {
            System.out.println("Luôn luôn thực hiện dù có lỗi hay ko");
        }
         */


        String x = testTryCatch();
        System.out.println(x);
    }

    public static String testTryCatch(){
        try{
            return "1";
        }catch (Exception e){
            return "2";
        }finally {
            return "3";
        }
    }
}
