package Bai3_Toan_Tu_If_Else;

public class ToanTu {


    public void thuc_hien_toan_tu() {
        //khai bao 3 bien bat ky
        int a = 3;
        int b = 5;
        int c = 7;
        //toan tu quan he
        System.out.println("a > b: " + (a > b));
        System.out.println("b < c: " + (b < c));
        System.out.println("a == c: " + (a == c));
        //toan tu logic
        System.out.println("(a > b) && (b < c): " + ((a > b) && (b < c)));
        System.out.println("(a > b) || (b > c): " + ((a > b) || (b > c)));
    }

    public void kiem_tra_so(int n) {
        int number =100;
        if (n == number) {
            System.out.println("TH1: n == number");
        } else if (n < number) {
            System.out.println("TH2: n < number");
        } else {
            System.out.println("TH3: n > number");
        }
    }

    public static void main(String[] args) {
        ToanTu toantu = new ToanTu();
        toantu.thuc_hien_toan_tu();
        toantu.kiem_tra_so(100);
        toantu.kiem_tra_so(10);
        toantu.kiem_tra_so(101);
    }
}
