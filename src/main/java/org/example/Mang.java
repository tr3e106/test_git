package org.example;

public class Mang {
    public static void main(String[] args){
        //Khởi tạo giá trị
        int [] numbers = {1,2,3,4,5};
        String[] name = {"Tri","Thuong","Tuyet","Khang"};
        System.out.println(name[0]);
        name[0] = "Tuan";
        System.out.println((name[0]));
        // Chiều dài mảng
        int length = name.length;
        System.out.println("Chieu dai mang: " + length);

        //Duyệt mảng
        for (int i = 0; i < name.length; i ++)
        {
            System.out.println("Ten thu " + (i+1) + ": " +name[i]);
        }

        //Duyệt mảng dùng vòng lặp for-each
        for (int number : numbers){
            System.out.println(number);
        }

        //Duyệt mảng ngược
        for (int index = numbers.length -1 ; index >=0; index --){
            System.out.println(numbers[index]);
        }
    }
}
