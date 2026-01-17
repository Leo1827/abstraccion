package animal;

public abstract class Animal {
    // metodo abstracto

    // En una clase abstracta pueden ir tanto metodos abstractos con metodos fijos
    public abstract void hacerSonido();

    public void dormir(){
        System.out.println("El animal esta durmiendo");
    }
}
