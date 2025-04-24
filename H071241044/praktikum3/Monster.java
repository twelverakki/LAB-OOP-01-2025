// package H071241044.praktikum3;

class Monster {
	String nama;
	int hp;
	Senjata senjata;

	public Monster() {
		this.nama = "Monster Tanpa Nama";
		this.hp = 100;
		this.senjata = new Senjata();
	}

	public Monster(String nama, int hp, Senjata senjata) {
		this.nama = nama;
		this.hp = hp;
		this.senjata = senjata;
	}


	public void info() {
		System.out.println("Nama: " + nama);
		System.out.println("HP: " + hp);
		senjata.infoSenjata();
	}


	public void serang(Monster target) {
		int damage = this.senjata.getKekuatan();
		System.out.println(this.nama + " menyerang " + target.nama + " dengan " + senjata.getNama() + " sebesar " + damage + " damage!");
		target.hp -= damage;
		if (target.hp < 0) target.hp = 0;
		System.out.println(target.nama + " sekarang punya HP: " + target.hp);
	}

}