package Bai1_Variables;

 public class SinhVien {
        //khai bao bien instance
        String maSV = "001";
        //khai bao bien static
        static String ten = "Nhu Ngoc";

    public static void main(String[] args) {
        //khai bao bien local
        int tuoi = 27;

        //in bien local
        System.out.println(tuoi);
        //in bien instance
        SinhVien sinhvien = new SinhVien();
        System.out.println(sinhvien.maSV);
        //in bien static
        System.out.println(ten);

        //in bien static o class thong tin
        System.out.println(ThongTin.lop);
        System.out.println(ThongTin.giao_vien);

    }
}
