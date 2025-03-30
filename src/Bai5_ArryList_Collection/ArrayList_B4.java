package Bai5_ArryList_Collection;

import java.util.ArrayList;

public class ArrayList_B4 {
    public static void Tim_So_Chan() {// tao mang chua 26 so chan
        ArrayList<Integer> list = new ArrayList<>();
        // vong lap for de tim ra 26 so chan trong khoang 0-50
        for (int i = 0; i <= 50; i += 2) {
            list.add(i);
        }

        // duyet mang in ra so chan do
        System.out.println("cac so chan do la:");
        for (int j : list) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        Tim_So_Chan();
    }
}
