package Bai2_Method_DataType;

public class Calculator {

    // ham tinh tong 2 so nguyen
    static int tong_2_so_nguyen(int a, int b) {
        return a + b;
    }

    // ham tinh tich 2 so thuc
    static double tich_2_so_thuc(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        int tong = tong_2_so_nguyen(3, 4);
        double tich = tich_2_so_thuc(2.5, 3.5);
        System.out.println("Tong 2 so nguyen la:" + tong);
        System.out.println("Tich 2 so thuc la:" + tich);

    }
}


