public class Main {
    public static void main(String[] args) {
        Senjata pedang = new Senjata("Pedang Es", 25);
        Senjata senjata2 = new Senjata();
        Monster m1 = new Monster("Frostfang", 120, pedang);
        Monster m2 = new Monster("no name", 200, senjata2);
        m1.info();
        System.out.println();
        m1.serang(m2);
    }
}