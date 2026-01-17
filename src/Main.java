import animal.Pajaro;
import animal.Perro;

public class Main {
    public static void main(String[] args){
        Perro tobi = new Perro();

        tobi.hacerSonido();
        tobi.dormir();

        Pajaro paj = new Pajaro();

        paj.volar();
    }
}
