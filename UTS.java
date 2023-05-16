package shaniakuntumkhaira;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

public class Tes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String DaftarAngka = scanner.nextLine();
        System.out.print("Masukkan daftar angka yang unik : ");

        List<Integer> Angka = new ArrayList<>();
        Set<Integer> AngkaUnik = new HashSet<>();

        for (String token : DaftarAngka.split("\\s+")) {
            int nmr = Integer.parseInt(token);
            Angka.add(nmr);
            AngkaUnik.add(nmr);
        }
        for (int nmr : AngkaUnik) {
            int hitung = Collections.frequency(Angka, nmr);
            if (hitung > 1) {
                System.out.println(nmr + " ada " + hitung);
            }
        }
    }
}
