public class Lingkaran {
    private final double pi = 3.14;
    private double luas;

    public void hitungluas(int radius){
        luas = pi*radius*radius;
        System.out.println("Luas lingkaran dengan radius " + radius + " adalah " + luas);
    }
}
