package modell;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Galeria extends KiallitasiTargy{
    
    private ArrayList<KiallitasiTargy> kTargy;

    public Galeria(String cim, String keszito) {
        super(cim, keszito);
    }
    
    public void felvesz(KiallitasiTargy targy) {
        kTargy.add(targy);
    }
    
    public void kepMegjelenit() {
        try (ObjectOutputStream ki = new ObjectOutputStream(new FileOutputStream("kep.png"))) {
            ki.writeObject(this);
            System.out.println("megjelenítés folyamatban...");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("nem lehet megjeleníteni...");
        }
    }
    
    public void jovobeliDatum() {
        
    }

}
