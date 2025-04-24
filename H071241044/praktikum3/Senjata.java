// package H071241044.praktikum3;

public class Senjata {
    String nama;
    int kekuatan;

    public Senjata() {
        this.nama = "Cakar Biasa";
        this.kekuatan = 10;
    }

    public Senjata(String nama, int kekuatan) {
        this.nama = nama;
        this.kekuatan = kekuatan;
    }

    public int getKekuatan() {
        return kekuatan;
    }

    public String getNama() {
        return nama;
    }

    public void infoSenjata() {
        System.out.println("Senjata: " + nama + ", Kekuatan: " + kekuatan);
    }
}
