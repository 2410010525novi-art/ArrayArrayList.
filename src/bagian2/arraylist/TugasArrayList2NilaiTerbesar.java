package bagian2.arraylist;

import java.util.ArrayList;
/*
 * Tugas ArrayList No. 2
 * Menentukan nilai terbesar
 * dari data yang tersimpan dalam ArrayList.
 */
public class TugasArrayList2NilaiTerbesar {

    public static void main(String[] args) {

        ArrayList<Integer> nilai = new ArrayList<>();

        nilai.add(70);
        nilai.add(95);
        nilai.add(60);
        nilai.add(88);
        nilai.add(75);

        int terbesar = nilai.get(0);

        for (int n : nilai) {

            if (n > terbesar) {
                terbesar = n;
            }
        }

        System.out.println("Data Nilai : " + nilai);
        System.out.println("Nilai Terbesar : " + terbesar);
    }
}