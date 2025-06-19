class Alamat {
	String jalan;
	String kota;

	public String toString() {
		return jalan + ", " + kota;
	}
}

class Mahasiswa {
	String nama;
	String nim;
	Alamat alamat;

	public String getNama() {
		return nama;
	}

	public String getNim() {
		return nim;
	}

	public String getAlamat() {
		return alamat.toString();
	}
}

public class Main1 {
	public static void main(String[] args) {
		Alamat alamat = new Alamat();
		Mahasiswa mahasiswa = new Mahasiswa();

		alamat.jalan		= "Tamalanrea Indah";
		alamat.kota			= "Makassar";
		mahasiswa.nama		= "Chandra Andaya";
		mahasiswa.nim		= "H071241044";
		mahasiswa.alamat	= alamat;

		System.out.println("Nama: " + mahasiswa.nama);
		System.out.println("NIM: " + mahasiswa.nim);
		System.out.println("Alamat: " + mahasiswa.alamat);
	}

}