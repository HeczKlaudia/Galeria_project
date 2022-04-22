package modell;

import java.text.Collator;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

class KialltiasiTargyComparator implements Comparator<KiallitasiTargy> {
    @Override
    public int compare(KiallitasiTargy t1, KiallitasiTargy t2) {
        Collator col = Collator.getInstance();
        return col.compare(t1.getKeszito(), t2.getKeszito());
    }
}

public abstract class KiallitasiTargy implements Comparable<KiallitasiTargy>{
    
    private String cim, keszito;
    private Date datum;
    
    public KiallitasiTargy(String cim, String keszito) {
        this.datum = new Date();
        this.cim = cim;
        this.keszito = keszito;
    }

    public KiallitasiTargy(String cim, String keszito, Date datum) {
        this(cim, keszito);
        this.datum = datum;
    }
  
    public String getCim() {
        return cim;
    }

    public String getKeszito() {
        return keszito;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.cim);
        hash = 37 * hash + Objects.hashCode(this.keszito);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final KiallitasiTargy other = (KiallitasiTargy) obj;
        if (!Objects.equals(this.cim, other.cim)) {
            return false;
        }
        if (!Objects.equals(this.keszito, other.keszito)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "KiallitasiTargy{" + "cim=" + cim + ", keszito=" + keszito + '}';
    }
    
    @Override
    public int compareTo(KiallitasiTargy k) {
        return cim.compareTo(k.cim);
    }
}
