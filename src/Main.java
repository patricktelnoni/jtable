public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world from main class");

        Lingkaran lingkaran = new Lingkaran();
        Persegi persegi     = new Persegi();

        lingkaran.hitungluas(5);
        System.out.println("Hasil perhitungan luas lingkaran adalah " + lingkaran.getLuas());
        persegi.hitungluas(5);
    }
}
