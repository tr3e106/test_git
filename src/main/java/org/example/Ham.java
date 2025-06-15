package org.example;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Ham {
    public static void main(String[] args) {
//            tenHam();
//
//            double diemToan = 6.5;
//            double diemLy = 7.3;
//            double diemHoa = 9.8;
//            double dtb = dtb(diemToan,diemLy,diemHoa);
//            System.out.println(dtb);
//    }
//    //Ham khong co gia tri tra ve(Ham logic)
//    static void tenHam(){
//     System.out.println("Hello world!!");
//    }
//
//    //Ham co gia tri tra ve
//    static double dtb(double diemToan, double diemLy, double diemHoa){
//        double dtb = (diemToan + diemLy + diemHoa)/3;
//        return dtb;

//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap so gio lam: ");
//        int tongGio = scanner.nextInt();
//        System.out.println("Nhap luong mot ngay: ");
//        int luongNgay = scanner.nextInt();
//        int tongLuong = tinhTongLuong(tongGio,luongNgay);
//        System.out.println("Tong luong: "+tongLuong);
//    }
//    static int tinhTongLuong(int tongGio, int luongNgay){
//        int tongLuong = tongGio * luongNgay;
//        return tongLuong;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so diem mon Toan: ");
        int diemToan = scanner.nextInt();
        System.out.println("Nhap so diem mon Ly: ");
        int diemLy = scanner.nextInt();
        System.out.println("Nhap so diem mon Hoa: ");
        int diemHoa = scanner.nextInt();
        int dtb = dtb(diemToan, diemLy, diemHoa);
        System.out.println("Diem trung binh 3 mon: "+dtb);
        xepLoai(dtb);

    }
    static int dtb(int diemToan, int diemLy, int diemHoa){
        int dtb = (diemLy + diemHoa + diemToan) /3;
        return dtb;
    }
    static void xepLoai(int dtb){
        if (dtb <= 5) System.out.println("Hoc sinh xep loai yeu");
        else if (dtb <= 6) System.out.println("Hoc sinh xep loai tb");
        else if (dtb <= 7) System.out.println("Hoc sinh xep loai kha");
        else if (dtb <= 8) System.out.println("Hoc sinh xep loai gioi");
        else if (dtb <=10) System.out.println("Hoc sinh xep loai xuat sac");
        }
    }

