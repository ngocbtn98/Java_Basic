package Bai5_ArryList_Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Colllection {
    static List<String> list_Nhan_Vien = new ArrayList<>();
    static Map<String, String> list_Nhan_Vien_2 = new HashMap<String, String>();

    public static void Info_Nhan_Vien() {
        // dùng arraylist
        list_Nhan_Vien.add("Nhu Ngoc");
        list_Nhan_Vien.add("27");
        list_Nhan_Vien.add("phong QC");
        System.out.println("Thong tin nhan vien 1 la: ");

    }

    public static void Info_Nhan_Vien_2() {
        //dùng hashmap
        list_Nhan_Vien_2.put("Ten NV", "Nhu Ngoc");
        list_Nhan_Vien_2.put("Tuoi NV", "27");
        list_Nhan_Vien_2.put("Phong ban", "QC");
        System.out.println("Thong tin nhan vien 2 la: ");
    }

    public static void main(String[] args) {
        Info_Nhan_Vien();
        //dùng for cơ bản
        for (int i = 0; i < list_Nhan_Vien.size(); i++) {
            System.out.println(list_Nhan_Vien.get(i));
        }
        Info_Nhan_Vien_2();
        for (Map.Entry<String, String> entry : list_Nhan_Vien_2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
