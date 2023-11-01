package org.example.day4;

public class Motorbike {
    public String Hang;
    public String Mau;
    public String BienSo;
    public String NgayDangKy;

    public void InRa() {
        System.out.printf("Hang" + Hang + "Mau :" + Mau + "Bien : " + BienSo + "Ngay Dang Ky : " + NgayDangKy);
    }

    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike();
        motorbike.Hang = "Honda";
        motorbike.Mau = "Xanh";
        motorbike.BienSo = "123";
        motorbike.NgayDangKy = "14/9/2023";
        motorbike.InRa();
    }
}
