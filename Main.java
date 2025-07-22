public class Main {
    public static void main(String[] args) {
        Gatto gatto = new Gatto();
        Animale animaleGenerico = new Animale();
        gatto.faiIlVerso();
        animaleGenerico.faiIlVerso();
    }
}

class Gatto extends Animale {
    public void faiIlVerso() {
        System.out.println("Miao!");
    }
}

class Animale {
    public void faiIlVerso() {
        System.out.println("L'animale fa un verso generico.");
    }
}