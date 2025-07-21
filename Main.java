public class Main {
    public static void main(String[] args) {
        Animale animaleGenerico = new Animale();
        Gatto gatto = new Gatto();

        animaleGenerico.faiIlVerso();  // Output: L'animale fa un verso generico.
        gatto.faiIlVerso();            // Output: Miao!
    }
}