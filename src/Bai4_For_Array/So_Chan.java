package Bai4_For_Array;

public class So_Chan {
    public static void Tim_So_Chan() {
        int index = 0;
        // tao mang chua 26 so chan
        int[] arr = new int[26];

        // vong lap for de tim ra 26 so chan trong khoang 0-50
        for (int i = 0; i <= 50; i += 2) {
            arr[index] = i;//gan gia tri so chan vao mang
            index++;
        }
        // duyet mang in ra so chan do
        System.out.println("cac so chan do la:");
        for (int j : arr) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        Tim_So_Chan();
    }
}

