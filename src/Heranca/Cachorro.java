package Heranca;

public class Cachorro extends Animal{
    @Override
    public void comunicar() {
        System.out.println("Latir");
    }

    @Override
    public void movimentar() {
        System.out.println("Andar");
    }
}
