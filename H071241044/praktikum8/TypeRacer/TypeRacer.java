package TypeRacer;

import java.util.ArrayList;
import java.util.Random;
import java.util.Comparator;

public class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> rareContestant = new ArrayList<>();
    private ArrayList<Result> typeRaceTabel = new ArrayList<>();
    public long startTime;

    public String getWordsToType() {
        return wordsToType;
    }

    public ArrayList<Typer> getRareContestant() {
        return rareContestant;
    }

    // Bisa diganti sesuai keinginan masing-masing
    private String[] wordsToTypeList = {
        "Di tengah kota ada si Tikus Remy, dia pandai masak dan selalu penuh kreasi.",
        "Menjadi koki hebat di restoran yang ramai, masakan lezat buat pengunjung bahagia.",
        "Ayo bersama-sama ingat nama-nama tokoh yang ada di cerita yang penuh warna.",
        "Namun ada juga si Pinguin Skipper, cerdik sekali, namun sedikit galak.",
        "Tinggal di markas bawah tanah, sering merencanakan misi penuh tantangan."
    };

    public void setNewWordsToType() {
        Random random = new Random();
        int angkaRandom = random.nextInt(wordsToTypeList.length);
        wordsToType = wordsToTypeList[angkaRandom];
    }

    // TODO (4)
    // Buat method addResult yang mana digunakan untuk menambahkan typer yang
    // telah selesai (mengetik semua kata), ke dalam list race standing.
    public synchronized void addResult(Result result) {
        typeRaceTabel.add(result);
    }

    private void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("=========================\n");

        // TODO (5)
        // Tampilkan klasemen akhir dari kompetisi, dengan format
        // {posisi}. {nama} = {waktu penyelesaian dalam detik} detik
        typeRaceTabel.sort(Comparator.comparingInt(Result::getFinishTime));
        int posisi = 1;
        for (Result result : typeRaceTabel) {
            System.out.println(posisi + ". " + result.getName() + " = " + result.getFinishTime() + " detik");
            posisi++;
        }
    }

    public void startRace() {
        // TODO (6)
        // Jalankan kompetisi untuk tiap kontestan
        for (Typer typer : rareContestant) {
            typer.start();
        }
        startTime = System.currentTimeMillis();
    }

    // TODO (7)
    // selama semua peserta belum selesai maka tampilkan typing progress-nya setiap
    // 2 detik, dengan format:
    // Typing Progress ...
    // ===================
    // {nama kontestan} => {text yang telah dia ketik}
    // {nama kontestan} => {text yang telah dia ketik}
    // {nama kontestan} => {text yang telah dia ketik}
    public void displayRaceStandingPeriodically() throws InterruptedException {
        while (true) {
            boolean allDone = true;
            System.out.println("Typing Progress...");
            System.out.println("===================");
            ArrayList<Typer> contestantsCopy = new ArrayList<>(rareContestant); // Salinan untuk aman
            for (Typer typer : contestantsCopy) {
                System.out.println(typer.getBotName() + " => " + typer.getWordsTyped());
                if (!typer.getWordsTyped().contains("(Selesai)")) {
                    allDone = false;
                }
            }
            System.out.println();
            if (allDone) {
                break;
            }
            Thread.sleep(2000);
        }

        // TODO (8)
        // Setelah semua typer selesai, tampilkan race standing setelah semua typer
        // selesai
        printRaceStanding();
    }
}
