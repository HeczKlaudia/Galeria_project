package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import modell.Galeria;
import modell.KiallitasiTargy;

public class GaleriaProjekt {

    public static void main(String[] args) throws IOException {
        
        Galeria g1 = new Galeria("cím1", "Antal István");
        Galeria g2 = new Galeria("cím1", "Antal István");
        
        List<String> kep = Files.readAllLines(Paths.get("../res/kep.txt"));
        
        List<KiallitasiTargy> ktargyak = new ArrayList<>();
        Collections.sort(ktargyak);
        for (KiallitasiTargy targy : ktargyak) {
            System.out.println(targy);
        }
        
    }
    
}
