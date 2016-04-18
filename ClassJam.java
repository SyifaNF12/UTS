package jam;

public class ClassJam {
    int hh, mm, dd;

    public ClassJam() {
    }
        public ClassJam(int hh, int mm, int dd) {
        this.hh = hh;
        this.mm = mm;
        this.dd = dd;
    }

    public int getHh() {
        return hh;
    }

    public void setHh(int hh) {
        this.hh = hh;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    int convertJamToMenit (int hh){
        int mm;
        mm = hh * 60;
        return mm;
    }
    int convertJamToDetik(int jam){
        int detik;
        detik = jam * 3600;
        return detik;
    }
    int convertMenitToDetik(int menit){
        int detik;
        detik = menit * 60;
        return detik;
    }
    
}


